# EmspVersionApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVersionDetails**](EmspVersionApi.md#getVersionDetails) | **GET** /emsp/api/versions/details |  |
| [**getVersions**](EmspVersionApi.md#getVersions) | **GET** /emsp/api/versions |  |



## getVersionDetails

> ResponseFormatVersionDetailsDto getVersionDetails(version)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspVersionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspVersionApi apiInstance = new EmspVersionApi(defaultClient);
        String version = "version_example"; // String | 
        try {
            ResponseFormatVersionDetailsDto result = apiInstance.getVersionDetails(version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspVersionApi#getVersionDetails");
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
| **version** | **String**|  | |

### Return type

[**ResponseFormatVersionDetailsDto**](ResponseFormatVersionDetailsDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVersions

> ResponseFormatListVersionDto getVersions()



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspVersionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspVersionApi apiInstance = new EmspVersionApi(defaultClient);
        try {
            ResponseFormatListVersionDto result = apiInstance.getVersions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspVersionApi#getVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResponseFormatListVersionDto**](ResponseFormatListVersionDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

