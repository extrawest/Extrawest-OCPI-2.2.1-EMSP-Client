/*
 * OCPI 2.2.1
 * This API exposes endpoints to manage OCPI entities.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: ocpi@extrawest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.extrawest.ocpp.client.model;

import com.fasterxml.jackson.annotation.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CdrDTO
 */
@JsonPropertyOrder({
  CdrDTO.JSON_PROPERTY_ID,
  CdrDTO.JSON_PROPERTY_CURRENCY,
  CdrDTO.JSON_PROPERTY_TARIFFS,
  CdrDTO.JSON_PROPERTY_REMARK,
  CdrDTO.JSON_PROPERTY_CREDIT,
  CdrDTO.JSON_PROPERTY_COUNTRY_CODE,
  CdrDTO.JSON_PROPERTY_PARTY_ID,
  CdrDTO.JSON_PROPERTY_START_DATE_TIME,
  CdrDTO.JSON_PROPERTY_END_DATE_TIME,
  CdrDTO.JSON_PROPERTY_SESSION_ID,
  CdrDTO.JSON_PROPERTY_CDR_TOKEN,
  CdrDTO.JSON_PROPERTY_AUTH_METHOD,
  CdrDTO.JSON_PROPERTY_AUTHORIZATION_REFERENCE,
  CdrDTO.JSON_PROPERTY_CDR_LOCATION,
  CdrDTO.JSON_PROPERTY_METER_ID,
  CdrDTO.JSON_PROPERTY_CHARGING_PERIODS,
  CdrDTO.JSON_PROPERTY_SIGNED_DATA,
  CdrDTO.JSON_PROPERTY_TOTAL_COST,
  CdrDTO.JSON_PROPERTY_TOTAL_FIXED_COST,
  CdrDTO.JSON_PROPERTY_TOTAL_ENERGY,
  CdrDTO.JSON_PROPERTY_TOTAL_ENERGY_COST,
  CdrDTO.JSON_PROPERTY_TOTAL_TIME,
  CdrDTO.JSON_PROPERTY_TOTAL_TIME_COST,
  CdrDTO.JSON_PROPERTY_TOTAL_PARKING_TIME,
  CdrDTO.JSON_PROPERTY_TOTAL_PARKING_COST,
  CdrDTO.JSON_PROPERTY_TOTAL_RESERVATION_COST,
  CdrDTO.JSON_PROPERTY_INVOICE_REFERENCE_ID,
  CdrDTO.JSON_PROPERTY_CREDIT_REFERENCE_ID,
  CdrDTO.JSON_PROPERTY_HOME_CHARGING_COMPENSATION,
  CdrDTO.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T08:21:00.091189+03:00[Europe/Kiev]")
public class CdrDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_TARIFFS = "tariffs";
  private List<Tariff> tariffs;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_CREDIT = "credit";
  private Boolean credit;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_PARTY_ID = "party_id";
  private String partyId;

  public static final String JSON_PROPERTY_START_DATE_TIME = "start_date_time";
  private OffsetDateTime startDateTime;

  public static final String JSON_PROPERTY_END_DATE_TIME = "end_date_time";
  private OffsetDateTime endDateTime;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_CDR_TOKEN = "cdr_token";
  private CdrToken cdrToken;

  /**
   * Gets or Sets authMethod
   */
  public enum AuthMethodEnum {
    AUTH_REQUEST("AUTH_REQUEST"),
    
    COMMAND("COMMAND"),
    
    WHITELIST("WHITELIST");

    private String value;

    AuthMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AuthMethodEnum fromValue(String value) {
      for (AuthMethodEnum b : AuthMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTH_METHOD = "auth_method";
  private AuthMethodEnum authMethod;

  public static final String JSON_PROPERTY_AUTHORIZATION_REFERENCE = "authorization_reference";
  private String authorizationReference;

  public static final String JSON_PROPERTY_CDR_LOCATION = "cdr_location";
  private CdrLocation cdrLocation;

  public static final String JSON_PROPERTY_METER_ID = "meter_id";
  private String meterId;

  public static final String JSON_PROPERTY_CHARGING_PERIODS = "charging_periods";
  private List<ChargingPeriod> chargingPeriods = new ArrayList<>();

  public static final String JSON_PROPERTY_SIGNED_DATA = "signed_data";
  private SignedData signedData;

  public static final String JSON_PROPERTY_TOTAL_COST = "total_cost";
  private Price totalCost;

  public static final String JSON_PROPERTY_TOTAL_FIXED_COST = "total_fixed_cost";
  private Price totalFixedCost;

  public static final String JSON_PROPERTY_TOTAL_ENERGY = "total_energy";
  private Float totalEnergy;

  public static final String JSON_PROPERTY_TOTAL_ENERGY_COST = "total_energy_cost";
  private Price totalEnergyCost;

  public static final String JSON_PROPERTY_TOTAL_TIME = "total_time";
  private Float totalTime;

  public static final String JSON_PROPERTY_TOTAL_TIME_COST = "total_time_cost";
  private Price totalTimeCost;

  public static final String JSON_PROPERTY_TOTAL_PARKING_TIME = "total_parking_time";
  private Float totalParkingTime;

  public static final String JSON_PROPERTY_TOTAL_PARKING_COST = "total_parking_cost";
  private Price totalParkingCost;

  public static final String JSON_PROPERTY_TOTAL_RESERVATION_COST = "total_reservation_cost";
  private Price totalReservationCost;

  public static final String JSON_PROPERTY_INVOICE_REFERENCE_ID = "invoice_reference_id";
  private String invoiceReferenceId;

  public static final String JSON_PROPERTY_CREDIT_REFERENCE_ID = "credit_reference_id";
  private String creditReferenceId;

  public static final String JSON_PROPERTY_HOME_CHARGING_COMPENSATION = "home_charging_compensation";
  private Boolean homeChargingCompensation;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public CdrDTO() {
  }

  public CdrDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public CdrDTO currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CdrDTO tariffs(List<Tariff> tariffs) {
    
    this.tariffs = tariffs;
    return this;
  }

  public CdrDTO addTariffsItem(Tariff tariffsItem) {
    if (this.tariffs == null) {
      this.tariffs = new ArrayList<>();
    }
    this.tariffs.add(tariffsItem);
    return this;
  }

   /**
   * Get tariffs
   * @return tariffs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARIFFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Tariff> getTariffs() {
    return tariffs;
  }


  @JsonProperty(JSON_PROPERTY_TARIFFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTariffs(List<Tariff> tariffs) {
    this.tariffs = tariffs;
  }


  public CdrDTO remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public CdrDTO credit(Boolean credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCredit() {
    return credit;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredit(Boolean credit) {
    this.credit = credit;
  }


  public CdrDTO countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public CdrDTO partyId(String partyId) {
    
    this.partyId = partyId;
    return this;
  }

   /**
   * Get partyId
   * @return partyId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPartyId() {
    return partyId;
  }


  @JsonProperty(JSON_PROPERTY_PARTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }


  public CdrDTO startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public CdrDTO endDateTime(OffsetDateTime endDateTime) {
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Get endDateTime
   * @return endDateTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  public CdrDTO sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public CdrDTO cdrToken(CdrToken cdrToken) {
    
    this.cdrToken = cdrToken;
    return this;
  }

   /**
   * Get cdrToken
   * @return cdrToken
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CDR_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CdrToken getCdrToken() {
    return cdrToken;
  }


  @JsonProperty(JSON_PROPERTY_CDR_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCdrToken(CdrToken cdrToken) {
    this.cdrToken = cdrToken;
  }


  public CdrDTO authMethod(AuthMethodEnum authMethod) {
    
    this.authMethod = authMethod;
    return this;
  }

   /**
   * Get authMethod
   * @return authMethod
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuthMethodEnum getAuthMethod() {
    return authMethod;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthMethod(AuthMethodEnum authMethod) {
    this.authMethod = authMethod;
  }


  public CdrDTO authorizationReference(String authorizationReference) {
    
    this.authorizationReference = authorizationReference;
    return this;
  }

   /**
   * Get authorizationReference
   * @return authorizationReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizationReference() {
    return authorizationReference;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationReference(String authorizationReference) {
    this.authorizationReference = authorizationReference;
  }


  public CdrDTO cdrLocation(CdrLocation cdrLocation) {
    
    this.cdrLocation = cdrLocation;
    return this;
  }

   /**
   * Get cdrLocation
   * @return cdrLocation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CDR_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CdrLocation getCdrLocation() {
    return cdrLocation;
  }


  @JsonProperty(JSON_PROPERTY_CDR_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCdrLocation(CdrLocation cdrLocation) {
    this.cdrLocation = cdrLocation;
  }


  public CdrDTO meterId(String meterId) {
    
    this.meterId = meterId;
    return this;
  }

   /**
   * Get meterId
   * @return meterId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMeterId() {
    return meterId;
  }


  @JsonProperty(JSON_PROPERTY_METER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeterId(String meterId) {
    this.meterId = meterId;
  }


  public CdrDTO chargingPeriods(List<ChargingPeriod> chargingPeriods) {
    
    this.chargingPeriods = chargingPeriods;
    return this;
  }

  public CdrDTO addChargingPeriodsItem(ChargingPeriod chargingPeriodsItem) {
    if (this.chargingPeriods == null) {
      this.chargingPeriods = new ArrayList<>();
    }
    this.chargingPeriods.add(chargingPeriodsItem);
    return this;
  }

   /**
   * Get chargingPeriods
   * @return chargingPeriods
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHARGING_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ChargingPeriod> getChargingPeriods() {
    return chargingPeriods;
  }


  @JsonProperty(JSON_PROPERTY_CHARGING_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChargingPeriods(List<ChargingPeriod> chargingPeriods) {
    this.chargingPeriods = chargingPeriods;
  }


  public CdrDTO signedData(SignedData signedData) {
    
    this.signedData = signedData;
    return this;
  }

   /**
   * Get signedData
   * @return signedData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignedData getSignedData() {
    return signedData;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedData(SignedData signedData) {
    this.signedData = signedData;
  }


  public CdrDTO totalCost(Price totalCost) {
    
    this.totalCost = totalCost;
    return this;
  }

   /**
   * Get totalCost
   * @return totalCost
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Price getTotalCost() {
    return totalCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCost(Price totalCost) {
    this.totalCost = totalCost;
  }


  public CdrDTO totalFixedCost(Price totalFixedCost) {
    
    this.totalFixedCost = totalFixedCost;
    return this;
  }

   /**
   * Get totalFixedCost
   * @return totalFixedCost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_FIXED_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Price getTotalFixedCost() {
    return totalFixedCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_FIXED_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalFixedCost(Price totalFixedCost) {
    this.totalFixedCost = totalFixedCost;
  }


  public CdrDTO totalEnergy(Float totalEnergy) {
    
    this.totalEnergy = totalEnergy;
    return this;
  }

   /**
   * Get totalEnergy
   * @return totalEnergy
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_ENERGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTotalEnergy() {
    return totalEnergy;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ENERGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalEnergy(Float totalEnergy) {
    this.totalEnergy = totalEnergy;
  }


  public CdrDTO totalEnergyCost(Price totalEnergyCost) {
    
    this.totalEnergyCost = totalEnergyCost;
    return this;
  }

   /**
   * Get totalEnergyCost
   * @return totalEnergyCost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ENERGY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Price getTotalEnergyCost() {
    return totalEnergyCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ENERGY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalEnergyCost(Price totalEnergyCost) {
    this.totalEnergyCost = totalEnergyCost;
  }


  public CdrDTO totalTime(Float totalTime) {
    
    this.totalTime = totalTime;
    return this;
  }

   /**
   * Get totalTime
   * @return totalTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getTotalTime() {
    return totalTime;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalTime(Float totalTime) {
    this.totalTime = totalTime;
  }


  public CdrDTO totalTimeCost(Price totalTimeCost) {
    
    this.totalTimeCost = totalTimeCost;
    return this;
  }

   /**
   * Get totalTimeCost
   * @return totalTimeCost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_TIME_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Price getTotalTimeCost() {
    return totalTimeCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TIME_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalTimeCost(Price totalTimeCost) {
    this.totalTimeCost = totalTimeCost;
  }


  public CdrDTO totalParkingTime(Float totalParkingTime) {
    
    this.totalParkingTime = totalParkingTime;
    return this;
  }

   /**
   * Get totalParkingTime
   * @return totalParkingTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_PARKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getTotalParkingTime() {
    return totalParkingTime;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PARKING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalParkingTime(Float totalParkingTime) {
    this.totalParkingTime = totalParkingTime;
  }


  public CdrDTO totalParkingCost(Price totalParkingCost) {
    
    this.totalParkingCost = totalParkingCost;
    return this;
  }

   /**
   * Get totalParkingCost
   * @return totalParkingCost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_PARKING_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Price getTotalParkingCost() {
    return totalParkingCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PARKING_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalParkingCost(Price totalParkingCost) {
    this.totalParkingCost = totalParkingCost;
  }


  public CdrDTO totalReservationCost(Price totalReservationCost) {
    
    this.totalReservationCost = totalReservationCost;
    return this;
  }

   /**
   * Get totalReservationCost
   * @return totalReservationCost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_RESERVATION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Price getTotalReservationCost() {
    return totalReservationCost;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RESERVATION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalReservationCost(Price totalReservationCost) {
    this.totalReservationCost = totalReservationCost;
  }


  public CdrDTO invoiceReferenceId(String invoiceReferenceId) {
    
    this.invoiceReferenceId = invoiceReferenceId;
    return this;
  }

   /**
   * Get invoiceReferenceId
   * @return invoiceReferenceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceReferenceId() {
    return invoiceReferenceId;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceReferenceId(String invoiceReferenceId) {
    this.invoiceReferenceId = invoiceReferenceId;
  }


  public CdrDTO creditReferenceId(String creditReferenceId) {
    
    this.creditReferenceId = creditReferenceId;
    return this;
  }

   /**
   * Get creditReferenceId
   * @return creditReferenceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreditReferenceId() {
    return creditReferenceId;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditReferenceId(String creditReferenceId) {
    this.creditReferenceId = creditReferenceId;
  }


  public CdrDTO homeChargingCompensation(Boolean homeChargingCompensation) {
    
    this.homeChargingCompensation = homeChargingCompensation;
    return this;
  }

   /**
   * Get homeChargingCompensation
   * @return homeChargingCompensation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOME_CHARGING_COMPENSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHomeChargingCompensation() {
    return homeChargingCompensation;
  }


  @JsonProperty(JSON_PROPERTY_HOME_CHARGING_COMPENSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHomeChargingCompensation(Boolean homeChargingCompensation) {
    this.homeChargingCompensation = homeChargingCompensation;
  }


  public CdrDTO lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdrDTO cdrDTO = (CdrDTO) o;
    return Objects.equals(this.id, cdrDTO.id) &&
        Objects.equals(this.currency, cdrDTO.currency) &&
        Objects.equals(this.tariffs, cdrDTO.tariffs) &&
        Objects.equals(this.remark, cdrDTO.remark) &&
        Objects.equals(this.credit, cdrDTO.credit) &&
        Objects.equals(this.countryCode, cdrDTO.countryCode) &&
        Objects.equals(this.partyId, cdrDTO.partyId) &&
        Objects.equals(this.startDateTime, cdrDTO.startDateTime) &&
        Objects.equals(this.endDateTime, cdrDTO.endDateTime) &&
        Objects.equals(this.sessionId, cdrDTO.sessionId) &&
        Objects.equals(this.cdrToken, cdrDTO.cdrToken) &&
        Objects.equals(this.authMethod, cdrDTO.authMethod) &&
        Objects.equals(this.authorizationReference, cdrDTO.authorizationReference) &&
        Objects.equals(this.cdrLocation, cdrDTO.cdrLocation) &&
        Objects.equals(this.meterId, cdrDTO.meterId) &&
        Objects.equals(this.chargingPeriods, cdrDTO.chargingPeriods) &&
        Objects.equals(this.signedData, cdrDTO.signedData) &&
        Objects.equals(this.totalCost, cdrDTO.totalCost) &&
        Objects.equals(this.totalFixedCost, cdrDTO.totalFixedCost) &&
        Objects.equals(this.totalEnergy, cdrDTO.totalEnergy) &&
        Objects.equals(this.totalEnergyCost, cdrDTO.totalEnergyCost) &&
        Objects.equals(this.totalTime, cdrDTO.totalTime) &&
        Objects.equals(this.totalTimeCost, cdrDTO.totalTimeCost) &&
        Objects.equals(this.totalParkingTime, cdrDTO.totalParkingTime) &&
        Objects.equals(this.totalParkingCost, cdrDTO.totalParkingCost) &&
        Objects.equals(this.totalReservationCost, cdrDTO.totalReservationCost) &&
        Objects.equals(this.invoiceReferenceId, cdrDTO.invoiceReferenceId) &&
        Objects.equals(this.creditReferenceId, cdrDTO.creditReferenceId) &&
        Objects.equals(this.homeChargingCompensation, cdrDTO.homeChargingCompensation) &&
        Objects.equals(this.lastUpdated, cdrDTO.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, currency, tariffs, remark, credit, countryCode, partyId, startDateTime, endDateTime, sessionId, cdrToken, authMethod, authorizationReference, cdrLocation, meterId, chargingPeriods, signedData, totalCost, totalFixedCost, totalEnergy, totalEnergyCost, totalTime, totalTimeCost, totalParkingTime, totalParkingCost, totalReservationCost, invoiceReferenceId, creditReferenceId, homeChargingCompensation, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdrDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    tariffs: ").append(toIndentedString(tariffs)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    cdrToken: ").append(toIndentedString(cdrToken)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    authorizationReference: ").append(toIndentedString(authorizationReference)).append("\n");
    sb.append("    cdrLocation: ").append(toIndentedString(cdrLocation)).append("\n");
    sb.append("    meterId: ").append(toIndentedString(meterId)).append("\n");
    sb.append("    chargingPeriods: ").append(toIndentedString(chargingPeriods)).append("\n");
    sb.append("    signedData: ").append(toIndentedString(signedData)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    totalFixedCost: ").append(toIndentedString(totalFixedCost)).append("\n");
    sb.append("    totalEnergy: ").append(toIndentedString(totalEnergy)).append("\n");
    sb.append("    totalEnergyCost: ").append(toIndentedString(totalEnergyCost)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    totalTimeCost: ").append(toIndentedString(totalTimeCost)).append("\n");
    sb.append("    totalParkingTime: ").append(toIndentedString(totalParkingTime)).append("\n");
    sb.append("    totalParkingCost: ").append(toIndentedString(totalParkingCost)).append("\n");
    sb.append("    totalReservationCost: ").append(toIndentedString(totalReservationCost)).append("\n");
    sb.append("    invoiceReferenceId: ").append(toIndentedString(invoiceReferenceId)).append("\n");
    sb.append("    creditReferenceId: ").append(toIndentedString(creditReferenceId)).append("\n");
    sb.append("    homeChargingCompensation: ").append(toIndentedString(homeChargingCompensation)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

