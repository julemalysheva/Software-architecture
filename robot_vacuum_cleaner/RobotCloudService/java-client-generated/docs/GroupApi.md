# GroupApi

All URIs are relative to *https://localhost:9669*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroup**](GroupApi.md#addGroup) | **POST** /Group | Добавить группу
[**deleteGroup**](GroupApi.md#deleteGroup) | **DELETE** /Group/deleteById/{groupId} | Удаляет группу по ID
[**getGroupById**](GroupApi.md#getGroupById) | **GET** /Group/findById/{groupId} | Найти группу по ID
[**updateGroup**](GroupApi.md#updateGroup) | **PUT** /Group | Обновить группу

<a name="addGroup"></a>
# **addGroup**
> Group addGroup(body)

Добавить группу

Добавить новую группу в базу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Group body = new Group(); // Group | Создание новой группы в базе
try {
    Group result = apiInstance.addGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#addGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Создание новой группы в базе |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addGroup"></a>
# **addGroup**
> Group addGroup(id, userId)

Добавить группу

Добавить новую группу в базу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Long id = 789L; // Long | 
Long userId = 789L; // Long | 
try {
    Group result = apiInstance.addGroup(id, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#addGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **userId** | **Long**|  |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(groupId, groupId)

Удаляет группу по ID

Удаляет группу по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | ID группы
String groupId = "groupId_example"; // String | 
try {
    apiInstance.deleteGroup(groupId, groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| ID группы |
 **groupId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGroupById"></a>
# **getGroupById**
> Group getGroupById(groupId)

Найти группу по ID

вернуть группу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Long groupId = 789L; // Long | Идентификатор группы
try {
    Group result = apiInstance.getGroupById(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Идентификатор группы |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateGroup"></a>
# **updateGroup**
> Group updateGroup(body)

Обновить группу

Обновить группу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Group body = new Group(); // Group | Обновить существующую группу в базе
try {
    Group result = apiInstance.updateGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Обновить существующую группу в базе |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateGroup"></a>
# **updateGroup**
> Group updateGroup(id, userId)

Обновить группу

Обновить группу

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Long id = 789L; // Long | 
Long userId = 789L; // Long | 
try {
    Group result = apiInstance.updateGroup(id, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **userId** | **Long**|  |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

