package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.response.VersionDetailsResponseDTO;
import com.extrawest.ocpi.model.dto.response.VersionResponseDTO;
import com.extrawest.ocpi.model.enums.InterfaceRole;
import com.extrawest.ocpi.model.enums.ModuleID;
import com.extrawest.ocpi.model.enums.VersionNumber;
import com.extrawest.ocpi.model.vo.Endpoint;
import com.extrawest.ocpi.service.EMSPVersionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EMSPVersionServiceImpl implements EMSPVersionService {

    @Override
    public List<VersionResponseDTO> getVersions() {
        String uri = getBaseUrl();

        List<VersionResponseDTO> versions = new ArrayList<>();

        VersionResponseDTO version_2_2_1 = new VersionResponseDTO();
        version_2_2_1.setVersion(VersionNumber.V_2_2_1);
        version_2_2_1.setUrl(uri + "/emsp/api/versions/details?version=2.2.1");

        VersionResponseDTO version_2_1 = new VersionResponseDTO();
        version_2_1.setVersion(VersionNumber.V_2_1);
        version_2_1.setUrl(uri + "/emsp/api/versions/details?version=2.1");

        versions.add(version_2_2_1);
        versions.add(version_2_1);
        return versions;
    }

    @Override
    public VersionDetailsResponseDTO getVersionDetails(VersionNumber version) {
        VersionDetailsResponseDTO versionDetails = new VersionDetailsResponseDTO();
        versionDetails.setVersion(VersionNumber.V_2_2_1);

        List<Endpoint> endpoints = new ArrayList<>();

        String uri = getBaseUrl();

        Endpoint cdrs = new Endpoint();
        cdrs.setUrl(uri + "/emsp/api/2.2.1/cdr");
        cdrs.setIdentifier(ModuleID.CDRS);
        cdrs.setRole(InterfaceRole.RECEIVER);
        endpoints.add(cdrs);

        Endpoint chargingProfile = new Endpoint();
        chargingProfile.setUrl(uri + "/emsp/api/2.2.1/chargingProfiles");
        chargingProfile.setIdentifier(ModuleID.CHARGING_PROFILES);
        chargingProfile.setRole(InterfaceRole.RECEIVER);
        endpoints.add(chargingProfile);

        Endpoint commands = new Endpoint();
        commands.setUrl(uri + "/emsp/api/2.2.1/commands");
        commands.setIdentifier(ModuleID.COMMANDS);
        commands.setRole(InterfaceRole.SENDER);
        endpoints.add(commands);

        Endpoint credentialsReceiver = new Endpoint();
        credentialsReceiver.setUrl(uri + "/emsp/api/2.2.1/credentials");
        credentialsReceiver.setIdentifier(ModuleID.CREDENTIALS);
        credentialsReceiver.setRole(InterfaceRole.RECEIVER);
        endpoints.add(credentialsReceiver);

        Endpoint locations = new Endpoint();
        locations.setUrl(uri + "/emsp/api/2.2.1/locations");
        locations.setIdentifier(ModuleID.LOCATIONS);
        locations.setRole(InterfaceRole.RECEIVER);
        endpoints.add(locations);

        Endpoint sessions = new Endpoint();
        sessions.setUrl(uri + "/emsp/api/2.2.1/sessions");
        sessions.setIdentifier(ModuleID.SESSIONS);
        sessions.setRole(InterfaceRole.RECEIVER);
        endpoints.add(sessions);

        Endpoint tariffs = new Endpoint();
        tariffs.setUrl(uri + "/emsp/api/2.2.1/tariffs");
        tariffs.setIdentifier(ModuleID.TARIFFS);
        tariffs.setRole(InterfaceRole.RECEIVER);
        endpoints.add(tariffs);

        Endpoint tokens = new Endpoint();
        tokens.setUrl(uri + "/emsp/api/2.2.1/tokens");
        tokens.setIdentifier(ModuleID.TOKENS);
        tokens.setRole(InterfaceRole.SENDER);
        endpoints.add(tokens);

        versionDetails.setEndpoints(endpoints);

        return versionDetails;
    }

    private String getBaseUrl() {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .build()
                .toUri();

        return uri.toString().replace(uri.getPath(), "");
    }
}
