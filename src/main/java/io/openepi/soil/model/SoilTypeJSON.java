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
import io.openepi.soil.model.PointGeometry;
import io.openepi.soil.model.SoilTypeInfo;

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
 * SoilTypeJSON
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:23:35.781423+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class SoilTypeJSON {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Object type;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private PointGeometry geometry;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private SoilTypeInfo properties;

  public SoilTypeJSON() {
  }

  public SoilTypeJSON type(Object type) {
    this.type = type;
    return this;
  }

  /**
   * The feature type of the geojson-object
   * @return type
   */
  @javax.annotation.Nullable
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }


  public SoilTypeJSON geometry(PointGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * The geometry of the queried location
   * @return geometry
   */
  @javax.annotation.Nonnull
  public PointGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(PointGeometry geometry) {
    this.geometry = geometry;
  }


  public SoilTypeJSON properties(SoilTypeInfo properties) {
    this.properties = properties;
    return this;
  }

  /**
   * The soil type information at the queried location
   * @return properties
   */
  @javax.annotation.Nonnull
  public SoilTypeInfo getProperties() {
    return properties;
  }

  public void setProperties(SoilTypeInfo properties) {
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
    SoilTypeJSON soilTypeJSON = (SoilTypeJSON) o;
    return Objects.equals(this.type, soilTypeJSON.type) &&
        Objects.equals(this.geometry, soilTypeJSON.geometry) &&
        Objects.equals(this.properties, soilTypeJSON.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, geometry, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoilTypeJSON {\n");
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
    openapiFields.add("type");
    openapiFields.add("geometry");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("geometry");
    openapiRequiredFields.add("properties");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SoilTypeJSON
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SoilTypeJSON.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SoilTypeJSON is not found in the empty JSON string", SoilTypeJSON.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SoilTypeJSON.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SoilTypeJSON` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SoilTypeJSON.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `geometry`
      PointGeometry.validateJsonElement(jsonObj.get("geometry"));
      // validate the required field `properties`
      SoilTypeInfo.validateJsonElement(jsonObj.get("properties"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoilTypeJSON.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoilTypeJSON' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoilTypeJSON> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoilTypeJSON.class));

       return (TypeAdapter<T>) new TypeAdapter<SoilTypeJSON>() {
           @Override
           public void write(JsonWriter out, SoilTypeJSON value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoilTypeJSON read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SoilTypeJSON given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SoilTypeJSON
   * @throws IOException if the JSON string is invalid with respect to SoilTypeJSON
   */
  public static SoilTypeJSON fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoilTypeJSON.class);
  }

  /**
   * Convert an instance of SoilTypeJSON to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
