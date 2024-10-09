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


package io.openepi.geocoding.model;

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

import io.openepi.geocoding.JSON;

/**
 * MultiLineString
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T12:45:40.887231+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class MultiLineString {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type = null;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private List<List<List<String>>> coordinates = new ArrayList<>();

  public MultiLineString() {
  }

  public MultiLineString type(Object type) {
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


  public MultiLineString coordinates(List<List<List<String>>> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public MultiLineString addCoordinatesItem(List<List<String>> coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
   */
  @javax.annotation.Nonnull
  public List<List<List<String>>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<List<List<String>>> coordinates) {
    this.coordinates = coordinates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiLineString multiLineString = (MultiLineString) o;
    return Objects.equals(this.type, multiLineString.type) &&
        Objects.equals(this.coordinates, multiLineString.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiLineString {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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
    openapiFields.add("coordinates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("coordinates");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MultiLineString
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultiLineString.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultiLineString is not found in the empty JSON string", MultiLineString.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultiLineString.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultiLineString` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MultiLineString.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("coordinates") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("coordinates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `coordinates` to be an array in the JSON string but got `%s`", jsonObj.get("coordinates").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiLineString.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiLineString' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiLineString> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiLineString.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiLineString>() {
           @Override
           public void write(JsonWriter out, MultiLineString value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiLineString read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MultiLineString given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MultiLineString
   * @throws IOException if the JSON string is invalid with respect to MultiLineString
   */
  public static MultiLineString fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiLineString.class);
  }

  /**
   * Convert an instance of MultiLineString to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
