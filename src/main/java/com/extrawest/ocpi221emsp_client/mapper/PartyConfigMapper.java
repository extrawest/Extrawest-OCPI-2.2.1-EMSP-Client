package com.extrawest.ocpi221emsp_client.mapper;

import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.model.RegisteredPartyDto;

public interface PartyConfigMapper {
    RegisteredPartyDto toDto(RegisteredParty model);
}
