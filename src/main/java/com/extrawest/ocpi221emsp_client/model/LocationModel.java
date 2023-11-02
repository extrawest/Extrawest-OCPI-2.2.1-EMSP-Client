package com.extrawest.ocpi221emsp_client.model;

import com.extrawest.ocpi.model.enums.Facility;
import com.extrawest.ocpi.model.enums.ParkingType;
import com.extrawest.ocpi.model.vo.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "locations")
@Data
@NoArgsConstructor
public class LocationModel {
    private String countryCode;
    private String partyId;
    @Id
    private String id;
    private Boolean publish;
    private List<PublishTokenType> publishAllowedTo;
    private String name;
    private String address;
    private String city;
    private String postalCode;
    private String state;
    private String country;
    private GeoLocation coordinates;
    private List<AdditionalGeoLocation> relatedLocations;
    private ParkingType parkingType;
    private List<Evse> evses;
    private List<DisplayText> directions;
    private BusinessDetails operator;
    private BusinessDetails subOperator;
    private BusinessDetails owner;
    private List<Facility> facilities;
    private String timeZone;
    private Hours openingTimes;
    private Boolean chargingWhenClosed;
    private List<Image> images;
    private EnergyMix energyMix;
    private LocalDateTime lastUpdated;
}
