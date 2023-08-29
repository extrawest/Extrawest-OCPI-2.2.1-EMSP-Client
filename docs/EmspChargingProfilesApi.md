# EmspChargingProfilesApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postChargingProfile**](EmspChargingProfilesApi.md#postChargingProfile) | **POST** /emsp/api/2.2.1/chargingProfiles |  |
| [**putChargingProfile**](EmspChargingProfilesApi.md#putChargingProfile) | **PUT** /emsp/api/2.2.1/chargingProfiles/{session_id} |  |



## postChargingProfile

> ResponseFormat postChargingProfile(abstractProfileResult)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspChargingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspChargingProfilesApi apiInstance = new EmspChargingProfilesApi(defaultClient);
        AbstractProfileResult abstractProfileResult = new AbstractProfileResult(); // AbstractProfileResult | 
        try {
            ResponseFormat result = apiInstance.postChargingProfile(abstractProfileResult);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspChargingProfilesApi#postChargingProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **abstractProfileResult** | [**AbstractProfileResult**](AbstractProfileResult.md)|  | |

### Return type

[**ResponseFormat**](ResponseFormat.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putChargingProfile

> ResponseFormat putChargingProfile(sessionId, activeChargingProfileRequestDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspChargingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspChargingProfilesApi apiInstance = new EmspChargingProfilesApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        ActiveChargingProfileRequestDTO activeChargingProfileRequestDTO = new ActiveChargingProfileRequestDTO(); // ActiveChargingProfileRequestDTO | 
        try {
            ResponseFormat result = apiInstance.putChargingProfile(sessionId, activeChargingProfileRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspChargingProfilesApi#putChargingProfile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**|  | |
| **activeChargingProfileRequestDTO** | [**ActiveChargingProfileRequestDTO**](ActiveChargingProfileRequestDTO.md)|  | |

### Return type

[**ResponseFormat**](ResponseFormat.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

