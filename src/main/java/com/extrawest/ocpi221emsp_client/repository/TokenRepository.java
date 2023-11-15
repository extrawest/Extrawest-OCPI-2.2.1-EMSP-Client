package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.TokenModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface TokenRepository extends MongoRepository<TokenModel, String> {
    Optional<TokenModel> findByUidAndCountryCodeAndPartyId(String id, String countryCode, String partyId);

    Page<TokenModel> findByLastUpdatedBetween(LocalDateTime dateFrom, LocalDateTime dateTo, Pageable page);

    Page<TokenModel> findByLastUpdatedBefore(LocalDateTime dateTo, Pageable page);

    Page<TokenModel> findByLastUpdatedAfter(LocalDateTime dateFrom, Pageable page);
}
