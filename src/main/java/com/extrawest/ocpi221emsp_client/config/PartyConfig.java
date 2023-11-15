package com.extrawest.ocpi221emsp_client.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class PartyConfig {
    @Value("${version.url}")
    private String versionsUrl;
}
