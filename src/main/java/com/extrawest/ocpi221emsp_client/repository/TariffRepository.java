package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.TariffModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TariffRepository extends MongoRepository<TariffModel, String> {

    Optional<TariffModel> findByIdAndCountryCodeAndPartyId(String id, String countryCode, String partyId);

    Optional<TariffModel> deleteByIdAndCountryCodeAndPartyId(String id, String countryCode, String partyId);
}