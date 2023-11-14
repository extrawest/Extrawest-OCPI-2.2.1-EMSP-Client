package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.dto.CredentialsDTO;
import com.extrawest.ocpi.service.EMSPCredentialsService;
import com.extrawest.ocpi221emsp_client.mapper.CredentialsMapper;
import com.extrawest.ocpi221emsp_client.model.CredentialsModel;
import com.extrawest.ocpi221emsp_client.repository.CredentialsRepository;
import com.extrawest.ocpi221emsp_client.security.service.JwtService;
import com.extrawest.ocpi221emsp_client.service.admin.ServerVersionsData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EMSPCredentialsServiceImpl implements EMSPCredentialsService {
    @Autowired
    private final JwtService jwtService;
    @Autowired
    private final ServerVersionsData serverVersionsData;
    @Autowired
    private final CredentialsRepository credentialsRepository;
    @Autowired
    private final CredentialsMapper credentialsMapper;


    @Override
    public CredentialsDTO getCredentials() {
       return null;
    }

    @Override
    public CredentialsDTO postCredentials(CredentialsDTO credentialsToClient) {
        CredentialsModel model = credentialsMapper.toModel(credentialsToClient);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails principal = (UserDetails) authentication.getPrincipal();
        String uuid = principal.getUsername();
        model.setId(uuid);
        credentialsRepository.save(model);

        //TODO:: send request to client to get versions and endpoints
        //TODO:: store version and endpoints, received from client

        CredentialsDTO credentialsToServer = new CredentialsDTO();
        credentialsToServer.setUrl(serverVersionsData.getVersionsUrl());
        String tokenB = jwtService.generateTokenB(LocalDateTime.now(), UUID.fromString(uuid));
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
