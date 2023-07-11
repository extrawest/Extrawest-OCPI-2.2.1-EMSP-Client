package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.TokenDTO;
import com.extrawest.ocpi.model.dto.request.LocationReferencesRequestDTO;
import com.extrawest.ocpi.model.dto.response.AuthorizationInfoResponseDTO;
import com.extrawest.ocpi.service.EMSPTokenService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EMSPTokenServiceImpl implements EMSPTokenService {
    @Override
    public List<TokenDTO> getToken(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public AuthorizationInfoResponseDTO postToken(String tokenUid, String type, LocationReferencesRequestDTO locationReferencesRequestDTO) {
        return null;
    }
}
