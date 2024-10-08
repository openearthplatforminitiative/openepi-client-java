/*
 * Weather API
 * This is a RESTful service that provides accurate and up-to-date weather information based on data sourced from <a href=\"https://api.met.no\">https://api.met.no</a>. <br/>The data are freely available for use under a <a href=\"https://api.met.no/doc/License\">Creative Commons license</a>.
 *
 * The version of the OpenAPI document: 0.1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.weather.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.openepi.weather.model.GeometryType;

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

import io.openepi.weather.JSON;

/**
 * WeatherApiModelsMetSunriseTypesPointGeometry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:24:03.616486+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class WeatherApiModelsMetSunriseTypesPointGeometry {
  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private List<BigDecimal> coordinates = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private GeometryType type;

  public WeatherApiModelsMetSunriseTypesPointGeometry() {
  }

  public WeatherApiModelsMetSunriseTypesPointGeometry coordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public WeatherApiModelsMetSunriseTypesPointGeometry addCoordinatesItem(BigDecimal coordinatesItem) {
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
  public List<BigDecimal> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
  }


  public WeatherApiModelsMetSunriseTypesPointGeometry type(GeometryType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public GeometryType getType() {
    return type;
  }

  public void setType(GeometryType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherApiModelsMetSunriseTypesPointGeometry weatherApiModelsMetSunriseTypesPointGeometry = (WeatherApiModelsMetSunriseTypesPointGeometry) o;
    return Objects.equals(this.coordinates, weatherApiModelsMetSunriseTypesPointGeometry.coordinates) &&
        Objects.equals(this.type, weatherApiModelsMetSunriseTypesPointGeometry.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherApiModelsMetSunriseTypesPointGeometry {\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("coordinates");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("coordinates");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WeatherApiModelsMetSunriseTypesPointGeometry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WeatherApiModelsMetSunriseTypesPointGeometry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WeatherApiModelsMetSunriseTypesPointGeometry is not found in the empty JSON string", WeatherApiModelsMetSunriseTypesPointGeometry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WeatherApiModelsMetSunriseTypesPointGeometry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WeatherApiModelsMetSunriseTypesPointGeometry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WeatherApiModelsMetSunriseTypesPointGeometry.openapiRequiredFields) {
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
      // validate the required field `type`
      GeometryType.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WeatherApiModelsMetSunriseTypesPointGeometry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WeatherApiModelsMetSunriseTypesPointGeometry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WeatherApiModelsMetSunriseTypesPointGeometry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WeatherApiModelsMetSunriseTypesPointGeometry.class));

       return (TypeAdapter<T>) new TypeAdapter<WeatherApiModelsMetSunriseTypesPointGeometry>() {
           @Override
           public void write(JsonWriter out, WeatherApiModelsMetSunriseTypesPointGeometry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WeatherApiModelsMetSunriseTypesPointGeometry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WeatherApiModelsMetSunriseTypesPointGeometry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WeatherApiModelsMetSunriseTypesPointGeometry
   * @throws IOException if the JSON string is invalid with respect to WeatherApiModelsMetSunriseTypesPointGeometry
   */
  public static WeatherApiModelsMetSunriseTypesPointGeometry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WeatherApiModelsMetSunriseTypesPointGeometry.class);
  }

  /**
   * Convert an instance of WeatherApiModelsMetSunriseTypesPointGeometry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

