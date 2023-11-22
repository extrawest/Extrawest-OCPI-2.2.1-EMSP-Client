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

import java.util.Objects;

/**
 * VersionDto
 */
@JsonPropertyOrder({
        VersionDto.JSON_PROPERTY_VERSION,
        VersionDto.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class VersionDto {
    public static final String JSON_PROPERTY_VERSION = "version";
    public static final String JSON_PROPERTY_URL = "url";
    private VersionEnum version;
    private String url;
    public VersionDto() {
    }

    public VersionDto version(VersionEnum version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public VersionEnum getVersion() {
        return version;
    }

    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public VersionDto url(String url) {

        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionDto versionDto = (VersionDto) o;
        return Objects.equals(this.version, versionDto.version) &&
                Objects.equals(this.url, versionDto.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionDto {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    /**
     * Gets or Sets version
     */
    public enum VersionEnum {
        _0("2.0"),

        _1("2.1"),

        _1_1("2.1.1"),

        _2("2.2"),

        _2_1("2.2.1");

        private String value;

        VersionEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static VersionEnum fromValue(String value) {
            for (VersionEnum b : VersionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

