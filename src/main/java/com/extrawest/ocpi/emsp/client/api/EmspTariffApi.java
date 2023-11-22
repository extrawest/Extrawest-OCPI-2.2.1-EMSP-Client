package com.extrawest.ocpi.emsp.client.api;

import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.model.ResponseFormatTariffDto;
import com.extrawest.ocpi.emsp.client.model.TariffDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T18:56:56.429779+02:00[Europe/Kiev]")
public class EmspTariffApi {
    private ApiClient apiClient;

    public EmspTariffApi() {
        this(new ApiClient());
    }

    public EmspTariffApi(ApiClient apiClient) {
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
     * @param tariffId    (required)
     * @return ResponseFormatTariffDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatTariffDto deleteTariff(String countryCode, String partyId, String tariffId) throws RestClientException {
        return deleteTariffWithHttpInfo(countryCode, partyId, tariffId).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @return ResponseEntity&lt;ResponseFormatTariffDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatTariffDto> deleteTariffWithHttpInfo(String countryCode, String partyId, String tariffId) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling deleteTariff");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling deleteTariff");
        }
        
        // verify the required parameter 'tariffId' is set
        if (tariffId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tariffId' when calling deleteTariff");
        }


        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tariff_id", tariffId));

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatTariffDto> localReturnType = new ParameterizedTypeReference<ResponseFormatTariffDto>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/tariffs", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @return ResponseFormatTariffDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatTariffDto getTariff(String countryCode, String partyId, String tariffId) throws RestClientException {
        return getTariffWithHttpInfo(countryCode, partyId, tariffId).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @return ResponseEntity&lt;ResponseFormatTariffDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatTariffDto> getTariffWithHttpInfo(String countryCode, String partyId, String tariffId) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getTariff");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getTariff");
        }
        
        // verify the required parameter 'tariffId' is set
        if (tariffId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tariffId' when calling getTariff");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tariff_id", tariffId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ResponseFormatTariffDto> localReturnType = new ParameterizedTypeReference<ResponseFormatTariffDto>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/tariffs", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @param tariffDto  (required)
     * @return ResponseFormatTariffDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatTariffDto saveTariff(String countryCode, String partyId, String tariffId, TariffDto tariffDto) throws RestClientException {
        return saveTariffWithHttpInfo(countryCode, partyId, tariffId, tariffDto).getBody();
    }

    /**
     *
     *
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @param tariffDto  (required)
     * @return ResponseEntity&lt;ResponseFormatTariffDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatTariffDto> saveTariffWithHttpInfo(String countryCode, String partyId, String tariffId, TariffDto tariffDto) throws RestClientException {
        Object localVarPostBody = tariffDto;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling saveTariff");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling saveTariff");
        }

        // verify the required parameter 'tariffId' is set
        if (tariffId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tariffId' when calling saveTariff");
        }

        // verify the required parameter 'tariffDto' is set
        if (tariffDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tariffDto' when calling saveTariff");
        }


        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tariff_id", tariffId));

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatTariffDto> localReturnType = new ParameterizedTypeReference<ResponseFormatTariffDto>() {
        };
        return apiClient.invokeAPI("/emsp/api/2.2.1/tariffs", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
