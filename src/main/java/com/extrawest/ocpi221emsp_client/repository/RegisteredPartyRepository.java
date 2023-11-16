package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RegisteredPartyRepository extends MongoRepository<RegisteredParty, String> {
    Optional<RegisteredParty> findByTokenB(String token);
}