/*
 * Crop Health API
 * This is a RESTful service that provides predictions for crop health.<br/>The API consists of three pre-trained PyTorch models served using TorchServe. The models are designed to predict the health of crops based on images of the crops. The models were trained on the following crop types: maize, beans, cocoa, cassava, and banana.<br/>The data were collected from the <a href='https://dataverse.harvard.edu'>Harvard Dataverse</a> and are licensed under the <a href='https://creativecommons.org/publicdomain/zero/1.0/'>Creative Commons 1.0 DEED license.</a><br/>The models differ in the number of classes they predict. The models are:<br/>1. Binary model: This is a binary model that predicts the health of crops into three classes: healthy and diseased.<br/>2. Single-HLT model: This is a multiclass model that predicts the health of crops into a single healthy (HLT) class and several diseases.<br/>3. Multi-HLT model: This is a multiclass model that predicts the health of crops into multiple healthy (HLT) classes and several diseases.<br/>The key difference between the single-HLT and multi-HLT models is that only the multi-HLT model has a healthy class for each crop type.<br/>The nine specific datasets used can be found at the following URLs:<br/>1. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/R0KL7R'>Spectrometry Cassava Dataset</a><br/>2. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/T4RB0B'>Cassava Dataset Uganda</a><br/>3. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/GDON8Q'>Maize Dataset Tanzania</a><br/>4. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/6R78HR'>Maize Dataset Namibia</a><br/>5. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/LPGHKK'>Maize Dataset Uganda</a><br/>6. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/TCKVEW'>Beans Dataset Uganda</a><br/>7. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/LQUWXW'>Bananas Dataset Tanzania</a><br/>8. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/BBGQSP'>KaraAgro AI Cocoa Dataset</a><br/>9. <a href='https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/CXUMDS'>KaraAgro AI Maize Dataset</a>
 *
 * The version of the OpenAPI document: 0.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.crop_health.api;

import io.openepi.crop_health.ApiClient;
import io.openepi.crop_health.Configuration;
import io.openepi.common.ApiCallback;
import io.openepi.common.ApiException;
import io.openepi.common.ApiResponse;
import io.openepi.common.Pair;

import com.google.gson.reflect.TypeToken;


import io.openepi.crop_health.model.BinaryPredictionResponse;
import io.openepi.crop_health.model.MultiHLTPredictionResponse;
import io.openepi.crop_health.model.Ping200Response;
import io.openepi.crop_health.model.SingleHLTPredictionResponse;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CropHealthApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CropHealthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CropHealthApi(ApiClient apiClient) {
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
     * Build call for ping
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TorchServe status </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pingCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/ping";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call pingValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return pingCall(_callback);

    }

    /**
     * 
     * Get TorchServe status.
     * @return Ping200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TorchServe status </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Ping200Response ping() throws ApiException {
        ApiResponse<Ping200Response> localVarResp = pingWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Get TorchServe status.
     * @return ApiResponse&lt;Ping200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TorchServe status </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Ping200Response> pingWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = pingValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Ping200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get TorchServe status.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TorchServe status </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pingAsync(final ApiCallback<Ping200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = pingValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Ping200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for predictionsWithBinary
     * @param body Picture of a plant. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call predictionsWithBinaryCall(File body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/predictions/binary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call predictionsWithBinaryValidateBeforeCall(File body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling predictionsWithBinary(Async)");
        }

        return predictionsWithBinaryCall(body, _callback);

    }

    /**
     * 
     * Health predictions by the Binary model.
     * @param body Picture of a plant. (required)
     * @return BinaryPredictionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public BinaryPredictionResponse postPredictionBinary(File body) throws ApiException {
        ApiResponse<BinaryPredictionResponse> localVarResp = predictionsWithBinaryWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 
     * Health predictions by the Binary model.
     * @param body Picture of a plant. (required)
     * @return ApiResponse&lt;BinaryPredictionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BinaryPredictionResponse> predictionsWithBinaryWithHttpInfo(File body) throws ApiException {
        okhttp3.Call localVarCall = predictionsWithBinaryValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<BinaryPredictionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Health predictions by the Binary model.
     * @param body Picture of a plant. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postPredictionBinaryAsync(File body, final ApiCallback<BinaryPredictionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = predictionsWithBinaryValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<BinaryPredictionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for predictionsWithMultiHLT
     * @param body Picture of a plant. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call predictionsWithMultiHLTCall(File body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/predictions/multi-HLT";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call predictionsWithMultiHLTValidateBeforeCall(File body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling predictionsWithMultiHLT(Async)");
        }

        return predictionsWithMultiHLTCall(body, _callback);

    }

    /**
     * 
     * Health predictions by the MultiHLT model.
     * @param body Picture of a plant. (required)
     * @return MultiHLTPredictionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public MultiHLTPredictionResponse postPredictionMulti(File body) throws ApiException {
        ApiResponse<MultiHLTPredictionResponse> localVarResp = predictionsWithMultiHLTWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 
     * Health predictions by the MultiHLT model.
     * @param body Picture of a plant. (required)
     * @return ApiResponse&lt;MultiHLTPredictionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MultiHLTPredictionResponse> predictionsWithMultiHLTWithHttpInfo(File body) throws ApiException {
        okhttp3.Call localVarCall = predictionsWithMultiHLTValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<MultiHLTPredictionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Health predictions by the MultiHLT model.
     * @param body Picture of a plant. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postPredictionMultiAsync(File body, final ApiCallback<MultiHLTPredictionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = predictionsWithMultiHLTValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<MultiHLTPredictionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for predictionsWithSingleHLT
     * @param body Picture of a plant. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call predictionsWithSingleHLTCall(File body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/predictions/single-HLT";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call predictionsWithSingleHLTValidateBeforeCall(File body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling predictionsWithSingleHLT(Async)");
        }

        return predictionsWithSingleHLTCall(body, _callback);

    }

    /**
     * 
     * Health predictions by the SingleHLT model.
     * @param body Picture of a plant. (required)
     * @return SingleHLTPredictionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public SingleHLTPredictionResponse postPredictionSingle(File body) throws ApiException {
        ApiResponse<SingleHLTPredictionResponse> localVarResp = predictionsWithSingleHLTWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 
     * Health predictions by the SingleHLT model.
     * @param body Picture of a plant. (required)
     * @return ApiResponse&lt;SingleHLTPredictionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SingleHLTPredictionResponse> predictionsWithSingleHLTWithHttpInfo(File body) throws ApiException {
        okhttp3.Call localVarCall = predictionsWithSingleHLTValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<SingleHLTPredictionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Health predictions by the SingleHLT model.
     * @param body Picture of a plant. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> Model not found or Model Version not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> No worker is available to serve request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Predicted class confidences, all summing to 1.0. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postPredictionSingleAsync(File body, final ApiCallback<SingleHLTPredictionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = predictionsWithSingleHLTValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<SingleHLTPredictionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
