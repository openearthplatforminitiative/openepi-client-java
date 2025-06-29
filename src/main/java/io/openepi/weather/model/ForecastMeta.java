/*
 * Locationforecast
 * Weather forecast for a specified place
 *
 * The version of the OpenAPI document: 2.0
 * Contact: weatherapi-adm@met.no
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.weather.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import io.openepi.weather.WeatherJSON;

/**
 * ForecastMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T08:53:23.751911+02:00[Europe/Oslo]", comments = "Generator version: 7.13.0")
public class ForecastMeta {
  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  @javax.annotation.Nonnull
  private ForecastUnits units;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private String updatedAt;

  public ForecastMeta() {
  }

  public ForecastMeta units(@javax.annotation.Nonnull ForecastUnits units) {
    this.units = units;
    return this;
  }

  /**
   * Get units
   * @return units
   */
  @javax.annotation.Nonnull
  public ForecastUnits getUnits() {
    return units;
  }

  public void setUnits(@javax.annotation.Nonnull ForecastUnits units) {
    this.units = units;
  }


  public ForecastMeta updatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Update time for this forecast
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastMeta forecastMeta = (ForecastMeta) o;
    return Objects.equals(this.units, forecastMeta.units) &&
        Objects.equals(this.updatedAt, forecastMeta.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastMeta {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("units");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("units");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ForecastMeta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ForecastMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ForecastMeta is not found in the empty JSON string", ForecastMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ForecastMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ForecastMeta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ForecastMeta.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `units`
      ForecastUnits.validateJsonElement(jsonObj.get("units"));
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ForecastMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ForecastMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ForecastMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ForecastMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<ForecastMeta>() {
           @Override
           public void write(JsonWriter out, ForecastMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ForecastMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ForecastMeta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ForecastMeta
   * @throws IOException if the JSON string is invalid with respect to ForecastMeta
   */
  public static ForecastMeta fromJson(String jsonString) throws IOException {
    return WeatherJSON.getGson().fromJson(jsonString, ForecastMeta.class);
  }

  /**
   * Convert an instance of ForecastMeta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return WeatherJSON.getGson().toJson(this);
  }
}

