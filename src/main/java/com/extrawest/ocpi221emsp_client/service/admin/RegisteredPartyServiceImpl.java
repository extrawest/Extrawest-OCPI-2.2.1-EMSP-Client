package com.extrawest.ocpi221emsp_client.service.admin;

import com.extrawest.ocpi.exception.OcpiGeneralClientException;
import com.extrawest.ocpi.exception.OcpiResourceNotFoundException;
import com.extrawest.ocpi.model.dto.response.VersionResponseDTO;
import com.extrawest.ocpi.model.enums.Role;
import com.extrawest.ocpi.model.enums.VersionNumber;
import com.extrawest.ocpi.model.vo.BusinessDetails;
import com.extrawest.ocpi.model.vo.CredentialsRole;
import com.extrawest.ocpi.service.EMSPVersionService;
import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.repository.RegisteredPartyRepository;
import com.extrawest.ocpi221emsp_client.security.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.extrawest.ocpi221emsp_client.ExceptionMessage.PARTY_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class RegisteredPartyServiceImpl implements RegisteredPartyService, ServerVersionsData, TokensValidationService {
    @Autowired
    private final JwtService jwtService;
    @Autowired
    private final RegisteredPartyRepository registeredPartyRepository;
    @Autowired
    private final EMSPVersionService emspVersionService;


    @Override
    public RegisteredParty generateCredentialsA() {
        RegisteredParty registeredParty = new RegisteredParty();
        UUID uuid = UUID.randomUUID();
        registeredParty.setId(uuid.toString());
        String tokenA = jwtService.generateTokenA(LocalDateTime.now(), uuid);
        registeredParty.setTokenA(tokenA);
        String versionDetailsUrl = getVersionsUrl();
        registeredParty.setVersionsUrl(versionDetailsUrl);

        registeredPartyRepository.save(registeredParty);
        return registeredParty;
    }

    //TODO:: in library need to be only interface, client need to override
    @Override
    public boolean isValid(String jwt) {
        String uuid = jwtService.extractUUID(jwt);
        RegisteredParty party = findByUuid(uuid);

        if(jwtService.isTokenA(jwt)) {
            if (party.isInvalidatedA() || !jwt.equals(party.getTokenA())){
                throw new OcpiGeneralClientException("Invalid token A");
            }
            return true;
        }

        if (!jwt.equals(party.getTokenB())) {
            throw new OcpiGeneralClientException("Invalid token B");
        }

      return true;
    }

    @Override
    public RegisteredParty findByUuid(String uuid) {
        return registeredPartyRepository.findById(uuid).orElseThrow(() ->
                new UsernameNotFoundException(PARTY_NOT_FOUND));
    }

    @Override
    public String getVersionsUrl() {
        return "http://localhost:8080/emsp/api/versions";
    }

    @Override
    public List<CredentialsRole> getVersionsRole() {
        List<CredentialsRole> roles = new ArrayList<>();
        CredentialsRole role = new CredentialsRole();
        role.setRole(Role.EMSP);
        role.setPartyId("EMS");
        role.setCountryCode("US");
        role.setBusinessDetails(new BusinessDetails());
        roles.add(role);
        return roles;
    }
}
