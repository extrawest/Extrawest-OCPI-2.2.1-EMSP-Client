package com.extrawest.ocpi221emsp_client.repository;


import com.extrawest.ocpi221emsp_client.model.CredentialsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CredentialsRepository extends MongoRepository<CredentialsModel, String> {
}