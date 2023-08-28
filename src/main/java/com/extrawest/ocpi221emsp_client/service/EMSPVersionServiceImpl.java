package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.response.VersionDetailsResponseDTO;
import com.extrawest.ocpi.model.dto.response.VersionResponseDTO;
import com.extrawest.ocpi.model.enums.VersionNumber;
import com.extrawest.ocpi.service.EMSPVersionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EMSPVersionServiceImpl implements EMSPVersionService {
    @Override
    public List<VersionResponseDTO> getVersion() {
        return null;
    }

    @Override
    public VersionDetailsResponseDTO getVersionDetails(VersionNumber version) {
        return null;
    }
}
