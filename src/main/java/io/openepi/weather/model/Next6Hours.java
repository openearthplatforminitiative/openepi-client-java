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
import java.util.Arrays;
import io.openepi.weather.model.ForecastSummary;
import io.openepi.weather.model.ForecastTimePeriod;

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
 * Next6Hours
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:24:03.616486+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class Next6Hours {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private ForecastTimePeriod details;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private ForecastSummary summary;

  public Next6Hours() {
  }

  public Next6Hours details(ForecastTimePeriod details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nonnull
  public ForecastTimePeriod getDetails() {
    return details;
  }

  public void setDetails(ForecastTimePeriod details) {
    this.details = details;
  }


  public Next6Hours summary(ForecastSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @javax.annotation.Nonnull
  public ForecastSummary getSummary() {
    return summary;
  }

  public void setSummary(ForecastSummary summary) {
    this.summary = summary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Next6Hours next6Hours = (Next6Hours) o;
    return Objects.equals(this.details, next6Hours.details) &&
        Objects.equals(this.summary, next6Hours.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Next6Hours {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("details");
    openapiRequiredFields.add("summary");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Next6Hours
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Next6Hours.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Next6Hours is not found in the empty JSON string", Next6Hours.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Next6Hours.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Next6Hours` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Next6Hours.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `details`
      ForecastTimePeriod.validateJsonElement(jsonObj.get("details"));
      // validate the required field `summary`
      ForecastSummary.validateJsonElement(jsonObj.get("summary"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Next6Hours.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Next6Hours' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Next6Hours> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Next6Hours.class));

       return (TypeAdapter<T>) new TypeAdapter<Next6Hours>() {
           @Override
           public void write(JsonWriter out, Next6Hours value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Next6Hours read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Next6Hours given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Next6Hours
   * @throws IOException if the JSON string is invalid with respect to Next6Hours
   */
  public static Next6Hours fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Next6Hours.class);
  }

  /**
   * Convert an instance of Next6Hours to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

