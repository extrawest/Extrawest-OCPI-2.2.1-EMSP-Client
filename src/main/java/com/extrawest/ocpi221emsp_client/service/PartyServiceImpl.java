package com.extrawest.ocpi221emsp_client.service;

import com.extrawest.ocpi221emsp_client.model.Party;
import com.extrawest.ocpi221emsp_client.repository.PartyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PartyServiceImpl implements PartyService {
    private PartyRepository partyRepository;

    @Override
    public Optional<Party> findByPartyName(String partyName) {
        String partyId = Party.parsePartyId(partyName);
        String countryCode = Party.parseCountryCode(partyName);
        Optional<Party> party = partyRepository.findByPartyIdAndCountryCode(partyId, countryCode);
        return party;
    }

}
