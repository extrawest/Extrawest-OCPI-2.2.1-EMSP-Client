package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.TariffDTO;
import com.extrawest.ocpi.service.EMSPTariffService;
import org.springframework.stereotype.Service;

@Service
public class EMSPTariffServiceImpl implements EMSPTariffService {
    @Override
    public TariffDTO getTariff(String countryCode, String partyId, String tariffId) {
        return null;
    }

    @Override
    public void saveTariff(TariffDTO tariffDTO, String countryCode, String partyId, String tariff_id) {

    }

    @Override
    public void deleteTariff(String countryCode, String partyId, String tariff_id) {

    }
}
