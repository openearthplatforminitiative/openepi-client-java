/*
 * Flood API
 * This is a RESTful service that provides accurate and up-to-date flood information for the geographic region bounded by the following coordinates: `min_lon=-18.0`, `min_lat=-6.0`, `max_lon=52.0`, `max_lat=17.0`.<br/>The data are produced for the <a href='https://www.globalfloods.eu/'>Global Flood Awareness System</a> and sourced from the <a href='https://cds.climate.copernicus.eu/cdsapp#!/dataset/cems-glofas-forecast?tab=overview'>Copernicus Climate Data Store</a>. <br/>Please note that the datasets are licensed under the <a href='https://www.globalfloods.eu/terms-of-service/'>CEMS-FLOODS datasets licence</a>, which is not a standard open license. We use them in our pre-project to explore relevant data.
 *
 * The version of the OpenAPI document: 0.9.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.flood.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.openepi.flood.JSON;

/**
 * DetailedProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-24T13:54:08.842155+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class DetailedProperties {
  public static final String SERIALIZED_NAME_ISSUED_ON = "issued_on";
  @SerializedName(SERIALIZED_NAME_ISSUED_ON)
  private LocalDate issuedOn;

  public static final String SERIALIZED_NAME_VALID_FOR = "valid_for";
  @SerializedName(SERIALIZED_NAME_VALID_FOR)
  private LocalDate validFor;

  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private Integer step;

  public static final String SERIALIZED_NAME_P_ABOVE2Y = "p_above_2y";
  @SerializedName(SERIALIZED_NAME_P_ABOVE2Y)
  private BigDecimal pAbove2y;

  public static final String SERIALIZED_NAME_P_ABOVE5Y = "p_above_5y";
  @SerializedName(SERIALIZED_NAME_P_ABOVE5Y)
  private BigDecimal pAbove5y;

  public static final String SERIALIZED_NAME_P_ABOVE20Y = "p_above_20y";
  @SerializedName(SERIALIZED_NAME_P_ABOVE20Y)
  private BigDecimal pAbove20y;

  public static final String SERIALIZED_NAME_MIN_DIS = "min_dis";
  @SerializedName(SERIALIZED_NAME_MIN_DIS)
  private BigDecimal minDis;

  public static final String SERIALIZED_NAME_Q1_DIS = "q1_dis";
  @SerializedName(SERIALIZED_NAME_Q1_DIS)
  private BigDecimal q1Dis;

  public static final String SERIALIZED_NAME_MEDIAN_DIS = "median_dis";
  @SerializedName(SERIALIZED_NAME_MEDIAN_DIS)
  private BigDecimal medianDis;

  public static final String SERIALIZED_NAME_Q3_DIS = "q3_dis";
  @SerializedName(SERIALIZED_NAME_Q3_DIS)
  private BigDecimal q3Dis;

  public static final String SERIALIZED_NAME_MAX_DIS = "max_dis";
  @SerializedName(SERIALIZED_NAME_MAX_DIS)
  private BigDecimal maxDis;

  public DetailedProperties() {
  }

  public DetailedProperties issuedOn(LocalDate issuedOn) {
    this.issuedOn = issuedOn;
    return this;
  }

  /**
   * The date the summary forecast was issued on. The GloFAS hydrological model is run every day at 00:00 UTC.
   * @return issuedOn
   */
  @javax.annotation.Nonnull
  public LocalDate getIssuedOn() {
    return issuedOn;
  }

  public void setIssuedOn(LocalDate issuedOn) {
    this.issuedOn = issuedOn;
  }


  public DetailedProperties validFor(LocalDate validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The date of the 24-hour forecast period for the flood. The forecast uses the discharge expected between 00:00 UTC and 23:59 UTC of that day.
   * @return validFor
   */
  @javax.annotation.Nonnull
  public LocalDate getValidFor() {
    return validFor;
  }

  public void setValidFor(LocalDate validFor) {
    this.validFor = validFor;
  }


  public DetailedProperties step(Integer step) {
    this.step = step;
    return this;
  }

  /**
   * The time step number of the forecast data.
   * minimum: 1
   * maximum: 30
   * @return step
   */
  @javax.annotation.Nonnull
  public Integer getStep() {
    return step;
  }

  public void setStep(Integer step) {
    this.step = step;
  }


  public DetailedProperties pAbove2y(BigDecimal pAbove2y) {
    this.pAbove2y = pAbove2y;
    return this;
  }

  /**
   * Probability of exceedance over the 2-year return period threshold.
   * minimum: 0.0
   * maximum: 1.0
   * @return pAbove2y
   */
  @javax.annotation.Nonnull
  public BigDecimal getpAbove2y() {
    return pAbove2y;
  }

  public void setpAbove2y(BigDecimal pAbove2y) {
    this.pAbove2y = pAbove2y;
  }


  public DetailedProperties pAbove5y(BigDecimal pAbove5y) {
    this.pAbove5y = pAbove5y;
    return this;
  }

  /**
   * Probability of exceedance over the 5-year return period threshold.
   * minimum: 0.0
   * maximum: 1.0
   * @return pAbove5y
   */
  @javax.annotation.Nonnull
  public BigDecimal getpAbove5y() {
    return pAbove5y;
  }

  public void setpAbove5y(BigDecimal pAbove5y) {
    this.pAbove5y = pAbove5y;
  }


  public DetailedProperties pAbove20y(BigDecimal pAbove20y) {
    this.pAbove20y = pAbove20y;
    return this;
  }

  /**
   * Probability of exceedance over the 20-year return period threshold.
   * minimum: 0.0
   * maximum: 1.0
   * @return pAbove20y
   */
  @javax.annotation.Nonnull
  public BigDecimal getpAbove20y() {
    return pAbove20y;
  }

  public void setpAbove20y(BigDecimal pAbove20y) {
    this.pAbove20y = pAbove20y;
  }


  public DetailedProperties minDis(BigDecimal minDis) {
    this.minDis = minDis;
    return this;
  }

  /**
   * Minimum forecasted discharge in m^3/s.
   * minimum: 0.0
   * @return minDis
   */
  @javax.annotation.Nonnull
  public BigDecimal getMinDis() {
    return minDis;
  }

  public void setMinDis(BigDecimal minDis) {
    this.minDis = minDis;
  }


  public DetailedProperties q1Dis(BigDecimal q1Dis) {
    this.q1Dis = q1Dis;
    return this;
  }

  /**
   * First quartile of forecasted discharge in m^3/s.
   * minimum: 0.0
   * @return q1Dis
   */
  @javax.annotation.Nonnull
  public BigDecimal getQ1Dis() {
    return q1Dis;
  }

  public void setQ1Dis(BigDecimal q1Dis) {
    this.q1Dis = q1Dis;
  }


  public DetailedProperties medianDis(BigDecimal medianDis) {
    this.medianDis = medianDis;
    return this;
  }

  /**
   * Median forecasted discharge in m^3/s.
   * minimum: 0.0
   * @return medianDis
   */
  @javax.annotation.Nonnull
  public BigDecimal getMedianDis() {
    return medianDis;
  }

  public void setMedianDis(BigDecimal medianDis) {
    this.medianDis = medianDis;
  }


  public DetailedProperties q3Dis(BigDecimal q3Dis) {
    this.q3Dis = q3Dis;
    return this;
  }

  /**
   * Third quartile of forecasted discharge in m^3/s.
   * minimum: 0.0
   * @return q3Dis
   */
  @javax.annotation.Nonnull
  public BigDecimal getQ3Dis() {
    return q3Dis;
  }

  public void setQ3Dis(BigDecimal q3Dis) {
    this.q3Dis = q3Dis;
  }


  public DetailedProperties maxDis(BigDecimal maxDis) {
    this.maxDis = maxDis;
    return this;
  }

  /**
   * Maximum forecasted discharge in m^3/s.
   * minimum: 0.0
   * @return maxDis
   */
  @javax.annotation.Nonnull
  public BigDecimal getMaxDis() {
    return maxDis;
  }

  public void setMaxDis(BigDecimal maxDis) {
    this.maxDis = maxDis;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedProperties detailedProperties = (DetailedProperties) o;
    return Objects.equals(this.issuedOn, detailedProperties.issuedOn) &&
        Objects.equals(this.validFor, detailedProperties.validFor) &&
        Objects.equals(this.step, detailedProperties.step) &&
        Objects.equals(this.pAbove2y, detailedProperties.pAbove2y) &&
        Objects.equals(this.pAbove5y, detailedProperties.pAbove5y) &&
        Objects.equals(this.pAbove20y, detailedProperties.pAbove20y) &&
        Objects.equals(this.minDis, detailedProperties.minDis) &&
        Objects.equals(this.q1Dis, detailedProperties.q1Dis) &&
        Objects.equals(this.medianDis, detailedProperties.medianDis) &&
        Objects.equals(this.q3Dis, detailedProperties.q3Dis) &&
        Objects.equals(this.maxDis, detailedProperties.maxDis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedOn, validFor, step, pAbove2y, pAbove5y, pAbove20y, minDis, q1Dis, medianDis, q3Dis, maxDis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedProperties {\n");
    sb.append("    issuedOn: ").append(toIndentedString(issuedOn)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    pAbove2y: ").append(toIndentedString(pAbove2y)).append("\n");
    sb.append("    pAbove5y: ").append(toIndentedString(pAbove5y)).append("\n");
    sb.append("    pAbove20y: ").append(toIndentedString(pAbove20y)).append("\n");
    sb.append("    minDis: ").append(toIndentedString(minDis)).append("\n");
    sb.append("    q1Dis: ").append(toIndentedString(q1Dis)).append("\n");
    sb.append("    medianDis: ").append(toIndentedString(medianDis)).append("\n");
    sb.append("    q3Dis: ").append(toIndentedString(q3Dis)).append("\n");
    sb.append("    maxDis: ").append(toIndentedString(maxDis)).append("\n");
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
    openapiFields.add("issued_on");
    openapiFields.add("valid_for");
    openapiFields.add("step");
    openapiFields.add("p_above_2y");
    openapiFields.add("p_above_5y");
    openapiFields.add("p_above_20y");
    openapiFields.add("min_dis");
    openapiFields.add("q1_dis");
    openapiFields.add("median_dis");
    openapiFields.add("q3_dis");
    openapiFields.add("max_dis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issued_on");
    openapiRequiredFields.add("valid_for");
    openapiRequiredFields.add("step");
    openapiRequiredFields.add("p_above_2y");
    openapiRequiredFields.add("p_above_5y");
    openapiRequiredFields.add("p_above_20y");
    openapiRequiredFields.add("min_dis");
    openapiRequiredFields.add("q1_dis");
    openapiRequiredFields.add("median_dis");
    openapiRequiredFields.add("q3_dis");
    openapiRequiredFields.add("max_dis");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DetailedProperties
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DetailedProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DetailedProperties is not found in the empty JSON string", DetailedProperties.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DetailedProperties.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DetailedProperties` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DetailedProperties.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DetailedProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DetailedProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DetailedProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DetailedProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<DetailedProperties>() {
           @Override
           public void write(JsonWriter out, DetailedProperties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DetailedProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DetailedProperties given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DetailedProperties
   * @throws IOException if the JSON string is invalid with respect to DetailedProperties
   */
  public static DetailedProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DetailedProperties.class);
  }

  /**
   * Convert an instance of DetailedProperties to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
