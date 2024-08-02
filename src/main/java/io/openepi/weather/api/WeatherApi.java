/*
 * Weather API
 * This is a RESTful service that provides accurate and up-to-date weather information based on data sourced from <a href=\"https://api.met.no\">https://api.met.no</a>. <br/>The data are freely available for use under a <a href=\"https://api.met.no/doc/License\">Creative Commons license</a>.
 *
 * The version of the OpenAPI document: 0.1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.weather.api;

import io.openepi.weather.Configuration;
import io.openepi.weather.ApiClient;
import io.openepi.common.ApiCallback;
import io.openepi.common.ApiException;
import io.openepi.common.ApiResponse;
import io.openepi.common.Pair;
import io.openepi.common.ProgressRequestBody;
import io.openepi.common.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import io.openepi.weather.model.HTTPValidationError;
import io.openepi.weather.model.METJSONForecast;
import io.openepi.weather.model.METJSONSunrise;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WeatherApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WeatherApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getForecastLocationforecastGet
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param altitude Altitude above sea level in meters. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getForecastLocationforecastGetCall(BigDecimal lat, BigDecimal lon, Integer altitude, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/locationforecast";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (lat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lat", lat));
        }

        if (lon != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lon", lon));
        }

        if (altitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("altitude", altitude));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getForecastLocationforecastGetValidateBeforeCall(BigDecimal lat, BigDecimal lon, Integer altitude, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getForecastLocationforecastGet(Async)");
        }

        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getForecastLocationforecastGet(Async)");
        }

        return getForecastLocationforecastGetCall(lat, lon, altitude, _callback);

    }

    /**
     * Get weather forecast
     * Returns the weather forecast for the next 9 days for the given location
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param altitude Altitude above sea level in meters. (optional)
     * @return METJSONForecast
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public METJSONForecast getForecastLocationforecastGet(BigDecimal lat, BigDecimal lon, Integer altitude) throws ApiException {
        ApiResponse<METJSONForecast> localVarResp = getForecastLocationforecastGetWithHttpInfo(lat, lon, altitude);
        return localVarResp.getData();
    }

    /**
     * Get weather forecast
     * Returns the weather forecast for the next 9 days for the given location
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param altitude Altitude above sea level in meters. (optional)
     * @return ApiResponse&lt;METJSONForecast&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<METJSONForecast> getForecastLocationforecastGetWithHttpInfo(BigDecimal lat, BigDecimal lon, Integer altitude) throws ApiException {
        okhttp3.Call localVarCall = getForecastLocationforecastGetValidateBeforeCall(lat, lon, altitude, null);
        Type localVarReturnType = new TypeToken<METJSONForecast>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get weather forecast (asynchronously)
     * Returns the weather forecast for the next 9 days for the given location
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param altitude Altitude above sea level in meters. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getForecastLocationforecastGetAsync(BigDecimal lat, BigDecimal lon, Integer altitude, final ApiCallback<METJSONForecast> _callback) throws ApiException {

        okhttp3.Call localVarCall = getForecastLocationforecastGetValidateBeforeCall(lat, lon, altitude, _callback);
        Type localVarReturnType = new TypeToken<METJSONForecast>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSunriseSunriseGet
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param date Date (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSunriseSunriseGetCall(BigDecimal lat, BigDecimal lon, String date, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sunrise";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (lat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lat", lat));
        }

        if (lon != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lon", lon));
        }

        if (date != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date", date));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSunriseSunriseGetValidateBeforeCall(BigDecimal lat, BigDecimal lon, String date, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling getSunriseSunriseGet(Async)");
        }

        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling getSunriseSunriseGet(Async)");
        }

        return getSunriseSunriseGetCall(lat, lon, date, _callback);

    }

    /**
     * Get sunrise and sunset information
     * Returns the sunrise time and sunset time for the given location
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param date Date (optional)
     * @return METJSONSunrise
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public METJSONSunrise getSunriseSunriseGet(BigDecimal lat, BigDecimal lon, String date) throws ApiException {
        ApiResponse<METJSONSunrise> localVarResp = getSunriseSunriseGetWithHttpInfo(lat, lon, date);
        return localVarResp.getData();
    }

    /**
     * Get sunrise and sunset information
     * Returns the sunrise time and sunset time for the given location
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param date Date (optional)
     * @return ApiResponse&lt;METJSONSunrise&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<METJSONSunrise> getSunriseSunriseGetWithHttpInfo(BigDecimal lat, BigDecimal lon, String date) throws ApiException {
        okhttp3.Call localVarCall = getSunriseSunriseGetValidateBeforeCall(lat, lon, date, null);
        Type localVarReturnType = new TypeToken<METJSONSunrise>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get sunrise and sunset information (asynchronously)
     * Returns the sunrise time and sunset time for the given location
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param date Date (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSunriseSunriseGetAsync(BigDecimal lat, BigDecimal lon, String date, final ApiCallback<METJSONSunrise> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSunriseSunriseGetValidateBeforeCall(lat, lon, date, _callback);
        Type localVarReturnType = new TypeToken<METJSONSunrise>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
