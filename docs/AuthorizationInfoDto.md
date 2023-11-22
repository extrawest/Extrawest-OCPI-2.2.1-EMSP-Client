

# AuthorizationInfoDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowed** | [**AllowedEnum**](#AllowedEnum) |  |  |
|**token** | [**TokenDto**](TokenDto.md) |  |  |
|**location** | [**LocationReferencesDto**](LocationReferencesDto.md) |  |  [optional] |
|**authorizationReference** | **String** |  |  [optional] |
|**info** | [**DisplayText**](DisplayText.md) |  |  [optional] |



## Enum: AllowedEnum

| Name | Value |
|---- | -----|
| ALLOWED | &quot;ALLOWED&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| NO_CREDIT | &quot;NO_CREDIT&quot; |
| NOT_ALLOWED | &quot;NOT_ALLOWED&quot; |



