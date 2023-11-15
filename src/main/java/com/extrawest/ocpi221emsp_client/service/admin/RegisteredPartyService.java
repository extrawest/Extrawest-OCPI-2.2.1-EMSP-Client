package com.extrawest.ocpi221emsp_client.service.admin;

import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.model.RegisteredPartyDto;


public interface RegisteredPartyService {
    RegisteredPartyDto generateCredentialsA();

    RegisteredParty findById(String id);

    void save(RegisteredParty registeredParty);
}
