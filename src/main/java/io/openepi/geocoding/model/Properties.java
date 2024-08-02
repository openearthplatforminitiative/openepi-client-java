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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T12:45:40.887231+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class Properties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OSM_TYPE = "osm_type";
  @SerializedName(SERIALIZED_NAME_OSM_TYPE)
  private String osmType;

  public static final String SERIALIZED_NAME_OSM_ID = "osm_id";
  @SerializedName(SERIALIZED_NAME_OSM_ID)
  private Integer osmId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTY = "county";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private String county;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRYCODE = "countrycode";
  @SerializedName(SERIALIZED_NAME_COUNTRYCODE)
  private String countrycode;

  public static final String SERIALIZED_NAME_OSM_KEY = "osm_key";
  @SerializedName(SERIALIZED_NAME_OSM_KEY)
  private String osmKey;

  public static final String SERIALIZED_NAME_OSM_VALUE = "osm_value";
  @SerializedName(SERIALIZED_NAME_OSM_VALUE)
  private String osmValue;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_EXTENT = "extent";
  @SerializedName(SERIALIZED_NAME_EXTENT)
  private List<String> extent = new ArrayList<>();

  public Properties() {
  }

  public Properties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Properties osmType(String osmType) {
    this.osmType = osmType;
    return this;
  }

  /**
   * Whether the OSM object is an OSM node (N), way (W), or relation (R)
   * @return osmType
   */
  @javax.annotation.Nullable
  public String getOsmType() {
    return osmType;
  }

  public void setOsmType(String osmType) {
    this.osmType = osmType;
  }


  public Properties osmId(Integer osmId) {
    this.osmId = osmId;
    return this;
  }

  /**
   * An ID uniquely identifies the OSM-object within the OSM-type
   * @return osmId
   */
  @javax.annotation.Nonnull
  public Integer getOsmId() {
    return osmId;
  }

  public void setOsmId(Integer osmId) {
    this.osmId = osmId;
  }


  public Properties type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the place (e.g. house, street, city, country)
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Properties country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public Properties county(String county) {
    this.county = county;
    return this;
  }

  /**
   * Get county
   * @return county
   */
  @javax.annotation.Nullable
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }


  public Properties city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public Properties countrycode(String countrycode) {
    this.countrycode = countrycode;
    return this;
  }

  /**
   * Get countrycode
   * @return countrycode
   */
  @javax.annotation.Nullable
  public String getCountrycode() {
    return countrycode;
  }

  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }


  public Properties osmKey(String osmKey) {
    this.osmKey = osmKey;
    return this;
  }

  /**
   * Get osmKey
   * @return osmKey
   */
  @javax.annotation.Nullable
  public String getOsmKey() {
    return osmKey;
  }

  public void setOsmKey(String osmKey) {
    this.osmKey = osmKey;
  }


  public Properties osmValue(String osmValue) {
    this.osmValue = osmValue;
    return this;
  }

  /**
   * Get osmValue
   * @return osmValue
   */
  @javax.annotation.Nullable
  public String getOsmValue() {
    return osmValue;
  }

  public void setOsmValue(String osmValue) {
    this.osmValue = osmValue;
  }


  public Properties postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Get postcode
   * @return postcode
   */
  @javax.annotation.Nullable
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public Properties extent(List<String> extent) {
    this.extent = extent;
    return this;
  }

  public Properties addExtentItem(String extentItem) {
    if (this.extent == null) {
      this.extent = new ArrayList<>();
    }
    this.extent.add(extentItem);
    return this;
  }

  /**
   * The bounding box formatted as (min latitude, max latitude, min longitude, max longitude)
   * @return extent
   */
  @javax.annotation.Nullable
  public List<String> getExtent() {
    return extent;
  }

  public void setExtent(List<String> extent) {
    this.extent = extent;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Properties instance itself
   */
  public Properties putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Properties properties = (Properties) o;
    return Objects.equals(this.name, properties.name) &&
        Objects.equals(this.osmType, properties.osmType) &&
        Objects.equals(this.osmId, properties.osmId) &&
        Objects.equals(this.type, properties.type) &&
        Objects.equals(this.country, properties.country) &&
        Objects.equals(this.county, properties.county) &&
        Objects.equals(this.city, properties.city) &&
        Objects.equals(this.countrycode, properties.countrycode) &&
        Objects.equals(this.osmKey, properties.osmKey) &&
        Objects.equals(this.osmValue, properties.osmValue) &&
        Objects.equals(this.postcode, properties.postcode) &&
        Objects.equals(this.extent, properties.extent)&&
        Objects.equals(this.additionalProperties, properties.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, osmType, osmId, type, country, county, city, countrycode, osmKey, osmValue, postcode, extent, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Properties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osmType: ").append(toIndentedString(osmType)).append("\n");
    sb.append("    osmId: ").append(toIndentedString(osmId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countrycode: ").append(toIndentedString(countrycode)).append("\n");
    sb.append("    osmKey: ").append(toIndentedString(osmKey)).append("\n");
    sb.append("    osmValue: ").append(toIndentedString(osmValue)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    extent: ").append(toIndentedString(extent)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("osm_type");
    openapiFields.add("osm_id");
    openapiFields.add("type");
    openapiFields.add("country");
    openapiFields.add("county");
    openapiFields.add("city");
    openapiFields.add("countrycode");
    openapiFields.add("osm_key");
    openapiFields.add("osm_value");
    openapiFields.add("postcode");
    openapiFields.add("extent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("osm_type");
    openapiRequiredFields.add("osm_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Properties
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Properties.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Properties is not found in the empty JSON string", Properties.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Properties.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }

      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("county") != null && !jsonObj.get("county").isJsonNull()) && !jsonObj.get("county").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `county` to be a primitive type in the JSON string but got `%s`", jsonObj.get("county").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("countrycode") != null && !jsonObj.get("countrycode").isJsonNull()) && !jsonObj.get("countrycode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countrycode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countrycode").toString()));
      }
      if ((jsonObj.get("osm_key") != null && !jsonObj.get("osm_key").isJsonNull()) && !jsonObj.get("osm_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `osm_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("osm_key").toString()));
      }
      if ((jsonObj.get("osm_value") != null && !jsonObj.get("osm_value").isJsonNull()) && !jsonObj.get("osm_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `osm_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("osm_value").toString()));
      }
      if ((jsonObj.get("postcode") != null && !jsonObj.get("postcode").isJsonNull()) && !jsonObj.get("postcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postcode").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("extent") != null && !jsonObj.get("extent").isJsonNull() && !jsonObj.get("extent").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extent` to be an array in the JSON string but got `%s`", jsonObj.get("extent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Properties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Properties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Properties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Properties.class));

       return (TypeAdapter<T>) new TypeAdapter<Properties>() {
           @Override
           public void write(JsonWriter out, Properties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Properties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Properties instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Properties given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Properties
   * @throws IOException if the JSON string is invalid with respect to Properties
   */
  public static Properties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Properties.class);
  }

  /**
   * Convert an instance of Properties to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

