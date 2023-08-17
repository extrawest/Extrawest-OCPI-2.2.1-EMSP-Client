# CpoLocationControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationEvseController1**](CpoLocationControllerApi.md#getLocationEvseController1) | **GET** /cpo/api/2.2.1/locations |  |
| [**getLocations**](CpoLocationControllerApi.md#getLocations) | **GET** /cpo/api/2.2.1/locations/getLocations |  |



## getLocationEvseController1

> Object getLocationEvseController1(locationId, evseUid, connectorId)



### Example

```java
// Import classes:
import com.extrawest.ocpp.client.invoker.ApiClient;
import com.extrawest.ocpp.client.invoker.ApiException;
import com.extrawest.ocpp.client.invoker.Configuration;
import com.extrawest.ocpp.client.invoker.models.*;
import com.extrawest.ocpp.client.api.CpoLocationControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoLocationControllerApi apiInstance = new CpoLocationControllerApi(defaultClient);
        String locationId = "locationId_example"; // String | 
        String evseUid = "evseUid_example"; // String | 
        String connectorId = "connectorId_example"; // String | 
        try {
            Object result = apiInstance.getLocationEvseController1(locationId, evseUid, connectorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoLocationControllerApi#getLocationEvseController1");
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


## getLocations

> List&lt;LocationDTO&gt; getLocations(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpp.client.invoker.ApiClient;
import com.extrawest.ocpp.client.invoker.ApiException;
import com.extrawest.ocpp.client.invoker.Configuration;
import com.extrawest.ocpp.client.invoker.models.*;
import com.extrawest.ocpp.client.api.CpoLocationControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoLocationControllerApi apiInstance = new CpoLocationControllerApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 0; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            List<LocationDTO> result = apiInstance.getLocations(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoLocationControllerApi#getLocations");
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
| **dateFrom** | **OffsetDateTime**|  | [optional] |
| **dateTo** | **OffsetDateTime**|  | [optional] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**List&lt;LocationDTO&gt;**](LocationDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
