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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * CdrDimension
 */
@JsonPropertyOrder({
  CdrDimension.JSON_PROPERTY_TYPE,
  CdrDimension.JSON_PROPERTY_VOLUME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T22:04:36.538444+03:00[Europe/Kiev]")
public class CdrDimension {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CURRENT("CURRENT"),
    
    ENERGY("ENERGY"),
    
    ENERGY_EXPORT("ENERGY_EXPORT"),
    
    ENERGY_IMPORT("ENERGY_IMPORT"),
    
    MAX_CURRENT("MAX_CURRENT"),
    
    MIN_CURRENT("MIN_CURRENT"),
    
    MAX_POWER("MAX_POWER"),
    
    MIN_POWER("MIN_POWER"),
    
    PARKING_TIME("PARKING_TIME"),
    
    POWER("POWER"),
    
    RESERVATION_TIME("RESERVATION_TIME"),
    
    STATE_OF_CHARGE("STATE_OF_CHARGE"),
    
    TIME("TIME");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private Float volume;

  public CdrDimension() {
  }

  public CdrDimension type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CdrDimension volume(Float volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getVolume() {
    return volume;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(Float volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdrDimension cdrDimension = (CdrDimension) o;
    return Objects.equals(this.type, cdrDimension.type) &&
        Objects.equals(this.volume, cdrDimension.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdrDimension {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
