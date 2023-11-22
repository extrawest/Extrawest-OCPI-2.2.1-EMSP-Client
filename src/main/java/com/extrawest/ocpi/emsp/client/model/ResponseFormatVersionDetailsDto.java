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

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ResponseFormatVersionDetailsDto
 */
@JsonPropertyOrder({
        ResponseFormatVersionDetailsDto.JSON_PROPERTY_TIMESTAMP,
        ResponseFormatVersionDetailsDto.JSON_PROPERTY_DATA,
        ResponseFormatVersionDetailsDto.JSON_PROPERTY_STATUS_CODE,
        ResponseFormatVersionDetailsDto.JSON_PROPERTY_STATUS_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class ResponseFormatVersionDetailsDto {
    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    public static final String JSON_PROPERTY_DATA = "data";
    public static final String JSON_PROPERTY_STATUS_CODE = "status_code";
    public static final String JSON_PROPERTY_STATUS_MESSAGE = "status_message";
    private OffsetDateTime timestamp;
    private VersionDetailsDto data;
    private Integer statusCode;
    private String statusMessage;

    public ResponseFormatVersionDetailsDto() {
    }

    public ResponseFormatVersionDetailsDto timestamp(OffsetDateTime timestamp) {

        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }


    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }


    public ResponseFormatVersionDetailsDto data(VersionDetailsDto data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public VersionDetailsDto getData() {
        return data;
    }


    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(VersionDetailsDto data) {
        this.data = data;
    }


    public ResponseFormatVersionDetailsDto statusCode(Integer statusCode) {

        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get statusCode
     * minimum: 1000
     * maximum: 4999
     *
     * @return statusCode
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Integer getStatusCode() {
        return statusCode;
    }


    @JsonProperty(JSON_PROPERTY_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }


    public ResponseFormatVersionDetailsDto statusMessage(String statusMessage) {

        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Get statusMessage
     *
     * @return statusMessage
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getStatusMessage() {
        return statusMessage;
    }


    @JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseFormatVersionDetailsDto responseFormatVersionDetailsDto = (ResponseFormatVersionDetailsDto) o;
        return Objects.equals(this.timestamp, responseFormatVersionDetailsDto.timestamp) &&
                Objects.equals(this.data, responseFormatVersionDetailsDto.data) &&
                Objects.equals(this.statusCode, responseFormatVersionDetailsDto.statusCode) &&
                Objects.equals(this.statusMessage, responseFormatVersionDetailsDto.statusMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, data, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseFormatVersionDetailsDto {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

