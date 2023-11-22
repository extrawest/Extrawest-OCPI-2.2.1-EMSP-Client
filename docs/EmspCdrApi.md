# EmspCdrApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCdr**](EmspCdrApi.md#getCdr) | **GET** /emsp/api/2.2.1/cdr |  |
| [**postCdr**](EmspCdrApi.md#postCdr) | **POST** /emsp/api/2.2.1/cdr |  |



## getCdr

> ResponseFormatCDRDto getCdr(id)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspCdrApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCdrApi apiInstance = new EmspCdrApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ResponseFormatCDRDto result = apiInstance.getCdr(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCdrApi#getCdr");
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
| **id** | **String**|  | |

### Return type

[**ResponseFormatCDRDto**](ResponseFormatCDRDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postCdr

> ResponseFormatString postCdr(cdRDto)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspCdrApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCdrApi apiInstance = new EmspCdrApi(defaultClient);
        CDRDto cdRDto = new CDRDto(); // CDRDto | 
        try {
            ResponseFormatString result = apiInstance.postCdr(cdRDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCdrApi#postCdr");
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
| **cdRDto** | [**CDRDto**](CDRDto.md)|  | |

### Return type

[**ResponseFormatString**](ResponseFormatString.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

