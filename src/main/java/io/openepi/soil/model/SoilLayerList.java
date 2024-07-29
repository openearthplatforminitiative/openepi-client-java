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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.openepi.soil.model.SoilLayer;

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
 * SoilLayerList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:23:35.781423+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class SoilLayerList {
  public static final String SERIALIZED_NAME_LAYERS = "layers";
  @SerializedName(SERIALIZED_NAME_LAYERS)
  private List<SoilLayer> layers = new ArrayList<>();

  public SoilLayerList() {
  }

  public SoilLayerList layers(List<SoilLayer> layers) {
    this.layers = layers;
    return this;
  }

  public SoilLayerList addLayersItem(SoilLayer layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<>();
    }
    this.layers.add(layersItem);
    return this;
  }

  /**
   * The queried soil property layers
   * @return layers
   */
  @javax.annotation.Nonnull
  public List<SoilLayer> getLayers() {
    return layers;
  }

  public void setLayers(List<SoilLayer> layers) {
    this.layers = layers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoilLayerList soilLayerList = (SoilLayerList) o;
    return Objects.equals(this.layers, soilLayerList.layers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoilLayerList {\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
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
    openapiFields.add("layers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("layers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SoilLayerList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SoilLayerList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SoilLayerList is not found in the empty JSON string", SoilLayerList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SoilLayerList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SoilLayerList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SoilLayerList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("layers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `layers` to be an array in the JSON string but got `%s`", jsonObj.get("layers").toString()));
      }

      JsonArray jsonArraylayers = jsonObj.getAsJsonArray("layers");
      // validate the required field `layers` (array)
      for (int i = 0; i < jsonArraylayers.size(); i++) {
        SoilLayer.validateJsonElement(jsonArraylayers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoilLayerList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoilLayerList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoilLayerList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoilLayerList.class));

       return (TypeAdapter<T>) new TypeAdapter<SoilLayerList>() {
           @Override
           public void write(JsonWriter out, SoilLayerList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoilLayerList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SoilLayerList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SoilLayerList
   * @throws IOException if the JSON string is invalid with respect to SoilLayerList
   */
  public static SoilLayerList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoilLayerList.class);
  }

  /**
   * Convert an instance of SoilLayerList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

