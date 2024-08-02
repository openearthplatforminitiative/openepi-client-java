/*
 * Flood API
 * This is a RESTful service that provides accurate and up-to-date flood information for the geographic region bounded by the following coordinates: `min_lon=-18.0`, `min_lat=-6.0`, `max_lon=52.0`, `max_lat=17.0`.<br/>The data are produced for the <a href='https://www.globalfloods.eu/'>Global Flood Awareness System</a> and sourced from the <a href='https://cds.climate.copernicus.eu/cdsapp#!/dataset/cems-glofas-forecast?tab=overview'>Copernicus Climate Data Store</a>. <br/>Please note that the datasets are licensed under the <a href='https://www.globalfloods.eu/terms-of-service/'>CEMS-FLOODS datasets licence</a>, which is not a standard open license. We use them in our pre-project to explore relevant data.
 *
 * The version of the OpenAPI document: 0.9.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.flood.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.openepi.flood.model.ThresholdFeature;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.openepi.flood.JSON;

/**
 * ThresholdFeatureCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-24T13:54:08.842155+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class ThresholdFeatureCollection {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type = null;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<ThresholdFeature> features = new ArrayList<>();

  public ThresholdFeatureCollection() {
  }

  public ThresholdFeatureCollection type(Object type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }


  public ThresholdFeatureCollection features(List<ThresholdFeature> features) {
    this.features = features;
    return this;
  }

  public ThresholdFeatureCollection addFeaturesItem(ThresholdFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * A collection of threshold features, each outlining the specific discharge thresholds associated with different return period flood risks.
   * @return features
   */
  @javax.annotation.Nonnull
  public List<ThresholdFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<ThresholdFeature> features) {
    this.features = features;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdFeatureCollection thresholdFeatureCollection = (ThresholdFeatureCollection) o;
    return Objects.equals(this.type, thresholdFeatureCollection.type) &&
        Objects.equals(this.features, thresholdFeatureCollection.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdFeatureCollection {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("type");
    openapiFields.add("features");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("features");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ThresholdFeatureCollection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ThresholdFeatureCollection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThresholdFeatureCollection is not found in the empty JSON string", ThresholdFeatureCollection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ThresholdFeatureCollection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThresholdFeatureCollection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ThresholdFeatureCollection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
      }

      JsonArray jsonArrayfeatures = jsonObj.getAsJsonArray("features");
      // validate the required field `features` (array)
      for (int i = 0; i < jsonArrayfeatures.size(); i++) {
        ThresholdFeature.validateJsonElement(jsonArrayfeatures.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThresholdFeatureCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThresholdFeatureCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThresholdFeatureCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThresholdFeatureCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<ThresholdFeatureCollection>() {
           @Override
           public void write(JsonWriter out, ThresholdFeatureCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThresholdFeatureCollection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ThresholdFeatureCollection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ThresholdFeatureCollection
   * @throws IOException if the JSON string is invalid with respect to ThresholdFeatureCollection
   */
  public static ThresholdFeatureCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThresholdFeatureCollection.class);
  }

  /**
   * Convert an instance of ThresholdFeatureCollection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

