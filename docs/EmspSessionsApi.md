# EmspSessionsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSession**](EmspSessionsApi.md#getSession) | **GET** /emsp/api/2.2.1/sessions |  |
| [**patchSession**](EmspSessionsApi.md#patchSession) | **PATCH** /emsp/api/2.2.1/sessions |  |
| [**putSession**](EmspSessionsApi.md#putSession) | **PUT** /emsp/api/2.2.1/sessions |  |



## getSession

> ResponseFormatSessionDto getSession(countryCode, partyId, sessionId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspSessionsApi apiInstance = new EmspSessionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            ResponseFormatSessionDto result = apiInstance.getSession(countryCode, partyId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspSessionsApi#getSession");
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
| **countryCode** | **String**|  | |
| **partyId** | **String**|  | |
| **sessionId** | **String**|  | |

### Return type

[**ResponseFormatSessionDto**](ResponseFormatSessionDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## patchSession

> patchSession(countryCode, partyId, sessionId, sessionDto)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspSessionsApi apiInstance = new EmspSessionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        SessionDto sessionDto = new SessionDto(); // SessionDto | 
        try {
            apiInstance.patchSession(countryCode, partyId, sessionId, sessionDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspSessionsApi#patchSession");
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
| **countryCode** | **String**|  | |
| **partyId** | **String**|  | |
| **sessionId** | **String**|  | |
| **sessionDto** | [**SessionDto**](SessionDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putSession

> ResponseFormatSessionDto putSession(countryCode, partyId, sessionId, sessionDto)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspSessionsApi apiInstance = new EmspSessionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        SessionDto sessionDto = new SessionDto(); // SessionDto | 
        try {
            ResponseFormatSessionDto result = apiInstance.putSession(countryCode, partyId, sessionId, sessionDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspSessionsApi#putSession");
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
| **countryCode** | **String**|  | |
| **partyId** | **String**|  | |
| **sessionId** | **String**|  | |
| **sessionDto** | [**SessionDto**](SessionDto.md)|  | |

### Return type

[**ResponseFormatSessionDto**](ResponseFormatSessionDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

