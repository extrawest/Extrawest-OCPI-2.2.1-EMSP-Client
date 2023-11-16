package com.extrawest.ocpi221emsp_client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.extrawest.ocpi221emsp_client.model.Permission.*;

@AllArgsConstructor
@Getter
public enum Role {
    CPO(Set.of(CDRS_SENDER,
            CHARGING_PROFILES_RECEIVER,
            COMMANDS_RECEIVER,
            CREDENTIALS_SENDER, CREDENTIALS_RECEIVER,
            HUB_CLIENT_INFO_RECEIVER,
            LOCATIONS_SENDER,
            SESSIONS_SENDER,
            TARIFFS_SENDER,
            TOKENS_RECEIVER,
            VERSIONS_SENDER, VERSIONS_RECEIVER)),

    EMSP(Set.of(CDRS_RECEIVER,
            COMMANDS_SENDER,
            CREDENTIALS_SENDER, CREDENTIALS_RECEIVER,
            HUB_CLIENT_INFO_RECEIVER,
            LOCATIONS_RECEIVER,
            SESSIONS_RECEIVER,
            TARIFFS_RECEIVER,
            TOKENS_SENDER,
            VERSIONS_SENDER, VERSIONS_RECEIVER)),

    HUB(Set.of(CDRS_RECEIVER, CDRS_SENDER,
            CHARGING_PROFILES_RECEIVER, CHARGING_PROFILES_SENDER,
            COMMANDS_RECEIVER, COMMANDS_SENDER,
            CREDENTIALS_SENDER, CREDENTIALS_RECEIVER,
            HUB_CLIENT_INFO_SENDER,
            LOCATIONS_RECEIVER, LOCATIONS_SENDER,
            SESSIONS_RECEIVER, SESSIONS_SENDER,
            TARIFFS_RECEIVER, TARIFFS_SENDER,
            TOKENS_SENDER, TOKENS_RECEIVER,
            VERSIONS_SENDER, VERSIONS_RECEIVER));

    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }

}