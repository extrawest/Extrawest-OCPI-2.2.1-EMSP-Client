package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.SessionDTO;
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
    public SessionDTO getSession(String countryCode, String partyId, String sessionId) {
        SessionModel session = sessionRepository.findByIdAndCountryCodeAndPartyId(sessionId, countryCode, partyId)
                .orElseThrow(() -> new OcpiResourceNotFoundException(String.format("Session %s for party %s, operates in %s, was not found",
                        sessionId, partyId, countryCode)));

        SessionDTO sessionDTO = sessionMapper.toDTO(session);

        return sessionDTO;
    }

    @Override
    public SessionDTO putSession(SessionDTO sessionDTO, String countryCode, String partyId, String sessionId) {
        SessionModel tariffDocument = sessionMapper.toModel(sessionDTO);
        SessionModel saved = sessionRepository.save(tariffDocument);
        return sessionMapper.toDTO(saved);
    }

    @Override
    public void patchSession(SessionDTO sessionDTO, String countryCode, String partyId, String sessionId) {

    }

//    Map<String, SessionDTO> sessionDTOList = new HashMap<>();
//
//    @Override
//    public SessionDTO getSession(String countryCode, String partyId, String sessionId) {
//        return sessionDTOList.get(sessionId);
////        SessionDTO sessionDTO = new SessionDTO();
////        sessionDTO.setStatus(SessionStatus.ACTIVE);
////
////        CdrToken cdrToken = new CdrToken();
////        cdrToken.setContractId("contract1");
////        cdrToken.setType(TokenType.RFID);
////        cdrToken.setCountryCode("BE");
////        cdrToken.setPartyId("DE");
////        cdrToken.setUid(UUID.randomUUID().toString());
////        sessionDTO.setCdrToken(cdrToken);
////
////        ChargingPeriod chargingPeriod = new ChargingPeriod();
////        chargingPeriod.setStartDateTime(LocalDateTime.now());
////
////        CdrDimension cdrDimension = new CdrDimension();
////        cdrDimension.setType(CdrDimensionType.PARKING_TIME);
////        cdrDimension.setVolume(5.00f);
////        chargingPeriod.setDimensions(List.of(cdrDimension));
////
////        sessionDTO.setChargingPeriods(List.of(chargingPeriod));
////        return sessionDTO;
//    }
//
//    @Override
//    public void putSession(SessionDTO sessionDTO, String countryCode, String partyId, String sessionId) {
//        sessionDTOList.put(sessionId, sessionDTO);
//    }
//
//    @Override
//    public void patchSession(SessionDTO sessionDTO, String countryCode, String partyId, String sessionId) {
//
//    }
}
