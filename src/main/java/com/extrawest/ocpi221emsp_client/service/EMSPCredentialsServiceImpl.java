package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.Credentials;
import com.extrawest.ocpi.service.EMSPCredentialsService;
import com.extrawest.ocpi221emsp_client.config.PartyConfig;
import com.extrawest.ocpi221emsp_client.mapper.CredentialsMapper;
import com.extrawest.ocpi221emsp_client.model.CredentialsModel;
import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.model.Role;
import com.extrawest.ocpi221emsp_client.repository.CredentialsRepository;
import com.extrawest.ocpi221emsp_client.repository.TokenARepository;
import com.extrawest.ocpi221emsp_client.security.service.JwtService;
import com.extrawest.ocpi221emsp_client.service.admin.RegisteredPartyService;
import com.extrawest.ocpi221emsp_client.service.admin.ServerVersionsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EMSPCredentialsServiceImpl implements EMSPCredentialsService {
    private final JwtService jwtService;
    private final ServerVersionsData serverVersionsData;
    private final CredentialsRepository credentialsRepository;
    private final CredentialsMapper credentialsMapper;
    private final PartyConfig partyConfig;
    private final RegisteredPartyService registeredPartyService;

    private final TokenARepository tokenARepository;

    @Override
    public Credentials getCredentials() {
        return null;
    }

    @Override
    public Credentials postCredentials(Credentials credentialsToClient) {
        CredentialsModel model = credentialsMapper.toModel(credentialsToClient);
        credentialsRepository.save(model);

        //TODO:: send request to client to get versions and endpoints
        //TODO:: store version and endpoints, received from client

        String uuid = UUID.randomUUID().toString();
        String tokenB = jwtService.generateTokenB(uuid);

        RegisteredParty registeredParty = new RegisteredParty();
        registeredParty.setId(uuid);
        registeredParty.setTokenB(tokenB);
        registeredParty.setRole(Role.CPO);
        registeredPartyService.save(registeredParty);

        Credentials credentialsToServer = new Credentials();
        credentialsToServer.setUrl(partyConfig.getVersionsUrl());
        credentialsToServer.setToken(tokenB);
        credentialsToServer.setRoles(serverVersionsData.getVersionsRole());
        return credentialsToServer;
    }

    @Override
    public void putCredentials(Credentials credentialsDTO) {

    }

    @Override
    public void deleteCredentials(Credentials credentialsDTO) {

    }
}
