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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets GeometryType
 */
@JsonAdapter(GeometryType.Adapter.class)
public enum GeometryType {
  
  POINT("Point"),
  
  POLYGON("Polygon");

  private String value;

  GeometryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GeometryType fromValue(String value) {
    for (GeometryType b : GeometryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GeometryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final GeometryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GeometryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GeometryType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    GeometryType.fromValue(value);
  }
}

