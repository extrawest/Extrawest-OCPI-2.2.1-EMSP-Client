package com.extrawest.ocpi.emsp.client.api;

import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.model.ResponseFormatSessionDto;
import com.extrawest.ocpi.emsp.client.model.SessionDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class EmspSessionsApi {
    private ApiClient apiClient;

    public EmspSessionsApi() {
        this(new ApiClient());
    }

    public EmspSessionsApi(ApiClient apiClient) {
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
     * @param sessionId   (required)
     * @return ResponseFormatSessionDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatSessionDto getSession(String countryCode, String partyId, String sessionId) throws RestClientException {
        return getSessionWithHttpInfo(countryCode, partyId, sessionId).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;ResponseFormatSessionDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatSessionDto> getSessionWithHttpInfo(String countryCode, String partyId, String sessionId) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getSession");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getSession");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling getSession");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ResponseFormatSessionDto> localReturnType = new ParameterizedTypeReference<ResponseFormatSessionDto>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/sessions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @param sessionDto  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchSession(String countryCode, String partyId, String sessionId, SessionDto sessionDto) throws RestClientException {
        patchSessionWithHttpInfo(countryCode, partyId, sessionId, sessionDto);
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @param sessionDto  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchSessionWithHttpInfo(String countryCode, String partyId, String sessionId, SessionDto sessionDto) throws RestClientException {
        Object localVarPostBody = sessionDto;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchSession");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchSession");
        }

        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling patchSession");
        }

        // verify the required parameter 'sessionDto' is set
        if (sessionDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionDto' when calling patchSession");
        }


        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/sessions", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @param sessionDto  (required)
     * @return ResponseFormatSessionDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatSessionDto putSession(String countryCode, String partyId, String sessionId, SessionDto sessionDto) throws RestClientException {
        return putSessionWithHttpInfo(countryCode, partyId, sessionId, sessionDto).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @param sessionDto  (required)
     * @return ResponseEntity&lt;ResponseFormatSessionDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatSessionDto> putSessionWithHttpInfo(String countryCode, String partyId, String sessionId, SessionDto sessionDto) throws RestClientException {
        Object localVarPostBody = sessionDto;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling putSession");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling putSession");
        }

        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling putSession");
        }

        // verify the required parameter 'sessionDto' is set
        if (sessionDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionDto' when calling putSession");
        }


        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatSessionDto> localReturnType = new ParameterizedTypeReference<ResponseFormatSessionDto>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/sessions", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
