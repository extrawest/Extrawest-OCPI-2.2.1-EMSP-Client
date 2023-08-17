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
 * Connector
 */
@JsonPropertyOrder({
  Connector.JSON_PROPERTY_URL,
  Connector.JSON_PROPERTY_ID,
  Connector.JSON_PROPERTY_STANDARD,
  Connector.JSON_PROPERTY_FORMAT,
  Connector.JSON_PROPERTY_POWER_TYPE,
  Connector.JSON_PROPERTY_MAX_VOLTAGE,
  Connector.JSON_PROPERTY_MAX_AMPERAGE,
  Connector.JSON_PROPERTY_MAX_ELECTRIC_POWER,
  Connector.JSON_PROPERTY_TARIFF_IDS,
  Connector.JSON_PROPERTY_TERMS_AND_CONDITIONS,
  Connector.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T08:21:00.091189+03:00[Europe/Kiev]")
public class Connector {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Gets or Sets standard
   */
  public enum StandardEnum {
    CHADEMO("CHADEMO"),
    
    CHAOJI("CHAOJI"),
    
    DOMESTIC_A("DOMESTIC_A"),
    
    DOMESTIC_B("DOMESTIC_B"),
    
    DOMESTIC_C("DOMESTIC_C"),
    
    DOMESTIC_D("DOMESTIC_D"),
    
    DOMESTIC_E("DOMESTIC_E"),
    
    DOMESTIC_F("DOMESTIC_F"),
    
    DOMESTIC_G("DOMESTIC_G"),
    
    DOMESTIC_H("DOMESTIC_H"),
    
    DOMESTIC_I("DOMESTIC_I"),
    
    DOMESTIC_J("DOMESTIC_J"),
    
    DOMESTIC_K("DOMESTIC_K"),
    
    DOMESTIC_L("DOMESTIC_L"),
    
    DOMESTIC_M("DOMESTIC_M"),
    
    DOMESTIC_N("DOMESTIC_N"),
    
    DOMESTIC_O("DOMESTIC_O"),
    
    GBT_AC("GBT_AC"),
    
    GBT_DC("GBT_DC"),
    
    IEC_60309_2_SINGLE_16("IEC_60309_2_single_16"),
    
    IEC_60309_2_THREE_16("IEC_60309_2_three_16"),
    
    IEC_60309_2_THREE_32("IEC_60309_2_three_32"),
    
    IEC_60309_2_THREE_64("IEC_60309_2_three_64"),
    
    IEC_62196_T1("IEC_62196_T1"),
    
    IEC_62196_T1_COMBO("IEC_62196_T1_COMBO"),
    
    IEC_62196_T2("IEC_62196_T2"),
    
    IEC_62196_T2_COMBO("IEC_62196_T2_COMBO"),
    
    IEC_62196_T3A("IEC_62196_T3A"),
    
    IEC_62196_T3C("IEC_62196_T3C"),
    
    NEMA_5_20("NEMA_5_20"),
    
    NEMA_6_30("NEMA_6_30"),
    
    NEMA_6_50("NEMA_6_50"),
    
    NEMA_10_30("NEMA_10_30"),
    
    NEMA_10_50("NEMA_10_50"),
    
    NEMA_14_30("NEMA_14_30"),
    
    NEMA_14_50("NEMA_14_50"),
    
    PANTOGRAPH_BOTTOM_UP("PANTOGRAPH_BOTTOM_UP"),
    
    PANTOGRAPH_TOP_DOWN("PANTOGRAPH_TOP_DOWN"),
    
    TESLA_R("TESLA_R"),
    
    TESLA_S("TESLA_S");

    private String value;

    StandardEnum(String value) {
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
    public static StandardEnum fromValue(String value) {
      for (StandardEnum b : StandardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STANDARD = "standard";
  private StandardEnum standard;

  /**
   * Gets or Sets format
   */
  public enum FormatEnum {
    SOCKET("SOCKET"),
    
    CABLE("CABLE");

    private String value;

    FormatEnum(String value) {
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
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORMAT = "format";
  private FormatEnum format;

  /**
   * Gets or Sets powerType
   */
  public enum PowerTypeEnum {
    AC_1_PHASE("AC_1_PHASE"),
    
    AC_2_PHASE("AC_2_PHASE"),
    
    AC_2_PHASE_SPLIT("AC_2_PHASE_SPLIT"),
    
    AC_3_PHASE("AC_3_PHASE"),
    
    DC("DC");

    private String value;

    PowerTypeEnum(String value) {
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
    public static PowerTypeEnum fromValue(String value) {
      for (PowerTypeEnum b : PowerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_POWER_TYPE = "power_type";
  private PowerTypeEnum powerType;

  public static final String JSON_PROPERTY_MAX_VOLTAGE = "max_voltage";
  private Integer maxVoltage;

  public static final String JSON_PROPERTY_MAX_AMPERAGE = "max_amperage";
  private Integer maxAmperage;

  public static final String JSON_PROPERTY_MAX_ELECTRIC_POWER = "max_electric_power";
  private Integer maxElectricPower;

  public static final String JSON_PROPERTY_TARIFF_IDS = "tariff_ids";
  private List<String> tariffIds;

  public static final String JSON_PROPERTY_TERMS_AND_CONDITIONS = "terms_and_conditions";
  private String termsAndConditions;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public Connector() {
  }

  public Connector url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public Connector id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Connector standard(StandardEnum standard) {
    
    this.standard = standard;
    return this;
  }

   /**
   * Get standard
   * @return standard
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StandardEnum getStandard() {
    return standard;
  }


  @JsonProperty(JSON_PROPERTY_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandard(StandardEnum standard) {
    this.standard = standard;
  }


  public Connector format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormatEnum getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public Connector powerType(PowerTypeEnum powerType) {
    
    this.powerType = powerType;
    return this;
  }

   /**
   * Get powerType
   * @return powerType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PowerTypeEnum getPowerType() {
    return powerType;
  }


  @JsonProperty(JSON_PROPERTY_POWER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerType(PowerTypeEnum powerType) {
    this.powerType = powerType;
  }


  public Connector maxVoltage(Integer maxVoltage) {
    
    this.maxVoltage = maxVoltage;
    return this;
  }

   /**
   * Get maxVoltage
   * @return maxVoltage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_VOLTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxVoltage() {
    return maxVoltage;
  }


  @JsonProperty(JSON_PROPERTY_MAX_VOLTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxVoltage(Integer maxVoltage) {
    this.maxVoltage = maxVoltage;
  }


  public Connector maxAmperage(Integer maxAmperage) {
    
    this.maxAmperage = maxAmperage;
    return this;
  }

   /**
   * Get maxAmperage
   * @return maxAmperage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_AMPERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxAmperage() {
    return maxAmperage;
  }


  @JsonProperty(JSON_PROPERTY_MAX_AMPERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAmperage(Integer maxAmperage) {
    this.maxAmperage = maxAmperage;
  }


  public Connector maxElectricPower(Integer maxElectricPower) {
    
    this.maxElectricPower = maxElectricPower;
    return this;
  }

   /**
   * Get maxElectricPower
   * @return maxElectricPower
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_ELECTRIC_POWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxElectricPower() {
    return maxElectricPower;
  }


  @JsonProperty(JSON_PROPERTY_MAX_ELECTRIC_POWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxElectricPower(Integer maxElectricPower) {
    this.maxElectricPower = maxElectricPower;
  }


  public Connector tariffIds(List<String> tariffIds) {
    
    this.tariffIds = tariffIds;
    return this;
  }

  public Connector addTariffIdsItem(String tariffIdsItem) {
    if (this.tariffIds == null) {
      this.tariffIds = new ArrayList<>();
    }
    this.tariffIds.add(tariffIdsItem);
    return this;
  }

   /**
   * Get tariffIds
   * @return tariffIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARIFF_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTariffIds() {
    return tariffIds;
  }


  @JsonProperty(JSON_PROPERTY_TARIFF_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTariffIds(List<String> tariffIds) {
    this.tariffIds = tariffIds;
  }


  public Connector termsAndConditions(String termsAndConditions) {
    
    this.termsAndConditions = termsAndConditions;
    return this;
  }

   /**
   * Get termsAndConditions
   * @return termsAndConditions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMS_AND_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTermsAndConditions() {
    return termsAndConditions;
  }


  @JsonProperty(JSON_PROPERTY_TERMS_AND_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }


  public Connector lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    Connector connector = (Connector) o;
    return Objects.equals(this.url, connector.url) &&
        Objects.equals(this.id, connector.id) &&
        Objects.equals(this.standard, connector.standard) &&
        Objects.equals(this.format, connector.format) &&
        Objects.equals(this.powerType, connector.powerType) &&
        Objects.equals(this.maxVoltage, connector.maxVoltage) &&
        Objects.equals(this.maxAmperage, connector.maxAmperage) &&
        Objects.equals(this.maxElectricPower, connector.maxElectricPower) &&
        Objects.equals(this.tariffIds, connector.tariffIds) &&
        Objects.equals(this.termsAndConditions, connector.termsAndConditions) &&
        Objects.equals(this.lastUpdated, connector.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, id, standard, format, powerType, maxVoltage, maxAmperage, maxElectricPower, tariffIds, termsAndConditions, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    powerType: ").append(toIndentedString(powerType)).append("\n");
    sb.append("    maxVoltage: ").append(toIndentedString(maxVoltage)).append("\n");
    sb.append("    maxAmperage: ").append(toIndentedString(maxAmperage)).append("\n");
    sb.append("    maxElectricPower: ").append(toIndentedString(maxElectricPower)).append("\n");
    sb.append("    tariffIds: ").append(toIndentedString(tariffIds)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
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

