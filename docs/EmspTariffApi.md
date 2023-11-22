# EmspTariffApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTariff**](EmspTariffApi.md#deleteTariff) | **DELETE** /emsp/api/2.2.1/tariffs |  |
| [**getTariff**](EmspTariffApi.md#getTariff) | **GET** /emsp/api/2.2.1/tariffs |  |
| [**saveTariff**](EmspTariffApi.md#saveTariff) | **PUT** /emsp/api/2.2.1/tariffs |  |



## deleteTariff

> ResponseFormatTariffDto deleteTariff(countryCode, partyId, tariffId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspTariffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspTariffApi apiInstance = new EmspTariffApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tariffId = "tariffId_example"; // String | 
        try {
            ResponseFormatTariffDto result = apiInstance.deleteTariff(countryCode, partyId, tariffId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspTariffApi#deleteTariff");
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
| **tariffId** | **String**|  | |

### Return type

[**ResponseFormatTariffDto**](ResponseFormatTariffDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTariff

> ResponseFormatTariffDto getTariff(countryCode, partyId, tariffId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspTariffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspTariffApi apiInstance = new EmspTariffApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tariffId = "tariffId_example"; // String | 
        try {
            ResponseFormatTariffDto result = apiInstance.getTariff(countryCode, partyId, tariffId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspTariffApi#getTariff");
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
| **tariffId** | **String**|  | |

### Return type

[**ResponseFormatTariffDto**](ResponseFormatTariffDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## saveTariff

> ResponseFormatTariffDto saveTariff(countryCode, partyId, tariffId, tariffDto)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspTariffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspTariffApi apiInstance = new EmspTariffApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tariffId = "tariffId_example"; // String | 
        TariffDto tariffDto = new TariffDto(); // TariffDto | 
        try {
            ResponseFormatTariffDto result = apiInstance.saveTariff(countryCode, partyId, tariffId, tariffDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspTariffApi#saveTariff");
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
| **tariffId** | **String**|  | |
| **tariffDto** | [**TariffDto**](TariffDto.md)|  | |

### Return type

[**ResponseFormatTariffDto**](ResponseFormatTariffDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

