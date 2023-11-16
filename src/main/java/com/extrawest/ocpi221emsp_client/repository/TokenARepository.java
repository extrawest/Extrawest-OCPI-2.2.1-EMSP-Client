package com.extrawest.ocpi221emsp_client.repository;

import com.extrawest.ocpi221emsp_client.model.TokenA;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TokenARepository extends MongoRepository<TokenA, String> {
    Optional<TokenA> findByTokenAAndInvalidated(String token, boolean invalidated);
}
