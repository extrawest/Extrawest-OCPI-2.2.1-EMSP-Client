package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.response.VersionDetailsResponseDTO;
import com.extrawest.ocpi.model.dto.response.VersionResponseDTO;
import com.extrawest.ocpi.model.enums.InterfaceRole;
import com.extrawest.ocpi.model.enums.ModuleID;
import com.extrawest.ocpi.model.enums.VersionNumber;
import com.extrawest.ocpi.model.vo.Endpoint;
import com.extrawest.ocpi.service.EMSPVersionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EMSPVersionServiceImpl implements EMSPVersionService {
    Map<String, VersionResponseDTO> versions = new HashMap<>();

    @Override
    public List<VersionResponseDTO> getVersions() {
        List<VersionResponseDTO> versions = new ArrayList<>();

        VersionResponseDTO version_2_2_1 = new VersionResponseDTO();
        version_2_2_1.setVersion(VersionNumber.V_2_2_1);
        version_2_2_1.setUrl("/emsp/api/versions/details?version=2.2.1");

        VersionResponseDTO version_2_1 = new VersionResponseDTO();
        version_2_1.setVersion(VersionNumber.V_2_1);
        version_2_1.setUrl("/emsp/api/versions/details?version=2.1");

        versions.add(version_2_2_1);
        versions.add(version_2_1);
        return versions;
    }

    @Override
    public VersionDetailsResponseDTO getVersionDetails(VersionNumber version) {
        VersionDetailsResponseDTO versionDetails = new VersionDetailsResponseDTO();
        versionDetails.setVersion(VersionNumber.V_2_2_1);

        List<Endpoint> endpoints = new ArrayList<>();

        Endpoint endpointTariffs = new Endpoint();
        endpointTariffs.setUrl("/emsp/api/2.2.1/tariffs");
        endpointTariffs.setIdentifier(ModuleID.TARIFFS);
        endpointTariffs.setRole(InterfaceRole.RECEIVER);
        endpoints.add(endpointTariffs);

        versionDetails.setEndpoints(endpoints);



        return versionDetails;
    }
}
