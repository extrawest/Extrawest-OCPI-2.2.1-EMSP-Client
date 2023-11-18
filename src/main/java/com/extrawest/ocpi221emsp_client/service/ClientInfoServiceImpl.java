package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.ClientInfo;
import com.extrawest.ocpi.service.ClientInfoService;
import org.springframework.stereotype.Service;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {
    @Override
    public ClientInfo getHubClientInfo(String countryCode, String partyId) {
        return null;
    }

    @Override
    public void putHubClientInfo(String countryCode, String partyId) {

    }
}
