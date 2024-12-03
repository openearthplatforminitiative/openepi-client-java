/*
 * Agriculture API
 * This API is used to get aggregated data from Deforestation, Flood, Weather and Soil APIs.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.agriculture.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.openepi.agriculture.JSON;

/**
 * ModelsSoilType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-02T12:55:09.550932+01:00[Europe/Oslo]", comments = "Generator version: 7.8.0")
public class ModelsSoilType {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_MOST_PROBABLE_SOIL_TYPE = "most_probable_soil_type";
  @SerializedName(SERIALIZED_NAME_MOST_PROBABLE_SOIL_TYPE)
  private String mostProbableSoilType;

  public ModelsSoilType() {
  }

  public ModelsSoilType error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public ModelsSoilType mostProbableSoilType(String mostProbableSoilType) {
    this.mostProbableSoilType = mostProbableSoilType;
    return this;
  }

  /**
   * The most probable soil type at the queried location
   * @return mostProbableSoilType
   */
  @javax.annotation.Nullable
  public String getMostProbableSoilType() {
    return mostProbableSoilType;
  }

  public void setMostProbableSoilType(String mostProbableSoilType) {
    this.mostProbableSoilType = mostProbableSoilType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSoilType modelsSoilType = (ModelsSoilType) o;
    return Objects.equals(this.error, modelsSoilType.error) &&
        Objects.equals(this.mostProbableSoilType, modelsSoilType.mostProbableSoilType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, mostProbableSoilType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSoilType {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    mostProbableSoilType: ").append(toIndentedString(mostProbableSoilType)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("most_probable_soil_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModelsSoilType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModelsSoilType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSoilType is not found in the empty JSON string", ModelsSoilType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModelsSoilType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSoilType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("most_probable_soil_type") != null && !jsonObj.get("most_probable_soil_type").isJsonNull()) && !jsonObj.get("most_probable_soil_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `most_probable_soil_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("most_probable_soil_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSoilType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSoilType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSoilType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSoilType.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSoilType>() {
           @Override
           public void write(JsonWriter out, ModelsSoilType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSoilType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModelsSoilType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModelsSoilType
   * @throws IOException if the JSON string is invalid with respect to ModelsSoilType
   */
  public static ModelsSoilType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSoilType.class);
  }

  /**
   * Convert an instance of ModelsSoilType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

