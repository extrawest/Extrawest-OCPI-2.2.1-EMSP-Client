package com.extrawest.ocpi221emsp_client.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Document(collection = "parties")
@Data
@Builder
@CompoundIndexes({
        @CompoundIndex(name = "party_country", def = "{'partyId' : 1, 'countryCode': 1}", unique = true)
})
public class Party implements UserDetails {
    @Id
    private String id;

    private String partyId;

    private String countryCode;

    private String tokenA;

    private boolean invalidated;

//    private Role role;

    public static String parsePartyId(String partyName) {
        return partyName.split("/")[0];
    }

    public static String parseCountryCode(String partyName) {
        return partyName.split("/")[1];
    }

    public static String createPartyName(String partyId, String countryCode) {
        return partyId + "/" + countryCode;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
//        return role.getAuthorities();
    }

    @Override
    public String getPassword() {
        return "samepass";
    }

    @Override
    public String getUsername() {
        return createPartyName(this.partyId, this.countryCode);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
