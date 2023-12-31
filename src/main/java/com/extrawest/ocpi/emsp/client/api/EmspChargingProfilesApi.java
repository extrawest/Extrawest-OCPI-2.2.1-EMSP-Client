package com.extrawest.ocpi.emsp.client.api;

import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.model.AbstractProfileResult;
import com.extrawest.ocpi.emsp.client.model.ActiveChargingProfile;
import com.extrawest.ocpi.emsp.client.model.ResponseFormatObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class EmspChargingProfilesApi {
    private ApiClient apiClient;

    public EmspChargingProfilesApi() {
        this(new ApiClient());
    }

    public EmspChargingProfilesApi(ApiClient apiClient) {
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
     * @param abstractProfileResult (required)
     * @return ResponseFormatObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatObject postChargingProfile(AbstractProfileResult abstractProfileResult) throws RestClientException {
        return postChargingProfileWithHttpInfo(abstractProfileResult).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param abstractProfileResult  (required)
     * @return ResponseEntity&lt;ResponseFormatObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatObject> postChargingProfileWithHttpInfo(AbstractProfileResult abstractProfileResult) throws RestClientException {
        Object localVarPostBody = abstractProfileResult;

        // verify the required parameter 'abstractProfileResult' is set
        if (abstractProfileResult == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'abstractProfileResult' when calling postChargingProfile");
        }


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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ResponseFormatObject> localReturnType = new ParameterizedTypeReference<ResponseFormatObject>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/chargingProfiles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param sessionId             (required)
     * @param activeChargingProfile (required)
     * @return ResponseFormatObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatObject putChargingProfile(String sessionId, ActiveChargingProfile activeChargingProfile) throws RestClientException {
        return putChargingProfileWithHttpInfo(sessionId, activeChargingProfile).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param activeChargingProfile  (required)
     * @return ResponseEntity&lt;ResponseFormatObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatObject> putChargingProfileWithHttpInfo(String sessionId, ActiveChargingProfile activeChargingProfile) throws RestClientException {
        Object localVarPostBody = activeChargingProfile;

        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling putChargingProfile");
        }

        // verify the required parameter 'activeChargingProfile' is set
        if (activeChargingProfile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'activeChargingProfile' when calling putChargingProfile");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_id", sessionId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ResponseFormatObject> localReturnType = new ParameterizedTypeReference<ResponseFormatObject>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/chargingProfiles/{session_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
