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


package com.extrawest.ocpi.emsp.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LocationReferencesDto
 */
@JsonPropertyOrder({
        LocationReferencesDto.JSON_PROPERTY_LOCATION_ID,
        LocationReferencesDto.JSON_PROPERTY_EVSE_UIDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class LocationReferencesDto {
    public static final String JSON_PROPERTY_LOCATION_ID = "location_id";
    public static final String JSON_PROPERTY_EVSE_UIDS = "evse_uids";
    private String locationId;
    private List<String> evseUids;

    public LocationReferencesDto() {
    }

    public LocationReferencesDto locationId(String locationId) {

        this.locationId = locationId;
        return this;
    }

   /**
   * Get locationId
   * @return locationId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocationId() {
    return locationId;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


    public LocationReferencesDto evseUids(List<String> evseUids) {

        this.evseUids = evseUids;
        return this;
    }

    public LocationReferencesDto addEvseUidsItem(String evseUidsItem) {
        if (this.evseUids == null) {
            this.evseUids = new ArrayList<>();
        }
        this.evseUids.add(evseUidsItem);
        return this;
    }

   /**
   * Get evseUids
   * @return evseUids
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVSE_UIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEvseUids() {
    return evseUids;
  }


  @JsonProperty(JSON_PROPERTY_EVSE_UIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvseUids(List<String> evseUids) {
    this.evseUids = evseUids;
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LocationReferencesDto locationReferencesDto = (LocationReferencesDto) o;
      return Objects.equals(this.locationId, locationReferencesDto.locationId) &&
              Objects.equals(this.evseUids, locationReferencesDto.evseUids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, evseUids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
      sb.append("class LocationReferencesDto {\n");
      sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    evseUids: ").append(toIndentedString(evseUids)).append("\n");
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

