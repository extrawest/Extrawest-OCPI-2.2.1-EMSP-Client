package com.extrawest.ocpi.emsp.client.api;

import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.model.Connector;
import com.extrawest.ocpi.emsp.client.model.EVSE;
import com.extrawest.ocpi.emsp.client.model.Location;
import com.extrawest.ocpi.emsp.client.model.ResponseFormatLocationData;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class EmspLocationApi {
    private ApiClient apiClient;

    public EmspLocationApi() {
        this(new ApiClient());
    }

    public EmspLocationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param connectorId (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData getConnector(String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        return getConnectorWithHttpInfo(countryCode, partyId, locationId, evseUid, connectorId).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param connectorId (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> getConnectorWithHttpInfo(String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getConnector");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getConnector");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getConnector");
        }

        // verify the required parameter 'evseUid' is set
        if (evseUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evseUid' when calling getConnector");
        }

        // verify the required parameter 'connectorId' is set
        if (connectorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectorId' when calling getConnector");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);
        uriVariables.put("evse_uid", evseUid);
        uriVariables.put("connector_id", connectorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}/{connector_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData getEvse(String countryCode, String partyId, String locationId, String evseUid) throws RestClientException {
        return getEvseWithHttpInfo(countryCode, partyId, locationId, evseUid).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> getEvseWithHttpInfo(String countryCode, String partyId, String locationId, String evseUid) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getEvse");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getEvse");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getEvse");
        }

        // verify the required parameter 'evseUid' is set
        if (evseUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evseUid' when calling getEvse");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);
        uriVariables.put("evse_uid", evseUid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData getLocation(String countryCode, String partyId, String locationId) throws RestClientException {
        return getLocationWithHttpInfo(countryCode, partyId, locationId).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> getLocationWithHttpInfo(String countryCode, String partyId, String locationId) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getLocation");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getLocation");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getLocation");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param connectorId (required)
     * @param connector   (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData patchConnector(String countryCode, String partyId, String locationId, String evseUid, String connectorId, Connector connector) throws RestClientException {
        return patchConnectorWithHttpInfo(countryCode, partyId, locationId, evseUid, connectorId, connector).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param connectorId (required)
     * @param connector   (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> patchConnectorWithHttpInfo(String countryCode, String partyId, String locationId, String evseUid, String connectorId, Connector connector) throws RestClientException {
        Object localVarPostBody = connector;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchConnector");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchConnector");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling patchConnector");
        }

        // verify the required parameter 'evseUid' is set
        if (evseUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evseUid' when calling patchConnector");
        }

        // verify the required parameter 'connectorId' is set
        if (connectorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectorId' when calling patchConnector");
        }

        // verify the required parameter 'connector' is set
        if (connector == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connector' when calling patchConnector");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);
        uriVariables.put("evse_uid", evseUid);
        uriVariables.put("connector_id", connectorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}/{connector_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param EVSE        (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData patchEvse(String countryCode, String partyId, String locationId, String evseUid, EVSE EVSE) throws RestClientException {
        return patchEvseWithHttpInfo(countryCode, partyId, locationId, evseUid, EVSE).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param EVSE        (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> patchEvseWithHttpInfo(String countryCode, String partyId, String locationId, String evseUid, EVSE EVSE) throws RestClientException {
        Object localVarPostBody = EVSE;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchEvse");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchEvse");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling patchEvse");
        }

        // verify the required parameter 'evseUid' is set
        if (evseUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evseUid' when calling patchEvse");
        }

        // verify the required parameter 'EVSE' is set
        if (EVSE == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'EVSE' when calling patchEvse");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);
        uriVariables.put("evse_uid", evseUid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param location    (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData patchLocation(String countryCode, String partyId, String locationId, Location location) throws RestClientException {
        return patchLocationWithHttpInfo(countryCode, partyId, locationId, location).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param location  (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> patchLocationWithHttpInfo(String countryCode, String partyId, String locationId, Location location) throws RestClientException {
        Object localVarPostBody = location;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchLocation");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchLocation");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling patchLocation");
        }

        // verify the required parameter 'location' is set
        if (location == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'location' when calling patchLocation");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param evseUid  (required)
     * @param connectorId  (required)
     * @param connector  (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData pushConnector(String countryCode, String partyId, String locationId, String evseUid, String connectorId, Connector connector) throws RestClientException {
        return pushConnectorWithHttpInfo(countryCode, partyId, locationId, evseUid, connectorId, connector).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param evseUid  (required)
     * @param connectorId  (required)
     * @param connector  (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> pushConnectorWithHttpInfo(String countryCode, String partyId, String locationId, String evseUid, String connectorId, Connector connector) throws RestClientException {
        Object localVarPostBody = connector;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling pushConnector");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling pushConnector");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling pushConnector");
        }

        // verify the required parameter 'evseUid' is set
        if (evseUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evseUid' when calling pushConnector");
        }

        // verify the required parameter 'connectorId' is set
        if (connectorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectorId' when calling pushConnector");
        }

        // verify the required parameter 'connector' is set
        if (connector == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connector' when calling pushConnector");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);
        uriVariables.put("evse_uid", evseUid);
        uriVariables.put("connector_id", connectorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}/{connector_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param EVSE        (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData pushEvse(String countryCode, String partyId, String locationId, String evseUid, EVSE EVSE) throws RestClientException {
        return pushEvseWithHttpInfo(countryCode, partyId, locationId, evseUid, EVSE).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param EVSE        (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> pushEvseWithHttpInfo(String countryCode, String partyId, String locationId, String evseUid, EVSE EVSE) throws RestClientException {
        Object localVarPostBody = EVSE;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling pushEvse");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling pushEvse");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling pushEvse");
        }

        // verify the required parameter 'evseUid' is set
        if (evseUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evseUid' when calling pushEvse");
        }

        // verify the required parameter 'EVSE' is set
        if (EVSE == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'EVSE' when calling pushEvse");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);
        uriVariables.put("evse_uid", evseUid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param location    (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData pushLocation(String countryCode, String partyId, String locationId, Location location) throws RestClientException {
        return pushLocationWithHttpInfo(countryCode, partyId, locationId, location).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param locationId  (required)
     * @param location    (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> pushLocationWithHttpInfo(String countryCode, String partyId, String locationId, Location location) throws RestClientException {
        Object localVarPostBody = location;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling pushLocation");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling pushLocation");
        }

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling pushLocation");
        }

        // verify the required parameter 'location' is set
        if (location == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'location' when calling pushLocation");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("location_id", locationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
