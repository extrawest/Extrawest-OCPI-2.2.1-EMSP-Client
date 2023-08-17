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

import java.util.Objects;

/**
 * AuthorizationInfoResponseDTO
 */
@JsonPropertyOrder({
  AuthorizationInfoResponseDTO.JSON_PROPERTY_ALLOWED,
  AuthorizationInfoResponseDTO.JSON_PROPERTY_TOKEN,
  AuthorizationInfoResponseDTO.JSON_PROPERTY_LOCATION,
  AuthorizationInfoResponseDTO.JSON_PROPERTY_AUTHORIZATION_REFERENCE,
  AuthorizationInfoResponseDTO.JSON_PROPERTY_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T08:21:00.091189+03:00[Europe/Kiev]")
public class AuthorizationInfoResponseDTO {
  /**
   * Gets or Sets allowed
   */
  public enum AllowedEnum {
    ALLOWED("ALLOWED"),
    
    BLOCKED("BLOCKED"),
    
    EXPIRED("EXPIRED"),
    
    NO_CREDIT("NO_CREDIT"),
    
    NOT_ALLOWED("NOT_ALLOWED");

    private String value;

    AllowedEnum(String value) {
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
    public static AllowedEnum fromValue(String value) {
      for (AllowedEnum b : AllowedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ALLOWED = "allowed";
  private AllowedEnum allowed;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private Token token;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private LocationReferences location;

  public static final String JSON_PROPERTY_AUTHORIZATION_REFERENCE = "authorization_reference";
  private String authorizationReference;

  public static final String JSON_PROPERTY_INFO = "info";
  private DisplayText info;

  public AuthorizationInfoResponseDTO() {
  }

  public AuthorizationInfoResponseDTO allowed(AllowedEnum allowed) {
    
    this.allowed = allowed;
    return this;
  }

   /**
   * Get allowed
   * @return allowed
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AllowedEnum getAllowed() {
    return allowed;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowed(AllowedEnum allowed) {
    this.allowed = allowed;
  }


  public AuthorizationInfoResponseDTO token(Token token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Token getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToken(Token token) {
    this.token = token;
  }


  public AuthorizationInfoResponseDTO location(LocationReferences location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocationReferences getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(LocationReferences location) {
    this.location = location;
  }


  public AuthorizationInfoResponseDTO authorizationReference(String authorizationReference) {
    
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


  public AuthorizationInfoResponseDTO info(DisplayText info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisplayText getInfo() {
    return info;
  }


  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(DisplayText info) {
    this.info = info;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationInfoResponseDTO authorizationInfoResponseDTO = (AuthorizationInfoResponseDTO) o;
    return Objects.equals(this.allowed, authorizationInfoResponseDTO.allowed) &&
        Objects.equals(this.token, authorizationInfoResponseDTO.token) &&
        Objects.equals(this.location, authorizationInfoResponseDTO.location) &&
        Objects.equals(this.authorizationReference, authorizationInfoResponseDTO.authorizationReference) &&
        Objects.equals(this.info, authorizationInfoResponseDTO.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, token, location, authorizationReference, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationInfoResponseDTO {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    authorizationReference: ").append(toIndentedString(authorizationReference)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

