package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.SessionDTO;
import com.extrawest.ocpi.service.EMSPSessionsService;
import org.springframework.stereotype.Service;

@Service
public class EMSPSessionsServiceImpl implements EMSPSessionsService {
    @Override
    public SessionDTO getSession(String countryCode, String partyId, String sessionId) {
        return null;
    }

    @Override
    public void putSession(SessionDTO sessionDTO, String countryCode, String partyId, String sessionId) {

    }

    @Override
    public void patchSession(SessionDTO sessionDTO, String countryCode, String partyId, String sessionId) {

    }
}
