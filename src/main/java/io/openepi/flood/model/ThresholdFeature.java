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
import java.util.Arrays;
import io.openepi.flood.model.Geometry;
import io.openepi.flood.model.ThresholdProperties;

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
 * ThresholdFeature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-24T13:54:08.842155+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class ThresholdFeature {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type = null;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private ThresholdProperties properties;

  public ThresholdFeature() {
  }

  public ThresholdFeature id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the feature.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ThresholdFeature type(Object type) {
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


  public ThresholdFeature geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * The geometric details of the feature, including its type and coordinates.
   * @return geometry
   */
  @javax.annotation.Nonnull
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  public ThresholdFeature properties(ThresholdProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Properties defining flood thresholds for various return periods, used to categorize flood risk.
   * @return properties
   */
  @javax.annotation.Nonnull
  public ThresholdProperties getProperties() {
    return properties;
  }

  public void setProperties(ThresholdProperties properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdFeature thresholdFeature = (ThresholdFeature) o;
    return Objects.equals(this.id, thresholdFeature.id) &&
        Objects.equals(this.type, thresholdFeature.type) &&
        Objects.equals(this.geometry, thresholdFeature.geometry) &&
        Objects.equals(this.properties, thresholdFeature.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, geometry, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdFeature {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("geometry");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("geometry");
    openapiRequiredFields.add("properties");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ThresholdFeature
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ThresholdFeature.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThresholdFeature is not found in the empty JSON string", ThresholdFeature.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ThresholdFeature.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThresholdFeature` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ThresholdFeature.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `geometry`
      Geometry.validateJsonElement(jsonObj.get("geometry"));
      // validate the required field `properties`
      ThresholdProperties.validateJsonElement(jsonObj.get("properties"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThresholdFeature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThresholdFeature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThresholdFeature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThresholdFeature.class));

       return (TypeAdapter<T>) new TypeAdapter<ThresholdFeature>() {
           @Override
           public void write(JsonWriter out, ThresholdFeature value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThresholdFeature read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ThresholdFeature given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ThresholdFeature
   * @throws IOException if the JSON string is invalid with respect to ThresholdFeature
   */
  public static ThresholdFeature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThresholdFeature.class);
  }

  /**
   * Convert an instance of ThresholdFeature to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

