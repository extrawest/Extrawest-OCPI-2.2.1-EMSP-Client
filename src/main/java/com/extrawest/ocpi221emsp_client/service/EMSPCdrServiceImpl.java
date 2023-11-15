package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.exception.OcpiGeneralClientException;
import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.CdrDTO;
import com.extrawest.ocpi.service.EMSPCdrService;
import com.extrawest.ocpi221emsp_client.mapper.CdrMapper;
import com.extrawest.ocpi221emsp_client.model.CdrModel;
import com.extrawest.ocpi221emsp_client.repository.CdrRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EMSPCdrServiceImpl implements EMSPCdrService {
    @Autowired
    private final CdrRepository cdrRepository;
    @Autowired
    private final CdrMapper cdrMapper;

    @Override
    public CdrDTO getCdr(String id) {
        CdrModel cdrModel = cdrRepository.findById(id)
                .orElseThrow(() ->
                        new OcpiResourceNotFoundException(String.format("Cdr for url %s, was not found", id)));
        CdrDTO cdrDTO = cdrMapper.toDto(cdrModel);
        return cdrDTO;
    }

    @Override
    public String postCdr(CdrDTO cdrDTO) {
        try {
            getCdr(cdrDTO.getId());
        } catch (OcpiResourceNotFoundException ex) {
            log.info("Cdr not exists, can be created");
            CdrModel cdrModel = cdrMapper.toModel(cdrDTO);
            CdrModel saved = cdrRepository.save(cdrModel);
            return saved.getId();
        }

        throw new OcpiGeneralClientException(String.format("Cdr id=%s has already existed, can not be updated. " +
                "Please provide Credit CDR", cdrDTO.getId()));
    }
}
