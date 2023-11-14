package com.extrawest.ocpi221emsp_client.security.config;

import com.extrawest.ocpi221emsp_client.model.RegisteredParty;
import com.extrawest.ocpi221emsp_client.service.PartyService;
import com.extrawest.ocpi221emsp_client.service.admin.RegisteredPartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static com.extrawest.ocpi221emsp_client.ExceptionMessage.PARTY_NOT_FOUND;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {
    private final RegisteredPartyService registeredPartyService;

    @Bean
    public UserDetailsService userDetailsService() {
        return registeredPartyService::findByUuid;
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
