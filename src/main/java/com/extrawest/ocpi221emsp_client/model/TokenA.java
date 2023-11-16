package com.extrawest.ocpi221emsp_client.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tokens-a")
public class TokenA {
    @Id
    private String tokenA;
    private boolean invalidated;
}
