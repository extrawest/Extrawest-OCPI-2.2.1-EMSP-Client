package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.LocationDTO;
import com.extrawest.ocpi.model.vo.Connector;
import com.extrawest.ocpi.model.vo.Evse;
import com.extrawest.ocpi.model.vo.LocationData;
import com.extrawest.ocpi.service.EMSPLocationService;
import com.extrawest.ocpi221emsp_client.mapper.LocationMapper;
import com.extrawest.ocpi221emsp_client.model.LocationModel;
import com.extrawest.ocpi221emsp_client.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EMSPLocationServiceImpl implements EMSPLocationService {
    @Autowired
    private final LocationRepository locationRepository;
    @Autowired
    private final LocationMapper locationMapper;

    @Override
    public LocationDTO getLocation(String countryCode, String partyId, String locationId) {
        LocationModel locationModel = locationRepository.findByIdAndCountryCodeAndPartyId(locationId, countryCode, partyId)
                .orElseThrow(() -> new OcpiResourceNotFoundException(String.format("Location %s for party %s, operates in %s, was not found",
                        locationId, partyId, countryCode)));
        return locationMapper.toDto(locationModel);
    }

    @Override
    public Evse getEvse(String countryCode, String partyId, String locationId, String evseUid) {
        LocationDTO location = getLocation(countryCode, partyId, locationId);
        Evse evseModel = location.getEvses().stream().filter(e -> e.getUid().equals(evseUid)).findFirst().orElseThrow(() ->
                new OcpiResourceNotFoundException(String.format("EVSE %s for location %s with party %s, operates in %s, was not found",
                        evseUid, location.getId(), partyId, countryCode)));
        return evseModel;
    }

    @Override
    public Connector getConnector(String countryCode, String partyId, String locationId, String evseUid, String connectorId) {
        Evse evse = getEvse(countryCode, partyId, locationId, evseUid);
        Connector connectorModel = evse.getConnectors().stream().filter(connector -> connector.getConnectorId().equals(connectorId)).findFirst().orElseThrow(() ->
                new OcpiResourceNotFoundException(String.format("Connector %s for evse %s in location %s with party %s, operates in %s, was not found",
                        connectorId, evse.getUid(), locationId, partyId, countryCode)));
        return connectorModel;

    }

    @Override
    public LocationDTO pushLocation(LocationDTO locationDTO, String countryCode, String partyId, String locationId) {
        LocationModel model = locationMapper.toModel(locationDTO);
        LocationModel saved = locationRepository.save(model);
        return locationMapper.toDto(saved);
    }

    @Override
    public Evse pushEvse(Evse evse, String countryCode, String partyId, String locationId, String evseUid) {
        LocationDTO location = getLocation(countryCode, partyId, locationId);

        location.getEvses().replaceAll(e -> e.getUid().equals(evseUid) ? evse : e);
        locationRepository.save(locationMapper.toModel(location));
        return location.getEvses().stream().filter(e -> e.getUid().equals(evseUid)).findFirst().orElseThrow();
    }

    @Override
    public Connector pushConnector(Connector connector, String countryCode, String partyId, String locationId, String evseUid, String connectorId) {
        return null;
    }

    @Override
    public LocationData patchLocation(LocationDTO locationDTO, String countryCode, String partyId, String locationId, String evseUid, String connectorId) {
        return null;
    }
}
