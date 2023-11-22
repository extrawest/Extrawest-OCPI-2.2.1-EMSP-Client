# EmspLocationApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConnector**](EmspLocationApi.md#getConnector) | **GET** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}/{connector_id} |  |
| [**getEvse**](EmspLocationApi.md#getEvse) | **GET** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid} |  |
| [**getLocation**](EmspLocationApi.md#getLocation) | **GET** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id} |  |
| [**patchConnector**](EmspLocationApi.md#patchConnector) | **PATCH** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}/{connector_id} |  |
| [**patchEvse**](EmspLocationApi.md#patchEvse) | **PATCH** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid} |  |
| [**patchLocation**](EmspLocationApi.md#patchLocation) | **PATCH** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id} |  |
| [**pushConnector**](EmspLocationApi.md#pushConnector) | **PUT** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid}/{connector_id} |  |
| [**pushEvse**](EmspLocationApi.md#pushEvse) | **PUT** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id}/{evse_uid} |  |
| [**pushLocation**](EmspLocationApi.md#pushLocation) | **PUT** /emsp/api/2.2.1/locations/{country_code}/{party_id}/{location_id} |  |



## getConnector

> ResponseFormatLocationData getConnector(countryCode, partyId, locationId, evseUid, connectorId)



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
            ResponseFormatLocationData result = apiInstance.getConnector(countryCode, partyId, locationId, evseUid, connectorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#getConnector");
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
| **evseUid** | **String**|  | |
| **connectorId** | **String**|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getEvse

> ResponseFormatLocationData getEvse(countryCode, partyId, locationId, evseUid)



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
        try {
            ResponseFormatLocationData result = apiInstance.getEvse(countryCode, partyId, locationId, evseUid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#getEvse");
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
| **evseUid** | **String**|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getLocation

> ResponseFormatLocationData getLocation(countryCode, partyId, locationId)



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
        try {
            ResponseFormatLocationData result = apiInstance.getLocation(countryCode, partyId, locationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#getLocation");
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

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## patchConnector

> ResponseFormatLocationData patchConnector(countryCode, partyId, locationId, evseUid, connectorId, connector)



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
        Connector connector = new Connector(); // Connector | 
        try {
            ResponseFormatLocationData result = apiInstance.patchConnector(countryCode, partyId, locationId, evseUid, connectorId, connector);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#patchConnector");
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
| **evseUid** | **String**|  | |
| **connectorId** | **String**|  | |
| **connector** | [**Connector**](Connector.md)|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## patchEvse

> ResponseFormatLocationData patchEvse(countryCode, partyId, locationId, evseUid, EVSE)



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
        EVSE EVSE = new EVSE(); // EVSE | 
        try {
            ResponseFormatLocationData result = apiInstance.patchEvse(countryCode, partyId, locationId, evseUid, EVSE);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#patchEvse");
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
| **evseUid** | **String**|  | |
| **EVSE** | [**EVSE**](EVSE.md)|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## patchLocation

> ResponseFormatLocationData patchLocation(countryCode, partyId, locationId, location)



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
        Location location = new Location(); // Location | 
        try {
            ResponseFormatLocationData result = apiInstance.patchLocation(countryCode, partyId, locationId, location);
            System.out.println(result);
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
| **location** | [**Location**](Location.md)|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## pushConnector

> ResponseFormatLocationData pushConnector(countryCode, partyId, locationId, evseUid, connectorId, connector)



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
        Connector connector = new Connector(); // Connector | 
        try {
            ResponseFormatLocationData result = apiInstance.pushConnector(countryCode, partyId, locationId, evseUid, connectorId, connector);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#pushConnector");
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
| **evseUid** | **String**|  | |
| **connectorId** | **String**|  | |
| **connector** | [**Connector**](Connector.md)|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## pushEvse

> ResponseFormatLocationData pushEvse(countryCode, partyId, locationId, evseUid, EVSE)



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
        EVSE EVSE = new EVSE(); // EVSE | 
        try {
            ResponseFormatLocationData result = apiInstance.pushEvse(countryCode, partyId, locationId, evseUid, EVSE);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspLocationApi#pushEvse");
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
| **evseUid** | **String**|  | |
| **EVSE** | [**EVSE**](EVSE.md)|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## pushLocation

> ResponseFormatLocationData pushLocation(countryCode, partyId, locationId, location)



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
        Location location = new Location(); // Location | 
        try {
            ResponseFormatLocationData result = apiInstance.pushLocation(countryCode, partyId, locationId, location);
            System.out.println(result);
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
| **location** | [**Location**](Location.md)|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

