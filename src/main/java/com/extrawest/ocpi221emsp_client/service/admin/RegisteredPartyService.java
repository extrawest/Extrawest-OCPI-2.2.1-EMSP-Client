package com.extrawest.ocpi221emsp_client.service.admin;

import com.extrawest.ocpi.model.vo.CredentialsRole;
import com.extrawest.ocpi221emsp_client.model.RegisteredParty;

import java.util.List;

public interface RegisteredPartyService {
    RegisteredParty generateCredentialsA();
    RegisteredParty findByUuid(String uuid);
}
