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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Price
 */
@JsonPropertyOrder({
  Price.JSON_PROPERTY_EXCL_VAT,
  Price.JSON_PROPERTY_INCL_VAT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T22:04:36.538444+03:00[Europe/Kiev]")
public class Price {
  public static final String JSON_PROPERTY_EXCL_VAT = "exclVat";
  private Float exclVat;

  public static final String JSON_PROPERTY_INCL_VAT = "inclVat";
  private Float inclVat;

  public Price() {
  }

  public Price exclVat(Float exclVat) {
    
    this.exclVat = exclVat;
    return this;
  }

   /**
   * Get exclVat
   * @return exclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCL_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getExclVat() {
    return exclVat;
  }


  @JsonProperty(JSON_PROPERTY_EXCL_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclVat(Float exclVat) {
    this.exclVat = exclVat;
  }


  public Price inclVat(Float inclVat) {
    
    this.inclVat = inclVat;
    return this;
  }

   /**
   * Get inclVat
   * @return inclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCL_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getInclVat() {
    return inclVat;
  }


  @JsonProperty(JSON_PROPERTY_INCL_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInclVat(Float inclVat) {
    this.inclVat = inclVat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.exclVat, price.exclVat) &&
        Objects.equals(this.inclVat, price.inclVat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclVat, inclVat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    sb.append("    exclVat: ").append(toIndentedString(exclVat)).append("\n");
    sb.append("    inclVat: ").append(toIndentedString(inclVat)).append("\n");
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
