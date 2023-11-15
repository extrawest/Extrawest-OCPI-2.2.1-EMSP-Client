package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisteredPartyRepository extends MongoRepository<RegisteredParty, String> {
}