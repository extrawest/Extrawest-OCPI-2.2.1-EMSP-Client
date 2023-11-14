package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.Party;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PartyRepository extends MongoRepository<Party, Integer> {

    Optional<Party> findByPartyIdAndCountryCode(String partyId, String countryCode);
}