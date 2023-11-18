package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.domain.charging_profile.ActiveChargingProfile;
import com.extrawest.ocpi.model.domain.charging_profile.results.AbstractProfileResult;
import com.extrawest.ocpi.model.dto.ResponseFormat;
import com.extrawest.ocpi.service.EMSPChargingProfilesService;
import org.springframework.stereotype.Service;

@Service
public class EMSPChargingProfilesServiceImpl implements EMSPChargingProfilesService {
    @Override
    public ResponseFormat postChargingProfile(AbstractProfileResult abstractProfileResult) {
        return null;
    }

    @Override
    public ResponseFormat putChargingProfile(String sessionId, ActiveChargingProfile activeChargingProfile) {
        return null;
    }
}
