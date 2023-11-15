package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi221emsp_client.config.PartyConfig;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisteredPartyDto {
    private String tokenA;
    private String versionsUrl;
}
