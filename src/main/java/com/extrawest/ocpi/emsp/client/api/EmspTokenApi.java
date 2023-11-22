package com.extrawest.ocpi.emsp.client.api;

import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.model.LocationReferencesDto;
import com.extrawest.ocpi.emsp.client.model.ResponseFormatAuthorizationInfoDto;
import com.extrawest.ocpi.emsp.client.model.ResponseFormatListTokenDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class EmspTokenApi {
    private ApiClient apiClient;

    public EmspTokenApi() {
        this(new ApiClient());
    }

    public EmspTokenApi(ApiClient apiClient) {
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
     * @param dateFrom (optional)
     * @param dateTo   (optional)
     * @param offset   (optional, default to 0)
     * @param limit    (optional)
     * @return ResponseFormatListTokenDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatListTokenDto getTokens(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getTokensWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return ResponseEntity&lt;ResponseFormatListTokenDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatListTokenDto> getTokensWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;


        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_from", dateFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_to", dateTo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatListTokenDto> localReturnType = new ParameterizedTypeReference<ResponseFormatListTokenDto>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/tokens", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param tokenUid  (required)
     * @param locationReferencesDto  (required)
     * @param type  (optional)
     * @return ResponseFormatAuthorizationInfoDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatAuthorizationInfoDto postToken(String tokenUid, LocationReferencesDto locationReferencesDto, String type) throws RestClientException {
        return postTokenWithHttpInfo(tokenUid, locationReferencesDto, type).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param tokenUid  (required)
     * @param locationReferencesDto  (required)
     * @param type  (optional)
     * @return ResponseEntity&lt;ResponseFormatAuthorizationInfoDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatAuthorizationInfoDto> postTokenWithHttpInfo(String tokenUid, LocationReferencesDto locationReferencesDto, String type) throws RestClientException {
        Object localVarPostBody = locationReferencesDto;

        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling postToken");
        }

        // verify the required parameter 'locationReferencesDto' is set
        if (locationReferencesDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationReferencesDto' when calling postToken");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("token_uid", tokenUid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatAuthorizationInfoDto> localReturnType = new ParameterizedTypeReference<ResponseFormatAuthorizationInfoDto>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/tokens/{token_uid}/authorize", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
