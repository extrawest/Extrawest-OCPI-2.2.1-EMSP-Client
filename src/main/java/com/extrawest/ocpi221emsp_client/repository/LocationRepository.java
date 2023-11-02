package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.LocationModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LocationRepository extends MongoRepository<LocationModel, String> {
    Optional<LocationModel> findByIdAndCountryCodeAndPartyId(String id, String countryCode, String partyId);
}
