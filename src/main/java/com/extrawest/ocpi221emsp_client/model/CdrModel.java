package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.dto.TariffDTO;
import com.extrawest.ocpi.model.enums.AuthMethod;
import com.extrawest.ocpi.model.vo.*;
import com.extrawest.ocpi.util.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "cdrs")
@Data
@NoArgsConstructor
public class CdrModel {
    @Id
    private String id;
    private String countryCode;
    private String partyId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String sessionId;
    private CdrToken cdrToken;
    private AuthMethod authMethod;
    private String authorizationReference;
    private CdrLocation cdrLocation;
    private String meterId;
    private String currency;
    private List<TariffDTO> tariffs;
    private List<ChargingPeriod> chargingPeriods;
    private SignedData signedData;
    private Price totalCost;
    private Price totalFixedCost;
    private Float totalEnergy;
    private Price totalEnergyCost;
    private Float totalTime;
    private Price totalTimeCost;
    private Float totalParkingTime;
    private Price totalParkingCost;
    private Price totalReservationCost;
    private String remark;
    private String invoiceReferenceId;
    private Boolean credit;
    private String creditReferenceId;
    private Boolean homeChargingCompensation;
    private LocalDateTime lastUpdated;
}
