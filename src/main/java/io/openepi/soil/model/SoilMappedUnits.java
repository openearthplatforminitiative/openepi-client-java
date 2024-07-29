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
 * Gets or Sets SoilMappedUnits
 */
@JsonAdapter(SoilMappedUnits.Adapter.class)
public enum SoilMappedUnits {
  
  CG_CM_("cg/cm³"),
  
  MMOL_C_KG("mmol(c)/kg"),
  
  CM_DM_("cm³/dm³"),
  
  G_KG("g/kg"),
  
  CG_KG("cg/kg"),
  
  HG_M_("hg/m³"),
  
  T_HA("t/ha"),
  
  P_H_10("pH*10"),
  
  DG_KG("dg/kg");

  private String value;

  SoilMappedUnits(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SoilMappedUnits fromValue(String value) {
    for (SoilMappedUnits b : SoilMappedUnits.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SoilMappedUnits> {
    @Override
    public void write(final JsonWriter jsonWriter, final SoilMappedUnits enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SoilMappedUnits read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SoilMappedUnits.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    SoilMappedUnits.fromValue(value);
  }
}

