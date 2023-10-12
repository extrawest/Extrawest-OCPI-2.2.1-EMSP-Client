package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.TariffDTO;
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
    public TariffDTO getTariff(String countryCode, String partyId, String tariffId) {
        TariffModel tariffDocument = tariffRepository.findByIdAndCountryCodeAndPartyId(tariffId, countryCode, partyId)
                .orElseThrow(() -> new OcpiResourceNotFoundException(String.format("Tariff %s for party %s, operates in %s, was not found",
                        tariffId, partyId, countryCode)));

        TariffDTO tariffDTO = tariffDocumentMapper.toTariffDTO(tariffDocument);

        return tariffDTO;
    }

    @Override
    public TariffDTO saveTariff(TariffDTO tariffDTO, String countryCode, String partyId, String tariffId) {
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


//    Map<String, TariffDTO> tariffDTOList = new HashMap<>();
//
//    @Override
//    public TariffDTO getTariff(String countryCode, String partyId, String tariffId) {
//        return tariffDTOList.get(tariffId);
//    }
//
//    @Override
//    public void saveTariff(TariffDTO tariffDTO, String countryCode, String partyId, String tariffId) {
//        tariffDTOList.put(tariffId, tariffDTO);
//    }
//
//    @Override
//    public boolean deleteTariff(String countryCode, String partyId, String tariff_id) {
//        TariffDTO remove = tariffDTOList.remove(tariff_id);
//        return remove != null;
//    }
}
