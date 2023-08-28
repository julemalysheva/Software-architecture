# RobotApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRobot**](RobotApi.md#addRobot) | **POST** /Robot | Добавить робота
[**deleteRobot**](RobotApi.md#deleteRobot) | **DELETE** /Robot/deleteById/{robotId} | Удаляет робота
[**getRobotById**](RobotApi.md#getRobotById) | **GET** /Robot/findById/{robotId} | Найти робота по ID
[**updateRobot**](RobotApi.md#updateRobot) | **PUT** /Robot | Обновить робота

<a name="addRobot"></a>
# **addRobot**
> Robot addRobot(body)

Добавить робота

Добавить робота в базу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Robot body = new Robot(); // Robot | Создание нового робота в базе
try {
    Robot result = apiInstance.addRobot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#addRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Robot**](Robot.md)| Создание нового робота в базе |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addRobot"></a>
# **addRobot**
> Robot addRobot(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId)

Добавить робота

Добавить робота в базу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long id = 789L; // Long | 
String model = "model_example"; // String | 
String version = "version_example"; // String | 
Long charge = 789L; // Long | 
Long garbageContainer = 789L; // Long | 
Long robotPollution = 789L; // Long | 
Long nextService = 789L; // Long | 
String serialNumber = "serialNumber_example"; // String | 
Long ipAddress = 789L; // Long | 
Long groupId = 789L; // Long | 
try {
    Robot result = apiInstance.addRobot(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#addRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **model** | **String**|  |
 **version** | **String**|  |
 **charge** | **Long**|  |
 **garbageContainer** | **Long**|  |
 **robotPollution** | **Long**|  |
 **nextService** | **Long**|  |
 **serialNumber** | **String**|  |
 **ipAddress** | **Long**|  |
 **groupId** | **Long**|  |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteRobot"></a>
# **deleteRobot**
> deleteRobot(robotId, robotId)

Удаляет робота

Удаляет робота

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | ID робота
String robotId = "robotId_example"; // String | 
try {
    apiInstance.deleteRobot(robotId, robotId);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#deleteRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| ID робота |
 **robotId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRobotById"></a>
# **getRobotById**
> Robot getRobotById(robotId)

Найти робота по ID

вернуть робота

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | Идентификатор робота
try {
    Robot result = apiInstance.getRobotById(robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#getRobotById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| Идентификатор робота |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateRobot"></a>
# **updateRobot**
> Robot updateRobot(body)

Обновить робота

Обновить робота

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Robot body = new Robot(); // Robot | Обновить существующего робота в базе
try {
    Robot result = apiInstance.updateRobot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#updateRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Robot**](Robot.md)| Обновить существующего робота в базе |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateRobot"></a>
# **updateRobot**
> Robot updateRobot(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId)

Обновить робота

Обновить робота

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long id = 789L; // Long | 
String model = "model_example"; // String | 
String version = "version_example"; // String | 
Long charge = 789L; // Long | 
Long garbageContainer = 789L; // Long | 
Long robotPollution = 789L; // Long | 
Long nextService = 789L; // Long | 
String serialNumber = "serialNumber_example"; // String | 
Long ipAddress = 789L; // Long | 
Long groupId = 789L; // Long | 
try {
    Robot result = apiInstance.updateRobot(id, model, version, charge, garbageContainer, robotPollution, nextService, serialNumber, ipAddress, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#updateRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **model** | **String**|  |
 **version** | **String**|  |
 **charge** | **Long**|  |
 **garbageContainer** | **Long**|  |
 **robotPollution** | **Long**|  |
 **nextService** | **Long**|  |
 **serialNumber** | **String**|  |
 **ipAddress** | **Long**|  |
 **groupId** | **Long**|  |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

