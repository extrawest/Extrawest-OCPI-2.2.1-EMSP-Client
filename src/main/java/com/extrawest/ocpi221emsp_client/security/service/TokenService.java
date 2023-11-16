package com.extrawest.ocpi221emsp_client.security.service;

import com.extrawest.ocpi.exception.OcpiGeneralClientException;
import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.model.TokenA;
import com.extrawest.ocpi221emsp_client.repository.TokenARepository;
import com.extrawest.ocpi221emsp_client.service.admin.RegisteredPartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TokenService {
    private final RegisteredPartyService registeredPartyService;
    private final TokenARepository tokenARepository;
    private final JwtService jwtService;

    public boolean isValidTokenA(String token) {
        Optional<TokenA> tokenA = tokenARepository.findByTokenAAndInvalidated(token, false);
        return tokenA.isPresent();
    }

    public void invalidate(String token) {
        TokenA tokenA = tokenARepository.findById(token).orElseThrow(() -> new OcpiGeneralClientException("Not found token"));
        tokenA.setInvalidated(true);
        tokenARepository.save(tokenA);
    }

    public boolean isRegisteredB(String jwt) {
        if (!registeredPartyService.exists(jwt)) {
            throw new OcpiGeneralClientException("Invalid token B");
        }
        String id = jwtService.extractId(jwt);
        RegisteredParty party = registeredPartyService.findById(id);

        if (!jwt.equals(party.getTokenB())) {
            throw new OcpiGeneralClientException("Invalid token B");
        }

        return true;
    }

}
