package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi221emsp_client.config.PartyConfig;
import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.model.RegisteredPartyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartyConfigMapperImpl implements PartyConfigMapper{
    @Autowired
    private final PartyConfig partyConfig;

    @Override
    public RegisteredPartyDto toDto(RegisteredParty model) {
        RegisteredPartyDto dto = new RegisteredPartyDto();
        dto.setTokenA(model.getTokenA());
        dto.setVersionsUrl(partyConfig.getVersionsUrl());
        return dto;
    }
}
