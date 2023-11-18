package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.dto.ChargingPeriod;
import com.extrawest.ocpi.model.dto.Price;
import com.extrawest.ocpi.model.dto.cdr.CdrToken;
import com.extrawest.ocpi.model.enums.AuthMethod;
import com.extrawest.ocpi.model.enums.SessionStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "sessions")
@Data
@NoArgsConstructor
public class SessionModel {
    private String countryCode;

    private String partyId;

    @Id
    private String id;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private Float kwh;

    private CdrToken cdrToken;

    private AuthMethod authMethod;

    private String authorizationReference;

    private String locationId;

    private String evseUid;

    private String connectorId;

    private String meterId;

    private String currency;

    private List<ChargingPeriod> chargingPeriods;

    private Price totalCost;

    private SessionStatus status;

    private LocalDateTime lastUpdated;

}
