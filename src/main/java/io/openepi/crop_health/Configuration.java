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


package io.openepi.crop_health;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-26T11:13:50.974079+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class Configuration {
    public static final String VERSION = "0.1.10";

    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
