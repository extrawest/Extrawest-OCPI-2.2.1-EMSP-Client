# EmspLocationApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationEvseController**](EmspLocationApi.md#getLocationEvseController) | **GET** /emsp/api/2.2.1/locations |  |
| [**patchLocation**](EmspLocationApi.md#patchLocation) | **PATCH** /emsp/api/2.2.1/locations |  |
| [**pushLocation**](EmspLocationApi.md#pushLocation) | **PUT** /emsp/api/2.2.1/locations |  |



## getLocationEvseController

> Object getLocationEvseController(countryCode, partyId, locationId, evseUid, connectorId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspLocationApi apiInstance = new EmspLocationApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String locationId = "locationId_example"; // String | 
        String evseUid = "evseUid_example"; // String | 
        String connectorId = "connectorId_example"; // String | 
        try {
            Object result = apiInstance.getLocationEvseController(countryCode, partyId, locationId, evseUid, connectorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#getLocationEvseController");
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
| **locationId** | **String**|  | |
| **evseUid** | **String**|  | [optional] |
| **connectorId** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## patchLocation

> patchLocation(countryCode, partyId, locationId, locationDTO, evseUid, connectorId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspLocationApi apiInstance = new EmspLocationApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String locationId = "locationId_example"; // String | 
        LocationDTO locationDTO = new LocationDTO(); // LocationDTO | 
        String evseUid = "evseUid_example"; // String | 
        String connectorId = "connectorId_example"; // String | 
        try {
            apiInstance.patchLocation(countryCode, partyId, locationId, locationDTO, evseUid, connectorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#patchLocation");
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
| **locationId** | **String**|  | |
| **locationDTO** | [**LocationDTO**](LocationDTO.md)|  | |
| **evseUid** | **String**|  | [optional] |
| **connectorId** | **String**|  | [optional] |

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


## pushLocation

> pushLocation(countryCode, partyId, locationId, locationDTO, evseUid, connectorId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspLocationApi apiInstance = new EmspLocationApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String locationId = "locationId_example"; // String | 
        LocationDTO locationDTO = new LocationDTO(); // LocationDTO | 
        String evseUid = "evseUid_example"; // String | 
        String connectorId = "connectorId_example"; // String | 
        try {
            apiInstance.pushLocation(countryCode, partyId, locationId, locationDTO, evseUid, connectorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#pushLocation");
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
| **locationId** | **String**|  | |
| **locationDTO** | [**LocationDTO**](LocationDTO.md)|  | |
| **evseUid** | **String**|  | [optional] |
| **connectorId** | **String**|  | [optional] |

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

