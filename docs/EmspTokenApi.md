# EmspTokenApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTokens**](EmspTokenApi.md#getTokens) | **GET** /emsp/api/2.2.1/tokens |  |
| [**postToken**](EmspTokenApi.md#postToken) | **POST** /emsp/api/2.2.1/tokens/{token_uid}/authorize |  |



## getTokens

> ResponseFormatListTokenDto getTokens(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspTokenApi apiInstance = new EmspTokenApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 0; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            ResponseFormatListTokenDto result = apiInstance.getTokens(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspTokenApi#getTokens");
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

[**ResponseFormatListTokenDto**](ResponseFormatListTokenDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postToken

> ResponseFormatAuthorizationInfoDto postToken(tokenUid, locationReferencesDto, type)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspTokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspTokenApi apiInstance = new EmspTokenApi(defaultClient);
        String tokenUid = "tokenUid_example"; // String | 
        LocationReferencesDto locationReferencesDto = new LocationReferencesDto(); // LocationReferencesDto | 
        String type = "type_example"; // String | 
        try {
            ResponseFormatAuthorizationInfoDto result = apiInstance.postToken(tokenUid, locationReferencesDto, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspTokenApi#postToken");
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
| **tokenUid** | **String**|  | |
| **locationReferencesDto** | [**LocationReferencesDto**](LocationReferencesDto.md)|  | |
| **type** | **String**|  | [optional] |

### Return type

[**ResponseFormatAuthorizationInfoDto**](ResponseFormatAuthorizationInfoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

