# CpoCdrControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCdr1**](CpoCdrControllerApi.md#getCdr1) | **GET** /cpo/api/2.2.1/cdr |  |



## getCdr1

> List&lt;CdrDTO&gt; getCdr1(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpp.client.invoker.ApiClient;
import com.extrawest.ocpp.client.invoker.ApiException;
import com.extrawest.ocpp.client.invoker.Configuration;
import com.extrawest.ocpp.client.invoker.models.*;
import com.extrawest.ocpp.client.api.CpoCdrControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoCdrControllerApi apiInstance = new CpoCdrControllerApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 56; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            List<CdrDTO> result = apiInstance.getCdr1(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoCdrControllerApi#getCdr1");
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
| **dateFrom** | **OffsetDateTime**|  | |
| **dateTo** | **OffsetDateTime**|  | |
| **offset** | **Integer**|  | |
| **limit** | **Integer**|  | |

### Return type

[**List&lt;CdrDTO&gt;**](CdrDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
