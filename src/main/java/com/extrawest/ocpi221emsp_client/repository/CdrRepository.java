package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.CdrModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CdrRepository extends MongoRepository<CdrModel, String> {

    Optional<CdrModel> findByIdAndCountryCodeAndPartyId(String id, String countryCode, String partyId);

    Optional<CdrModel> deleteByIdAndCountryCodeAndPartyId(String id, String countryCode, String partyId);
}