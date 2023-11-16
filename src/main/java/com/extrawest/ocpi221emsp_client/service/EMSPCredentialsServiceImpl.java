package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.CredentialsDTO;
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
    public CredentialsDTO getCredentials() {
        return null;
    }

    @Override
    public CredentialsDTO postCredentials(CredentialsDTO credentialsToClient) {
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

        CredentialsDTO credentialsToServer = new CredentialsDTO();
        credentialsToServer.setUrl(partyConfig.getVersionsUrl());
        credentialsToServer.setToken(tokenB);
        credentialsToServer.setRoles(serverVersionsData.getVersionsRole());
        return credentialsToServer;
    }

    @Override
    public void putCredentials(CredentialsDTO credentialsDTO) {

    }

    @Override
    public void deleteCredentials(CredentialsDTO credentialsDTO) {

    }
}
