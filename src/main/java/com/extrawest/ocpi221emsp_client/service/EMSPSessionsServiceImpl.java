package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.SessionDto;
import com.extrawest.ocpi.service.EMSPSessionsService;
import com.extrawest.ocpi221emsp_client.mapper.SessionMapper;
import com.extrawest.ocpi221emsp_client.model.SessionModel;
import com.extrawest.ocpi221emsp_client.repository.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EMSPSessionsServiceImpl implements EMSPSessionsService {
    @Autowired
    private final SessionRepository sessionRepository;
    @Autowired
    private final SessionMapper sessionMapper;

    @Override
    public SessionDto getSession(String countryCode, String partyId, String sessionId) {
        SessionModel session = sessionRepository.findByIdAndCountryCodeAndPartyId(sessionId, countryCode, partyId)
                .orElseThrow(() -> new OcpiResourceNotFoundException(String.format("Session %s for party %s, operates in %s, was not found",
                        sessionId, partyId, countryCode)));

        return sessionMapper.toDTO(session);
    }

    @Override
    public SessionDto putSession(SessionDto sessionDTO, String countryCode, String partyId, String sessionId) {
        SessionModel tariffDocument = sessionMapper.toModel(sessionDTO);
        SessionModel saved = sessionRepository.save(tariffDocument);
        return sessionMapper.toDTO(saved);
    }

    @Override
    public SessionDto patchSession(SessionDto sessionDTO, String countryCode, String partyId, String sessionId) {
        return null;
    }
}
