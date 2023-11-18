package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.TariffDto;
import com.extrawest.ocpi.service.EMSPTariffService;
import com.extrawest.ocpi221emsp_client.mapper.TariffDocumentMapper;
import com.extrawest.ocpi221emsp_client.model.TariffModel;
import com.extrawest.ocpi221emsp_client.repository.TariffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EMSPTariffServiceImpl implements EMSPTariffService {
    @Autowired
    private final TariffRepository tariffRepository;
    @Autowired
    private final TariffDocumentMapper tariffDocumentMapper;

    @Override
    public TariffDto getTariff(String countryCode, String partyId, String tariffId) {
        TariffModel tariffDocument = tariffRepository.findByIdAndCountryCodeAndPartyId(tariffId, countryCode, partyId)
                .orElseThrow(() -> new OcpiResourceNotFoundException(String.format("Tariff %s for party %s, operates in %s, was not found",
                        tariffId, partyId, countryCode)));

        return tariffDocumentMapper.toTariffDTO(tariffDocument);
    }

    @Override
    public TariffDto saveTariff(TariffDto tariffDTO, String countryCode, String partyId, String tariffId) {
        TariffModel tariffDocument = tariffDocumentMapper.toTariffDocument(tariffDTO);
        TariffModel saved = tariffRepository.save(tariffDocument);
        return tariffDocumentMapper.toTariffDTO(saved);
    }

    @Override
    public void deleteTariff(String countryCode, String partyId, String tariffId) {
        Optional<TariffModel> tariffDocument = tariffRepository.deleteByIdAndCountryCodeAndPartyId(tariffId, countryCode, partyId);
        if (tariffDocument.isEmpty()) {
            throw new OcpiResourceNotFoundException(String.format("Tariff %s for party %s, operates in %s, was not found",
                    tariffId, partyId, countryCode));
        }
    }
}
