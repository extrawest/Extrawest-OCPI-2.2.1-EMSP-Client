package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi221emsp_client.config.PartyConfig;
import com.extrawest.ocpi221emsp_client.model.TokenA;
import com.extrawest.ocpi221emsp_client.model.TokenADto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenAMapperImpl implements TokenAMapper {
    @Autowired
    private final PartyConfig partyConfig;

    @Override
    public TokenADto toDto(TokenA model) {
        TokenADto dto = new TokenADto();
        dto.setTokenA(model.getTokenA());
        dto.setVersionsUrl(partyConfig.getVersionsUrl());
        return dto;
    }
}
