# ScheduleApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSchedule**](ScheduleApi.md#addSchedule) | **POST** /Schedule | Добавить расписание
[**deleteSchedule**](ScheduleApi.md#deleteSchedule) | **DELETE** /Schedule/deleteById/{Id} | Удаляет расписание по ID
[**getScheduleById**](ScheduleApi.md#getScheduleById) | **GET** /Schedule/findById/{Id} | Найти ркасписание по ID
[**updateSchedule**](ScheduleApi.md#updateSchedule) | **PUT** /Schedule | Обновить расписание

<a name="addSchedule"></a>
# **addSchedule**
> Schedule addSchedule(body)

Добавить расписание

Добавить расписание в базу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Schedule body = new Schedule(); // Schedule | Создать новое расписание в базе
try {
    Schedule result = apiInstance.addSchedule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#addSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Schedule**](Schedule.md)| Создать новое расписание в базе |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addSchedule"></a>
# **addSchedule**
> Schedule addSchedule(id, dateTime, mode, robotId)

Добавить расписание

Добавить расписание в базу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long id = 789L; // Long | 
String dateTime = "dateTime_example"; // String | 
Long mode = 789L; // Long | 
Long robotId = 789L; // Long | 
try {
    Schedule result = apiInstance.addSchedule(id, dateTime, mode, robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#addSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **dateTime** | **String**|  |
 **mode** | **Long**|  |
 **robotId** | **Long**|  |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteSchedule"></a>
# **deleteSchedule**
> deleteSchedule(id, id)

Удаляет расписание по ID

Удаляет расписание по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long id = 789L; // Long | ID расписания
String id = "id_example"; // String | 
try {
    apiInstance.deleteSchedule(id, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#deleteSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID расписания |
 **id** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getScheduleById"></a>
# **getScheduleById**
> Schedule getScheduleById(id)

Найти ркасписание по ID

вернуть одно расписание

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long id = 789L; // Long | Идентификатор расписания
try {
    Schedule result = apiInstance.getScheduleById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#getScheduleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Идентификатор расписания |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateSchedule"></a>
# **updateSchedule**
> Schedule updateSchedule(body)

Обновить расписание

Обновить расписание

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Schedule body = new Schedule(); // Schedule | Обновить существующее расписание в базе
try {
    Schedule result = apiInstance.updateSchedule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#updateSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Schedule**](Schedule.md)| Обновить существующее расписание в базе |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateSchedule"></a>
# **updateSchedule**
> Schedule updateSchedule(id, dateTime, mode, robotId)

Обновить расписание

Обновить расписание

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long id = 789L; // Long | 
String dateTime = "dateTime_example"; // String | 
Long mode = 789L; // Long | 
Long robotId = 789L; // Long | 
try {
    Schedule result = apiInstance.updateSchedule(id, dateTime, mode, robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#updateSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **dateTime** | **String**|  |
 **mode** | **Long**|  |
 **robotId** | **Long**|  |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

