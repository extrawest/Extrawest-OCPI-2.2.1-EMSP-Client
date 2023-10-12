package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.SessionModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SessionRepository extends MongoRepository<SessionModel, String> {

    Optional<SessionModel> findByIdAndCountryCodeAndPartyId(String id, String countryCode, String partyId);

    Optional<SessionModel> deleteByIdAndCountryCodeAndPartyId(String id, String countryCode, String partyId);
}