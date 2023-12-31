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

import com.fasterxml.jackson.annotation.*;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * StatusSchedule
 */
@JsonPropertyOrder({
        StatusSchedule.JSON_PROPERTY_STATUS,
        StatusSchedule.JSON_PROPERTY_PERIOD_BEGIN,
        StatusSchedule.JSON_PROPERTY_PERIOD_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class StatusSchedule {
    public static final String JSON_PROPERTY_STATUS = "status";
    public static final String JSON_PROPERTY_PERIOD_BEGIN = "period_begin";
    public static final String JSON_PROPERTY_PERIOD_END = "period_end";
    private StatusEnum status;
    private OffsetDateTime periodBegin;
    private OffsetDateTime periodEnd;
    public StatusSchedule() {
    }

    public StatusSchedule status(StatusEnum status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StatusSchedule periodBegin(OffsetDateTime periodBegin) {

        this.periodBegin = periodBegin;
        return this;
    }

    /**
     * Get periodBegin
     * @return periodBegin
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PERIOD_BEGIN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getPeriodBegin() {
    return periodBegin;
    }

    @JsonProperty(JSON_PROPERTY_PERIOD_BEGIN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPeriodBegin(OffsetDateTime periodBegin) {
    this.periodBegin = periodBegin;
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      StatusSchedule statusSchedule = (StatusSchedule) o;
      return Objects.equals(this.status, statusSchedule.status) &&
              Objects.equals(this.periodBegin, statusSchedule.periodBegin) &&
              Objects.equals(this.periodEnd, statusSchedule.periodEnd);
  }


  public StatusSchedule periodEnd(OffsetDateTime periodEnd) {
    
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * Get periodEnd
   * @return periodEnd
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPeriodEnd() {
    return periodEnd;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodEnd(OffsetDateTime periodEnd) {
    this.periodEnd = periodEnd;
  }

  @Override
  public int hashCode() {
      return Objects.hash(status, periodBegin, periodEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
      sb.append("class StatusSchedule {\n");
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    periodBegin: ").append(toIndentedString(periodBegin)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    AVAILABLE("AVAILABLE"),

    BLOCKED("BLOCKED"),

    CHARGING("CHARGING"),

    INOPERATIVE("INOPERATIVE"),

    OUTOFORDER("OUTOFORDER"),

    PLANNED("PLANNED"),

    REMOVED("REMOVED"),

    RESERVED("RESERVED"),

    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
            return b;
        }
      }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
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

