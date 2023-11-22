package com.extrawest.ocpi.emsp.client.api;

import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.model.CDRDto;
import com.extrawest.ocpi.emsp.client.model.ResponseFormatCDRDto;
import com.extrawest.ocpi.emsp.client.model.ResponseFormatString;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class EmspCdrApi {
    private ApiClient apiClient;

    public EmspCdrApi() {
        this(new ApiClient());
    }

    public EmspCdrApi(ApiClient apiClient) {
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
     * @param id (required)
     * @return ResponseFormatCDRDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatCDRDto getCdr(String id) throws RestClientException {
        return getCdrWithHttpInfo(id).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;ResponseFormatCDRDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatCDRDto> getCdrWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCdr");
        }


        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatCDRDto> localReturnType = new ParameterizedTypeReference<ResponseFormatCDRDto>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/cdr", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param cdRDto (required)
     * @return ResponseFormatString
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatString postCdr(CDRDto cdRDto) throws RestClientException {
        return postCdrWithHttpInfo(cdRDto).getBody();
    }

    /**
     * 
     *
     * <p><b>200</b> - OK
     * @param cdRDto  (required)
     * @return ResponseEntity&lt;ResponseFormatString&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatString> postCdrWithHttpInfo(CDRDto cdRDto) throws RestClientException {
        Object localVarPostBody = cdRDto;

        // verify the required parameter 'cdRDto' is set
        if (cdRDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cdRDto' when calling postCdr");
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

        ParameterizedTypeReference<ResponseFormatString> localReturnType = new ParameterizedTypeReference<ResponseFormatString>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/cdr", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
