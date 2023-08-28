package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.CredentialsDTO;
import com.extrawest.ocpi.service.EMSPCredentialsService;
import org.springframework.stereotype.Service;

@Service
public class EMSPCredentialsServiceImpl implements EMSPCredentialsService {
    @Override
    public CredentialsDTO getCredentials() {
        return null;
    }

    @Override
    public void postCredentials(CredentialsDTO credentialsDTO) {

    }

    @Override
    public void putCredentials(CredentialsDTO credentialsDTO) {

    }

    @Override
    public void deleteCredentials(CredentialsDTO credentialsDTO) {

    }
}
