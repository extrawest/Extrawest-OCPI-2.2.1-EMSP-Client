package com.extrawest.ocpp.client.api;

import com.extrawest.ocpp.client.invoker.ApiClient;
import com.extrawest.ocpp.client.model.VersionDetailsResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T22:04:36.538444+03:00[Europe/Kiev]")
@Component("com.extrawest.ocpp.client.api.EmspVersionControllerApi")
public class EmspVersionControllerApi {
    private ApiClient apiClient;

    public EmspVersionControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmspVersionControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param version  (required)
     * @return VersionDetailsResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VersionDetailsResponseDTO getVersionDetails(String version) throws RestClientException {
        return getVersionDetailsWithHttpInfo(version).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param version  (required)
     * @return ResponseEntity&lt;VersionDetailsResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VersionDetailsResponseDTO> getVersionDetailsWithHttpInfo(String version) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getVersionDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("version", version);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<VersionDetailsResponseDTO> localReturnType = new ParameterizedTypeReference<VersionDetailsResponseDTO>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/versions/details/{version}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
