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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

/**
 * SignedValue
 */
@JsonPropertyOrder({
  SignedValue.JSON_PROPERTY_PLAIN_DAT,
  SignedValue.JSON_PROPERTY_NATURE,
  SignedValue.JSON_PROPERTY_PLAIN_DATA,
  SignedValue.JSON_PROPERTY_SIGNED_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T08:21:00.091189+03:00[Europe/Kiev]")
public class SignedValue {
  public static final String JSON_PROPERTY_PLAIN_DAT = "plainDat";
  private String plainDat;

  public static final String JSON_PROPERTY_NATURE = "nature";
  private String nature;

  public static final String JSON_PROPERTY_PLAIN_DATA = "plain_data";
  private String plainData;

  public static final String JSON_PROPERTY_SIGNED_DATA = "signed_data";
  private String signedData;

  public SignedValue() {
  }

  public SignedValue plainDat(String plainDat) {
    
    this.plainDat = plainDat;
    return this;
  }

   /**
   * Get plainDat
   * @return plainDat
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAIN_DAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlainDat() {
    return plainDat;
  }


  @JsonProperty(JSON_PROPERTY_PLAIN_DAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlainDat(String plainDat) {
    this.plainDat = plainDat;
  }


  public SignedValue nature(String nature) {
    
    this.nature = nature;
    return this;
  }

   /**
   * Get nature
   * @return nature
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNature() {
    return nature;
  }


  @JsonProperty(JSON_PROPERTY_NATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNature(String nature) {
    this.nature = nature;
  }


  public SignedValue plainData(String plainData) {
    
    this.plainData = plainData;
    return this;
  }

   /**
   * Get plainData
   * @return plainData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAIN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlainData() {
    return plainData;
  }


  @JsonProperty(JSON_PROPERTY_PLAIN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlainData(String plainData) {
    this.plainData = plainData;
  }


  public SignedValue signedData(String signedData) {
    
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

  public String getSignedData() {
    return signedData;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedData(String signedData) {
    this.signedData = signedData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignedValue signedValue = (SignedValue) o;
    return Objects.equals(this.plainDat, signedValue.plainDat) &&
        Objects.equals(this.nature, signedValue.nature) &&
        Objects.equals(this.plainData, signedValue.plainData) &&
        Objects.equals(this.signedData, signedValue.signedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plainDat, nature, plainData, signedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedValue {\n");
    sb.append("    plainDat: ").append(toIndentedString(plainDat)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
    sb.append("    plainData: ").append(toIndentedString(plainData)).append("\n");
    sb.append("    signedData: ").append(toIndentedString(signedData)).append("\n");
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

