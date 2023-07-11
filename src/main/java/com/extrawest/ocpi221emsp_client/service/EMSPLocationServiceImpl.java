package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.AbstractDomainObject;
import com.extrawest.ocpi.model.dto.LocationDTO;
import com.extrawest.ocpi.service.EMSPLocationService;
import org.springframework.stereotype.Service;

@Service
public class EMSPLocationServiceImpl implements EMSPLocationService {
    @Override
    public AbstractDomainObject getLocationEvseController(String countryCode, String party_id, String locationId, String evseUid, String connectorId) {
        return null;
    }

    @Override
    public void pushLocation(LocationDTO locationDTO, String countryCode, String party_id, String locationId, String evseUid, String connectorId) {

    }

    @Override
    public void patchLocation(LocationDTO locationDTO, String countryCode, String party_id, String locationId, String evseUid, String connectorId) {

    }
}
