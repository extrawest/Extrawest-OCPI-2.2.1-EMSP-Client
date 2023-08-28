package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.AbstractProfileResult;
import com.extrawest.ocpi.model.ResponseFormat;
import com.extrawest.ocpi.model.dto.request.ActiveChargingProfileRequestDTO;
import com.extrawest.ocpi.service.EMSPChargingProfilesService;
import org.springframework.stereotype.Service;

@Service
public class EMSPChargingProfilesServiceImpl implements EMSPChargingProfilesService {
    @Override
    public ResponseFormat postChargingProfile(AbstractProfileResult abstractProfileResult) {
        return null;
    }

    @Override
    public ResponseFormat putChargingProfile(String sessionId, ActiveChargingProfileRequestDTO activeChargingProfile) {
        return null;
    }
}
