/*
 * Deforestation API
 * This is a RESTful service that provides aggregated deforestation data over the period from 2001 to 2022 based on data provided by <a href=\"https://glad.umd.edu/\">Global Land Analysis and Discovery (GLAD)</a> laboratory at the University of Maryland, in partnership with <a href=\"https://www.globalforestwatch.org/\">Global Forest Watch (GFW)</a>. The data are freely available for use under a <a href=\"https://creativecommons.org/licenses/by/4.0/\">Creative Commons Attribution 4.0 International License</a>.<br/><i>Citation: Hansen, M. C., P. V. Potapov, R. Moore, M. Hancher, S. A. Turubanova, A. Tyukavina, D. Thau, S. V. Stehman, S. J. Goetz, T. R. Loveland, A. Kommareddy, A. Egorov, L. Chini, C. O. Justice, and J. R. G. Townshend. 2013. High-Resolution Global Maps of 21st-Century Forest Cover Change. Science 342 (15 November): 850-53. Data available on-line from: <a href=\"https://glad.earthengine.app/view/global-forest-change\">https://glad.earthengine.app/view/global-forest-change</a></i>.<br/><br/>The data provided by the `basin` endpoint are aggregated over river basin polygons provided by <a href=\"https://www.hydrosheds.org/products/hydrobasins\">HydroSHEDS</a>. The basin data are feely available for non-commercial and commercial use under a licence agreement included in the <a href=\"https://data.hydrosheds.org/file/technical-documentation/HydroSHEDS_TechDoc_v1_4.pdf\">HydroSHEDS Technical Documentation</a>.
 *
 * The version of the OpenAPI document: 0.3.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.deforestation.api;

import io.openepi.deforestation.ApiCallback;
import io.openepi.deforestation.ApiClient;
import io.openepi.deforestation.ApiException;
import io.openepi.deforestation.ApiResponse;
import io.openepi.deforestation.Configuration;
import io.openepi.deforestation.Pair;
import io.openepi.deforestation.ProgressRequestBody;
import io.openepi.deforestation.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import io.openepi.deforestation.model.DeforestationBasinGeoJSON;
import io.openepi.deforestation.model.HTTPValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeforestationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DeforestationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeforestationApi(ApiClient apiClient) {
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
     * Build call for lossyearBasinGet
     * @param lon Longitude of the point to retrieve data for. (optional)
     * @param lat Latitude of the point to retrieve data for. (optional)
     * @param minLon Minimum longitude of the bounding box to retrieve data for. (optional)
     * @param minLat Minimum latitude of the bounding box to retrieve data for. (optional)
     * @param maxLon Maximum longitude of the bounding box to retrieve data for. (optional)
     * @param maxLat Maximum latitude of the bounding box to retrieve data for. (optional)
     * @param startYear First year in the date range to return data for. (optional, default to 2001)
     * @param endYear Last year in the data range to return data for. (optional, default to 2022)
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
    public okhttp3.Call lossyearBasinGetCall(BigDecimal lon, BigDecimal lat, BigDecimal minLon, BigDecimal minLat, BigDecimal maxLon, BigDecimal maxLat, Integer startYear, Integer endYear, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/basin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (lon != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lon", lon));
        }

        if (lat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lat", lat));
        }

        if (minLon != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("min_lon", minLon));
        }

        if (minLat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("min_lat", minLat));
        }

        if (maxLon != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max_lon", maxLon));
        }

        if (maxLat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max_lat", maxLat));
        }

        if (startYear != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_year", startYear));
        }

        if (endYear != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_year", endYear));
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
    private okhttp3.Call lossyearBasinGetValidateBeforeCall(BigDecimal lon, BigDecimal lat, BigDecimal minLon, BigDecimal minLat, BigDecimal maxLon, BigDecimal maxLat, Integer startYear, Integer endYear, final ApiCallback _callback) throws ApiException {
        return lossyearBasinGetCall(lon, lat, minLon, minLat, maxLon, maxLat, startYear, endYear, _callback);

    }

    /**
     * Get yearly forest cover loss within a river basin
     * Returns the estimated deforested area per year within a river basin for the given location. To retrieve data for a single point both &#x60;lon&#x60; and &#x60;lon&#x60; must be included in the request. To retrieve data within a bounding box all of &#x60;min_lon&#x60;, &#x60;min_lat&#x60;, &#x60;max_lon&#x60;, &#x60;max_lat&#x60; must be included in the request.
     * @param lon Longitude of the point to retrieve data for. (optional)
     * @param lat Latitude of the point to retrieve data for. (optional)
     * @param minLon Minimum longitude of the bounding box to retrieve data for. (optional)
     * @param minLat Minimum latitude of the bounding box to retrieve data for. (optional)
     * @param maxLon Maximum longitude of the bounding box to retrieve data for. (optional)
     * @param maxLat Maximum latitude of the bounding box to retrieve data for. (optional)
     * @param startYear First year in the date range to return data for. (optional, default to 2001)
     * @param endYear Last year in the data range to return data for. (optional, default to 2022)
     * @return DeforestationBasinGeoJSON
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public DeforestationBasinGeoJSON lossyearBasinGet(BigDecimal lon, BigDecimal lat, BigDecimal minLon, BigDecimal minLat, BigDecimal maxLon, BigDecimal maxLat, Integer startYear, Integer endYear) throws ApiException {
        ApiResponse<DeforestationBasinGeoJSON> localVarResp = lossyearBasinGetWithHttpInfo(lon, lat, minLon, minLat, maxLon, maxLat, startYear, endYear);
        return localVarResp.getData();
    }

    /**
     * Get yearly forest cover loss within a river basin
     * Returns the estimated deforested area per year within a river basin for the given location. To retrieve data for a single point both &#x60;lon&#x60; and &#x60;lon&#x60; must be included in the request. To retrieve data within a bounding box all of &#x60;min_lon&#x60;, &#x60;min_lat&#x60;, &#x60;max_lon&#x60;, &#x60;max_lat&#x60; must be included in the request.
     * @param lon Longitude of the point to retrieve data for. (optional)
     * @param lat Latitude of the point to retrieve data for. (optional)
     * @param minLon Minimum longitude of the bounding box to retrieve data for. (optional)
     * @param minLat Minimum latitude of the bounding box to retrieve data for. (optional)
     * @param maxLon Maximum longitude of the bounding box to retrieve data for. (optional)
     * @param maxLat Maximum latitude of the bounding box to retrieve data for. (optional)
     * @param startYear First year in the date range to return data for. (optional, default to 2001)
     * @param endYear Last year in the data range to return data for. (optional, default to 2022)
     * @return ApiResponse&lt;DeforestationBasinGeoJSON&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeforestationBasinGeoJSON> lossyearBasinGetWithHttpInfo(BigDecimal lon, BigDecimal lat, BigDecimal minLon, BigDecimal minLat, BigDecimal maxLon, BigDecimal maxLat, Integer startYear, Integer endYear) throws ApiException {
        okhttp3.Call localVarCall = lossyearBasinGetValidateBeforeCall(lon, lat, minLon, minLat, maxLon, maxLat, startYear, endYear, null);
        Type localVarReturnType = new TypeToken<DeforestationBasinGeoJSON>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get yearly forest cover loss within a river basin (asynchronously)
     * Returns the estimated deforested area per year within a river basin for the given location. To retrieve data for a single point both &#x60;lon&#x60; and &#x60;lon&#x60; must be included in the request. To retrieve data within a bounding box all of &#x60;min_lon&#x60;, &#x60;min_lat&#x60;, &#x60;max_lon&#x60;, &#x60;max_lat&#x60; must be included in the request.
     * @param lon Longitude of the point to retrieve data for. (optional)
     * @param lat Latitude of the point to retrieve data for. (optional)
     * @param minLon Minimum longitude of the bounding box to retrieve data for. (optional)
     * @param minLat Minimum latitude of the bounding box to retrieve data for. (optional)
     * @param maxLon Maximum longitude of the bounding box to retrieve data for. (optional)
     * @param maxLat Maximum latitude of the bounding box to retrieve data for. (optional)
     * @param startYear First year in the date range to return data for. (optional, default to 2001)
     * @param endYear Last year in the data range to return data for. (optional, default to 2022)
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
    public okhttp3.Call lossyearBasinGetAsync(BigDecimal lon, BigDecimal lat, BigDecimal minLon, BigDecimal minLat, BigDecimal maxLon, BigDecimal maxLat, Integer startYear, Integer endYear, final ApiCallback<DeforestationBasinGeoJSON> _callback) throws ApiException {

        okhttp3.Call localVarCall = lossyearBasinGetValidateBeforeCall(lon, lat, minLon, minLat, maxLon, maxLat, startYear, endYear, _callback);
        Type localVarReturnType = new TypeToken<DeforestationBasinGeoJSON>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}