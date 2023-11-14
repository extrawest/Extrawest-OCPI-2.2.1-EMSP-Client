package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi221emsp_client.model.Party;

import java.util.Optional;

public interface PartyService {

    Optional<Party> findByPartyName(String partyName);
}
