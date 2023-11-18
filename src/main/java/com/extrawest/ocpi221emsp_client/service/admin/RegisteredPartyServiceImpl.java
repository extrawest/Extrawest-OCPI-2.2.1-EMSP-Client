package com.extrawest.ocpi221emsp_client.service.admin;

import com.extrawest.ocpi.model.domain.BusinessDetails;
import com.extrawest.ocpi.model.domain.CredentialsRole;
import com.extrawest.ocpi.model.enums.Role;
import com.extrawest.ocpi221emsp_client.mapper.TokenAMapperImpl;
import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.model.TokenA;
import com.extrawest.ocpi221emsp_client.model.TokenADto;
import com.extrawest.ocpi221emsp_client.repository.RegisteredPartyRepository;
import com.extrawest.ocpi221emsp_client.repository.TokenARepository;
import com.extrawest.ocpi221emsp_client.security.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.extrawest.ocpi221emsp_client.ExceptionMessage.PARTY_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class RegisteredPartyServiceImpl implements RegisteredPartyService, ServerVersionsData {
    private final JwtService jwtService;
    private final RegisteredPartyRepository registeredPartyRepository;
    private final TokenAMapperImpl partyConfigMapper;
    private final TokenARepository tokenARepository;

    @Override
    public TokenADto generateCredentialsA() {
        TokenA model = new TokenA();
        UUID uuid = UUID.randomUUID();
        String tokenA = jwtService.generateTokenA(uuid.toString());
        model.setTokenA(tokenA);

        tokenARepository.save(model);
        return partyConfigMapper.toDto(model);
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
    public boolean exists(String token) {
        Optional<RegisteredParty> byTokenB = registeredPartyRepository.findByTokenB(token);
        return byTokenB.isPresent();
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
