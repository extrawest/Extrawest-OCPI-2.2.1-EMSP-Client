package com.extrawest.ocpi.emsp.client.api;

import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.model.CommandResultRequestDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-30T00:02:35.798322+03:00[Europe/Kiev]")
public class EmspCommandsApi {
    private ApiClient apiClient;

    public EmspCommandsApi() {
        this(new ApiClient());
    }

    public EmspCommandsApi(ApiClient apiClient) {
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
     * @param commandType             (required)
     * @param uniqueId                (required)
     * @param commandResultRequestDTO (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postCommand(String commandType, String uniqueId, CommandResultRequestDTO commandResultRequestDTO) throws RestClientException {
        postCommandWithHttpInfo(commandType, uniqueId, commandResultRequestDTO);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param commandType             (required)
     * @param uniqueId                (required)
     * @param commandResultRequestDTO (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postCommandWithHttpInfo(String commandType, String uniqueId, CommandResultRequestDTO commandResultRequestDTO) throws RestClientException {
        Object localVarPostBody = commandResultRequestDTO;

        // verify the required parameter 'commandType' is set
        if (commandType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commandType' when calling postCommand");
        }

        // verify the required parameter 'uniqueId' is set
        if (uniqueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uniqueId' when calling postCommand");
        }

        // verify the required parameter 'commandResultRequestDTO' is set
        if (commandResultRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commandResultRequestDTO' when calling postCommand");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("commandType", commandType);
        uriVariables.put("uniqueId", uniqueId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {};
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/commands/{commandType}/{uniqueId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
