# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activeLotsGet**](DefaultApi.md#activeLotsGet) | **GET** /active/lots | Отримати активні лоти |
| [**allLotsGet**](DefaultApi.md#allLotsGet) | **GET** /all/lots | Отримати всі лоти |
| [**allUsersGet**](DefaultApi.md#allUsersGet) | **GET** /all/users | Отримати всіх користувачів |
| [**deleteGet**](DefaultApi.md#deleteGet) | **GET** /delete | Видалити лот за ідентифікатором |
| [**generateGet**](DefaultApi.md#generateGet) | **GET** /generate | Згенерувати URL лоту |
| [**saveUserPost**](DefaultApi.md#saveUserPost) | **POST** /save/user | Зберегти нового користувача |
| [**searchLotByIdGet**](DefaultApi.md#searchLotByIdGet) | **GET** /search/lot/by/id | Перегляд лоту за ідентифікатором |
| [**searchLotGet**](DefaultApi.md#searchLotGet) | **GET** /search/lot | Пошук лоту за назвою |
| [**searchUserGet**](DefaultApi.md#searchUserGet) | **GET** /search/user | Пошук користувача за ідентифікатором |
| [**startAuctionPost**](DefaultApi.md#startAuctionPost) | **POST** /start/auction | Розпочати аукціон для лоту |
| [**stopAuctionPost**](DefaultApi.md#stopAuctionPost) | **POST** /stop/auction | Завершити аукціон для лоту |
| [**updatePricePost**](DefaultApi.md#updatePricePost) | **POST** /update/price | Оновити ціну лоту за назвою |


<a name="activeLotsGet"></a>
# **activeLotsGet**
> List&lt;Lot&gt; activeLotsGet()

Отримати активні лоти

Повертає список активних лотів, які доступні для участі в торгах.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Lot> result = apiInstance.activeLotsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#activeLotsGet");
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

[**List&lt;Lot&gt;**](Lot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успішний запит |  -  |

<a name="allLotsGet"></a>
# **allLotsGet**
> List&lt;Lot&gt; allLotsGet()

Отримати всі лоти

Повертає список усіх лотів, які зберігаються в системі.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Lot> result = apiInstance.allLotsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allLotsGet");
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

[**List&lt;Lot&gt;**](Lot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успішний запит |  -  |

<a name="allUsersGet"></a>
# **allUsersGet**
> List&lt;User&gt; allUsersGet()

Отримати всіх користувачів

Повертає список усіх користувачів, які зареєстровані в системі.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<User> result = apiInstance.allUsersGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allUsersGet");
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

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успішний запит |  -  |

<a name="deleteGet"></a>
# **deleteGet**
> deleteGet(id)

Видалити лот за ідентифікатором

Видаляє лот за його ідентифікатором.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 56; // Integer | Ідентифікатор лоту, який ви хочете видалити.
    try {
      apiInstance.deleteGet(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteGet");
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
| **id** | **Integer**| Ідентифікатор лоту, який ви хочете видалити. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Лот видалено успішно |  -  |

<a name="generateGet"></a>
# **generateGet**
> String generateGet(id)

Згенерувати URL лоту

Генерує URL для лоту за його ідентифікатором.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 56; // Integer | Ідентифікатор лоту, для якого потрібно згенерувати URL.
    try {
      String result = apiInstance.generateGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#generateGet");
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
| **id** | **Integer**| Ідентифікатор лоту, для якого потрібно згенерувати URL. | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успішний запит |  -  |

<a name="saveUserPost"></a>
# **saveUserPost**
> saveUserPost(user)

Зберегти нового користувача

Зберігає нового користувача в системі.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    User user = new User(); // User | 
    try {
      apiInstance.saveUserPost(user);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#saveUserPost");
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
| **user** | [**User**](User.md)|  | [optional] |

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
| **201** | Користувача збережено успішно |  -  |

<a name="searchLotByIdGet"></a>
# **searchLotByIdGet**
> Lot searchLotByIdGet(id)

Перегляд лоту за ідентифікатором

Повертає інформацію про лот за його ідентифікатором.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 56; // Integer | Ідентифікатор лоту, який ви хочете переглянути.
    try {
      Lot result = apiInstance.searchLotByIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#searchLotByIdGet");
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
| **id** | **Integer**| Ідентифікатор лоту, який ви хочете переглянути. | |

### Return type

[**Lot**](Lot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успішний запит |  -  |

<a name="searchLotGet"></a>
# **searchLotGet**
> List&lt;Lot&gt; searchLotGet(title)

Пошук лоту за назвою

Повертає список лотів, які містять задану назву у своєму описі.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String title = "title_example"; // String | Назва лоту, за якою ви хочете здійснити пошук.
    try {
      List<Lot> result = apiInstance.searchLotGet(title);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#searchLotGet");
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
| **title** | **String**| Назва лоту, за якою ви хочете здійснити пошук. | |

### Return type

[**List&lt;Lot&gt;**](Lot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успішний запит |  -  |

<a name="searchUserGet"></a>
# **searchUserGet**
> User searchUserGet(id)

Пошук користувача за ідентифікатором

Повертає інформацію про користувача за його ідентифікатором.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 56; // Integer | Ідентифікатор користувача, якого ви хочете знайти.
    try {
      User result = apiInstance.searchUserGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#searchUserGet");
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
| **id** | **Integer**| Ідентифікатор користувача, якого ви хочете знайти. | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успішний запит |  -  |

<a name="startAuctionPost"></a>
# **startAuctionPost**
> startAuctionPost(id)

Розпочати аукціон для лоту

Розпочинає аукціон для лоту за його ідентифікатором.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 56; // Integer | Ідентифікатор лоту, для якого потрібно розпочати аукціон.
    try {
      apiInstance.startAuctionPost(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#startAuctionPost");
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
| **id** | **Integer**| Ідентифікатор лоту, для якого потрібно розпочати аукціон. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Аукціон розпочато успішно |  -  |

<a name="stopAuctionPost"></a>
# **stopAuctionPost**
> stopAuctionPost(id)

Завершити аукціон для лоту

Завершує аукціон для лоту за його ідентифікатором.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 56; // Integer | Ідентифікатор лоту, для якого потрібно завершити аукціон.
    try {
      apiInstance.stopAuctionPost(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#stopAuctionPost");
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
| **id** | **Integer**| Ідентифікатор лоту, для якого потрібно завершити аукціон. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Аукціон завершено успішно |  -  |

<a name="updatePricePost"></a>
# **updatePricePost**
> updatePricePost(lotTitle, newPrice)

Оновити ціну лоту за назвою

Оновлює ціну лоту за назвою лоту.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String lotTitle = "lotTitle_example"; // String | Назва лоту, для якого потрібно оновити ціну.
    Integer newPrice = 56; // Integer | Нова ціна лоту.
    try {
      apiInstance.updatePricePost(lotTitle, newPrice);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updatePricePost");
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
| **lotTitle** | **String**| Назва лоту, для якого потрібно оновити ціну. | |
| **newPrice** | **Integer**| Нова ціна лоту. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Ціну лоту оновлено успішно |  -  |

