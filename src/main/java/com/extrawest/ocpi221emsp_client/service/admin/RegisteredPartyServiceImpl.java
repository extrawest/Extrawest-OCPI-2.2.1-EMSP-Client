package com.extrawest.ocpi221emsp_client.service.admin;

import com.extrawest.ocpi.exception.OcpiGeneralClientException;
import com.extrawest.ocpi.model.enums.Role;
import com.extrawest.ocpi.model.vo.BusinessDetails;
import com.extrawest.ocpi.model.vo.CredentialsRole;
import com.extrawest.ocpi221emsp_client.mapper.PartyConfigMapperImpl;
import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.model.RegisteredPartyDto;
import com.extrawest.ocpi221emsp_client.repository.RegisteredPartyRepository;
import com.extrawest.ocpi221emsp_client.security.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.extrawest.ocpi221emsp_client.ExceptionMessage.PARTY_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class RegisteredPartyServiceImpl implements RegisteredPartyService, ServerVersionsData, TokensValidationService {
    private final JwtService jwtService;
    private final RegisteredPartyRepository registeredPartyRepository;
    private final PartyConfigMapperImpl partyConfigMapper;

    @Override
    public RegisteredPartyDto generateCredentialsA() {
        RegisteredParty model = new RegisteredParty();
        UUID uuid = UUID.randomUUID();
        model.setId(uuid.toString());
        String tokenA = jwtService.generateTokenA(uuid.toString());
        model.setTokenA(tokenA);

        registeredPartyRepository.save(model);
        return partyConfigMapper.toDto(model);
    }

    //TODO:: in library need to be only interface, client need to override
    @Override
    public boolean isValid(String jwt) {
        String id = jwtService.extractId(jwt);
        RegisteredParty party = this.findById(id);

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
    public RegisteredParty findById(String uuid) {
        return registeredPartyRepository.findById(uuid).orElseThrow(() ->
                new UsernameNotFoundException(PARTY_NOT_FOUND));
    }

    @Override
    public void save(RegisteredParty registeredParty) {
        registeredPartyRepository.save(registeredParty);
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
