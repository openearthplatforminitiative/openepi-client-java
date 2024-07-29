/*
 * Soil API
 * This is a RESTful service that provides soil information based on data sourced from <a href=\"https://www.isric.org/explore/soilgrids\">SoilGrids</a>. <br/>The data are freely available for use under the <a href=\"https://creativecommons.org/licenses/by/4.0/\">CC BY 4.0 license</a>.
 *
 * The version of the OpenAPI document: 0.2.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.soil.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import io.openepi.soil.model.SoilTypes;

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

import io.openepi.soil.JSON;

/**
 * SoilTypeSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:23:35.781423+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class SoilTypeSummary {
  public static final String SERIALIZED_NAME_SOIL_TYPE = "soil_type";
  @SerializedName(SERIALIZED_NAME_SOIL_TYPE)
  private SoilTypes soilType;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public SoilTypeSummary() {
  }

  public SoilTypeSummary soilType(SoilTypes soilType) {
    this.soilType = soilType;
    return this;
  }

  /**
   * The soil type
   * @return soilType
   */
  @javax.annotation.Nonnull
  public SoilTypes getSoilType() {
    return soilType;
  }

  public void setSoilType(SoilTypes soilType) {
    this.soilType = soilType;
  }


  public SoilTypeSummary count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of occurrences of the soil type within the queried bounding box
   * @return count
   */
  @javax.annotation.Nonnull
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoilTypeSummary soilTypeSummary = (SoilTypeSummary) o;
    return Objects.equals(this.soilType, soilTypeSummary.soilType) &&
        Objects.equals(this.count, soilTypeSummary.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soilType, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoilTypeSummary {\n");
    sb.append("    soilType: ").append(toIndentedString(soilType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("soil_type");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("soil_type");
    openapiRequiredFields.add("count");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SoilTypeSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SoilTypeSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SoilTypeSummary is not found in the empty JSON string", SoilTypeSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SoilTypeSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SoilTypeSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SoilTypeSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `soil_type`
      SoilTypes.validateJsonElement(jsonObj.get("soil_type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoilTypeSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoilTypeSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoilTypeSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoilTypeSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<SoilTypeSummary>() {
           @Override
           public void write(JsonWriter out, SoilTypeSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoilTypeSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SoilTypeSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SoilTypeSummary
   * @throws IOException if the JSON string is invalid with respect to SoilTypeSummary
   */
  public static SoilTypeSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoilTypeSummary.class);
  }

  /**
   * Convert an instance of SoilTypeSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

