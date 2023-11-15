package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.enums.ProfileType;
import com.extrawest.ocpi.model.enums.TokenType;
import com.extrawest.ocpi.model.enums.WhitelistType;
import com.extrawest.ocpi.model.vo.EnergyContract;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "tokens")
@Data
@NoArgsConstructor
public class TokenModel {
    private String countryCode;
    private String partyId;
    @Id
    private String uid;
    private TokenType type;
    private String contractId;
    private String visualNumber;
    private String issuer;
    private String groupId;
    private Boolean valid;
    private WhitelistType whitelist;
    private String language;
    private ProfileType defaultProfileType;
    private EnergyContract energyContract;
    private LocalDateTime lastUpdated;
}
