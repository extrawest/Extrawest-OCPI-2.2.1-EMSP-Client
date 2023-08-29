# EmspCommandsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postCommand**](EmspCommandsApi.md#postCommand) | **POST** /emsp/api/2.2.1/commands/{commandType}/{uniqueId} |  |



## postCommand

> postCommand(commandType, uniqueId, commandResultRequestDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.emsp.client.invoker.ApiClient;
import com.extrawest.ocpi.emsp.client.invoker.ApiException;
import com.extrawest.ocpi.emsp.client.invoker.Configuration;
import com.extrawest.ocpi.emsp.client.invoker.models.*;
import com.extrawest.ocpi.emsp.client.api.EmspCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCommandsApi apiInstance = new EmspCommandsApi(defaultClient);
        String commandType = "CANCEL_RESERVATION"; // String | 
        String uniqueId = "uniqueId_example"; // String | 
        CommandResultRequestDTO commandResultRequestDTO = new CommandResultRequestDTO(); // CommandResultRequestDTO | 
        try {
            apiInstance.postCommand(commandType, uniqueId, commandResultRequestDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCommandsApi#postCommand");
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
| **commandType** | **String**|  | [enum: CANCEL_RESERVATION, RESERVE_NOW, START_SESSION, STOP_SESSION, UNLOCK_CONNECTOR] |
| **uniqueId** | **String**|  | |
| **commandResultRequestDTO** | [**CommandResultRequestDTO**](CommandResultRequestDTO.md)|  | |

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

