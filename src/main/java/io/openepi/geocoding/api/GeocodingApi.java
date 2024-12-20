/*
 * Geocoder API
 * <p>This is a RESTful service that provides geocoding and reverse geocoding using <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap<sup>®</sup></a> data. The data is licensed under the <a href=\"https://opendatacommons.org/licenses/odbl/\">Open Data Commons Open Database License (ODbL)</a>, by the <a href=\"https://osmfoundation.org\">OpenStreetMap Foundation (OSMF)</a>.</p><p>The data is sourced from <a href=\"https://photon.komoot.io\">https://photon.komoot.io</a>.</p>
 *
 * The version of the OpenAPI document: 0.4.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.geocoding.api;

import io.openepi.geocoding.ApiClient;
import io.openepi.geocoding.Configuration;
import io.openepi.common.ApiCallback;
import io.openepi.common.ApiException;
import io.openepi.common.ApiResponse;
import io.openepi.common.Pair;

import com.google.gson.reflect.TypeToken;


import java.math.BigDecimal;
import io.openepi.geocoding.model.FeatureCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeocodingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GeocodingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GeocodingApi(ApiClient apiClient) {
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
     * Build call for geocodingGet
     * @param q Search query (required)
     * @param lat Geocode with priority to this latitude (optional)
     * @param lon Geocode with priority to this longitude (optional)
     * @param lang Set preferred language (e.g. \&quot;default\&quot;, \&quot;en\&quot;, \&quot;de\&quot;, \&quot;fr\&quot;) (optional)
     * @param limit Limit number of results (optional)
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
    public okhttp3.Call geocodingGetCall(String q, BigDecimal lat, BigDecimal lon, String lang, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        if (lat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lat", lat));
        }

        if (lon != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lon", lon));
        }

        if (lang != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lang", lang));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call geocodingGetValidateBeforeCall(String q, BigDecimal lat, BigDecimal lon, String lang, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException("Missing the required parameter 'q' when calling geocodingGet(Async)");
        }

        return geocodingGetCall(q, lat, lon, lang, limit, _callback);

    }

    /**
     * Geocoding
     * Returns a GeoJSON FeatureCollection of places matching the search query
     * @param q Search query (required)
     * @param lat Geocode with priority to this latitude (optional)
     * @param lon Geocode with priority to this longitude (optional)
     * @param lang Set preferred language (e.g. \&quot;default\&quot;, \&quot;en\&quot;, \&quot;de\&quot;, \&quot;fr\&quot;) (optional)
     * @param limit Limit number of results (optional)
     * @return FeatureCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public FeatureCollection getGeocoding(String q, BigDecimal lat, BigDecimal lon, String lang, Integer limit) throws ApiException {
        ApiResponse<FeatureCollection> localVarResp = geocodingGetWithHttpInfo(q, lat, lon, lang, limit);
        return localVarResp.getData();
    }

    /**
     * Geocoding
     * Returns a GeoJSON FeatureCollection of places matching the search query
     * @param q Search query (required)
     * @return FeatureCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FeatureCollection getGeocoding(String q) throws ApiException {
        return getGeocoding(q, null, null, null, null);
    }



    /**
     * Geocoding
     * Returns a GeoJSON FeatureCollection of places matching the search query
     * @param q Search query (required)
     * @param lat Geocode with priority to this latitude (optional)
     * @param lon Geocode with priority to this longitude (optional)
     * @param lang Set preferred language (e.g. \&quot;default\&quot;, \&quot;en\&quot;, \&quot;de\&quot;, \&quot;fr\&quot;) (optional)
     * @param limit Limit number of results (optional)
     * @return ApiResponse&lt;FeatureCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FeatureCollection> geocodingGetWithHttpInfo(String q, BigDecimal lat, BigDecimal lon, String lang, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = geocodingGetValidateBeforeCall(q, lat, lon, lang, limit, null);
        Type localVarReturnType = new TypeToken<FeatureCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Geocoding (asynchronously)
     * Returns a GeoJSON FeatureCollection of places matching the search query
     * @param q Search query (required)
     * @param lat Geocode with priority to this latitude (optional)
     * @param lon Geocode with priority to this longitude (optional)
     * @param lang Set preferred language (e.g. \&quot;default\&quot;, \&quot;en\&quot;, \&quot;de\&quot;, \&quot;fr\&quot;) (optional)
     * @param limit Limit number of results (optional)
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
    public okhttp3.Call getGeocodingAsync(String q, BigDecimal lat, BigDecimal lon, String lang, Integer limit, final ApiCallback<FeatureCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = geocodingGetValidateBeforeCall(q, lat, lon, lang, limit, _callback);
        Type localVarReturnType = new TypeToken<FeatureCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Geocoding (asynchronously)
     * Returns a GeoJSON FeatureCollection of places matching the search query
     * @param q Search query (required)
     * @return FeatureCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public okhttp3.Call getGeocodingAsync(String q, final ApiCallback<FeatureCollection> _callback) throws ApiException {
        return getGeocodingAsync(q, null, null, null, null, _callback);
    }


    /**
     * Build call for reverseGeocodingReverseGet
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param lang Set preferred language (e.g. \&quot;default\&quot;, \&quot;en\&quot;, \&quot;de\&quot;, \&quot;fr\&quot;) (optional)
     * @param limit Limit number of results (optional)
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
    public okhttp3.Call reverseGeocodingReverseGetCall(BigDecimal lat, BigDecimal lon, String lang, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/reverse";

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

        if (lang != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lang", lang));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call reverseGeocodingReverseGetValidateBeforeCall(BigDecimal lat, BigDecimal lon, String lang, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new ApiException("Missing the required parameter 'lat' when calling reverseGeocodingReverseGet(Async)");
        }

        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new ApiException("Missing the required parameter 'lon' when calling reverseGeocodingReverseGet(Async)");
        }

        return reverseGeocodingReverseGetCall(lat, lon, lang, limit, _callback);

    }

    /**
     * Reverse Geocoding
     * Returns a GeoJSON FeatureCollection of places near the provided coordinate
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param lang Set preferred language (e.g. \&quot;default\&quot;, \&quot;en\&quot;, \&quot;de\&quot;, \&quot;fr\&quot;) (optional)
     * @param limit Limit number of results (optional)
     * @return FeatureCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public FeatureCollection getReverseGeocoding(BigDecimal lat, BigDecimal lon, String lang, Integer limit) throws ApiException {
        ApiResponse<FeatureCollection> localVarResp = reverseGeocodingReverseGetWithHttpInfo(lat, lon, lang, limit);
        return localVarResp.getData();
    }


    /**
     * Reverse Geocoding
     * Returns a GeoJSON FeatureCollection of places near the provided coordinate
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param lang Set preferred language (e.g. \&quot;default\&quot;, \&quot;en\&quot;, \&quot;de\&quot;, \&quot;fr\&quot;) (optional)
     * @param limit Limit number of results (optional)
     * @return ApiResponse&lt;FeatureCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FeatureCollection> reverseGeocodingReverseGetWithHttpInfo(BigDecimal lat, BigDecimal lon, String lang, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = reverseGeocodingReverseGetValidateBeforeCall(lat, lon, lang, limit, null);
        Type localVarReturnType = new TypeToken<FeatureCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Reverse Geocoding (asynchronously)
     * Returns a GeoJSON FeatureCollection of places near the provided coordinate
     * @param lat Latitude (required)
     * @param lon Longitude (required)
     * @param lang Set preferred language (e.g. \&quot;default\&quot;, \&quot;en\&quot;, \&quot;de\&quot;, \&quot;fr\&quot;) (optional)
     * @param limit Limit number of results (optional)
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
    public okhttp3.Call getReverseGeocodingAsync(BigDecimal lat, BigDecimal lon, String lang, Integer limit, final ApiCallback<FeatureCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = reverseGeocodingReverseGetValidateBeforeCall(lat, lon, lang, limit, _callback);
        Type localVarReturnType = new TypeToken<FeatureCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
