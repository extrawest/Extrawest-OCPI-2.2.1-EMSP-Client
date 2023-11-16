package com.extrawest.ocpi221emsp_client.service.admin;

import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.model.TokenADto;


public interface RegisteredPartyService {
    TokenADto generateCredentialsA();

    RegisteredParty findById(String id);

    void save(RegisteredParty registeredParty);

    boolean exists(String token);
}
