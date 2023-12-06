package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.location.Connector;
import com.extrawest.ocpi.model.dto.location.EVSE;
import com.extrawest.ocpi.model.dto.location.Location;
import com.extrawest.ocpi.model.markers.LocationData;
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
    public Location getLocation(String countryCode, String partyId, String locationId) {
        LocationModel locationModel = locationRepository.findByIdAndCountryCodeAndPartyId(locationId, countryCode, partyId)
                .orElseThrow(() -> new OcpiResourceNotFoundException(String.format("Location %s for party %s, operates in %s, was not found",
                        locationId, partyId, countryCode)));
        return locationMapper.toDto(locationModel);
    }

    @Override
    public EVSE getEvse(String countryCode, String partyId, String locationId, String evseUid) {
        Location location = getLocation(countryCode, partyId, locationId);
        return location.getEvses().stream().filter(e -> e.getUid().equals(evseUid)).findFirst().orElseThrow(() ->
                new OcpiResourceNotFoundException(String.format("EVSE %s for location %s with party %s, operates in %s, was not found",
                        evseUid, location.getId(), partyId, countryCode)));
    }

    @Override
    public Connector getConnector(String countryCode, String partyId, String locationId, String evseUid, String connectorId) {
        EVSE evse = getEvse(countryCode, partyId, locationId, evseUid);
        Connector connectorModel = evse.getConnectors().stream().filter(connector -> connector.getConnectorId().equals(connectorId)).findFirst().orElseThrow(() ->
                new OcpiResourceNotFoundException(String.format("Connector %s for evse %s in location %s with party %s, operates in %s, was not found",
                        connectorId, evse.getUid(), locationId, partyId, countryCode)));
        return connectorModel;

    }

    @Override
    public Location pushLocation(Location locationDTO, String countryCode, String partyId, String locationId) {
        LocationModel model = locationMapper.toModel(locationDTO);
        LocationModel saved = locationRepository.save(model);
        return locationMapper.toDto(saved);
    }

    @Override
    public EVSE pushEvse(EVSE evse, String countryCode, String partyId, String locationId, String evseUid) {
        Location location = getLocation(countryCode, partyId, locationId);

        location.getEvses().replaceAll(e -> e.getUid().equals(evseUid) ? evse : e);
        locationRepository.save(locationMapper.toModel(location));
        return location.getEvses().stream().filter(e -> e.getUid().equals(evseUid)).findFirst().orElseThrow();
    }

    @Override
    public Connector pushConnector(Connector connector, String countryCode, String partyId, String locationId, String evseUid, String connectorId) {
        return null;
    }

    @Override
    public Location patchLocation(Location locationDTO, String countryCode, String partyId, String locationId) {
        return null;
    }

    @Override
    public EVSE patchEvse(EVSE evse, String countryCode, String partyId, String locationId, String evseUid) {
        return null;
    }

    @Override
    public Connector patchConnector(Connector connector, String countryCode, String partyId, String locationId, String evseUid, String connectorId) {
        return null;
    }
}