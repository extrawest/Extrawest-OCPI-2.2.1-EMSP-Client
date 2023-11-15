package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi.model.ResponseFormat;
import com.extrawest.ocpi.model.dto.CredentialsDTO;
import com.extrawest.ocpi.model.dto.response.VersionResponseDTO;
import com.extrawest.ocpi.service.EMSPCredentialsService;
import com.extrawest.ocpi221emsp_client.config.PartyConfig;
import com.extrawest.ocpi221emsp_client.mapper.CredentialsMapper;
import com.extrawest.ocpi221emsp_client.model.CredentialsModel;
import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.repository.CredentialsRepository;
import com.extrawest.ocpi221emsp_client.security.service.JwtService;
import com.extrawest.ocpi221emsp_client.service.admin.RegisteredPartyService;
import com.extrawest.ocpi221emsp_client.service.admin.ServerVersionsData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

import static io.restassured.RestAssured.given;

@Service
@RequiredArgsConstructor
public class EMSPCredentialsServiceImpl implements EMSPCredentialsService {
    private final JwtService jwtService;
    private final ServerVersionsData serverVersionsData;
    private final CredentialsRepository credentialsRepository;
    private final CredentialsMapper credentialsMapper;
    private final PartyConfig partyConfig;
    private final RegisteredPartyService registeredPartyService;

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


//        Response response = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get(credentialsToClient.getUrl())
//                .then()
//                .extract().response();
//
//        System.out.println(response.asString());

        //TODO:: send request to client to get versions and endpoints
        //TODO:: store version and endpoints, received from client
        String tokenB = jwtService.generateTokenB(uuid);

        RegisteredParty registeredParty = registeredPartyService.findById(uuid);
        registeredParty.setTokenB(tokenB);
        registeredParty.setInvalidatedA(true);
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
