/*
 * Deforestation API
 * This is a RESTful service that provides aggregated deforestation data over the period from 2001 to 2022 based on data provided by <a href=\"https://glad.umd.edu/\">Global Land Analysis and Discovery (GLAD)</a> laboratory at the University of Maryland, in partnership with <a href=\"https://www.globalforestwatch.org/\">Global Forest Watch (GFW)</a>. The data are freely available for use under a <a href=\"https://creativecommons.org/licenses/by/4.0/\">Creative Commons Attribution 4.0 International License</a>.<br/><i>Citation: Hansen, M. C., P. V. Potapov, R. Moore, M. Hancher, S. A. Turubanova, A. Tyukavina, D. Thau, S. V. Stehman, S. J. Goetz, T. R. Loveland, A. Kommareddy, A. Egorov, L. Chini, C. O. Justice, and J. R. G. Townshend. 2013. High-Resolution Global Maps of 21st-Century Forest Cover Change. Science 342 (15 November): 850-53. Data available on-line from: <a href=\"https://glad.earthengine.app/view/global-forest-change\">https://glad.earthengine.app/view/global-forest-change</a></i>.<br/><br/>The data provided by the `basin` endpoint are aggregated over river basin polygons provided by <a href=\"https://www.hydrosheds.org/products/hydrobasins\">HydroSHEDS</a>. The basin data are feely available for non-commercial and commercial use under a licence agreement included in the <a href=\"https://data.hydrosheds.org/file/technical-documentation/HydroSHEDS_TechDoc_v1_4.pdf\">HydroSHEDS Technical Documentation</a>.
 *
 * The version of the OpenAPI document: 0.3.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.deforestation.model;

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
import io.openepi.deforestation.model.LossYear;

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

import io.openepi.deforestation.JSON;

/**
 * BasinProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-24T13:55:50.527454+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class BasinProperties {
  public static final String SERIALIZED_NAME_DOWNSTREAM_ID = "downstream_id";
  @SerializedName(SERIALIZED_NAME_DOWNSTREAM_ID)
  private Integer downstreamId;

  public static final String SERIALIZED_NAME_BASIN_AREA = "basin_area";
  @SerializedName(SERIALIZED_NAME_BASIN_AREA)
  private BigDecimal basinArea;

  public static final String SERIALIZED_NAME_UPSTREAM_AREA = "upstream_area";
  @SerializedName(SERIALIZED_NAME_UPSTREAM_AREA)
  private BigDecimal upstreamArea;

  public static final String SERIALIZED_NAME_START_YEAR = "start_year";
  @SerializedName(SERIALIZED_NAME_START_YEAR)
  private Integer startYear;

  public static final String SERIALIZED_NAME_END_YEAR = "end_year";
  @SerializedName(SERIALIZED_NAME_END_YEAR)
  private Integer endYear;

  public static final String SERIALIZED_NAME_DATERANGE_TOT_TREELOSS = "daterange_tot_treeloss";
  @SerializedName(SERIALIZED_NAME_DATERANGE_TOT_TREELOSS)
  private BigDecimal daterangeTotTreeloss;

  public static final String SERIALIZED_NAME_DATERANGE_REL_TREELOSS = "daterange_rel_treeloss";
  @SerializedName(SERIALIZED_NAME_DATERANGE_REL_TREELOSS)
  private BigDecimal daterangeRelTreeloss;

  public static final String SERIALIZED_NAME_TREELOSS_PER_YEAR = "treeloss_per_year";
  @SerializedName(SERIALIZED_NAME_TREELOSS_PER_YEAR)
  private List<LossYear> treelossPerYear = new ArrayList<>();

  public BasinProperties() {
  }

  public BasinProperties downstreamId(Integer downstreamId) {
    this.downstreamId = downstreamId;
    return this;
  }

  /**
   * Id of the next downstream polygon for the current basin polygon. The value 0 means that there is no downstream connection.
   * @return downstreamId
   */
  @javax.annotation.Nonnull
  public Integer getDownstreamId() {
    return downstreamId;
  }

  public void setDownstreamId(Integer downstreamId) {
    this.downstreamId = downstreamId;
  }


  public BasinProperties basinArea(BigDecimal basinArea) {
    this.basinArea = basinArea;
    return this;
  }

  /**
   * Area of the basin polygon in square kilometers.
   * @return basinArea
   */
  @javax.annotation.Nonnull
  public BigDecimal getBasinArea() {
    return basinArea;
  }

  public void setBasinArea(BigDecimal basinArea) {
    this.basinArea = basinArea;
  }


  public BasinProperties upstreamArea(BigDecimal upstreamArea) {
    this.upstreamArea = upstreamArea;
    return this;
  }

  /**
   * Total upstream area in square kilometers, including the current polygon.
   * @return upstreamArea
   */
  @javax.annotation.Nonnull
  public BigDecimal getUpstreamArea() {
    return upstreamArea;
  }

  public void setUpstreamArea(BigDecimal upstreamArea) {
    this.upstreamArea = upstreamArea;
  }


  public BasinProperties startYear(Integer startYear) {
    this.startYear = startYear;
    return this;
  }

  /**
   * Get startYear
   * @return startYear
   */
  @javax.annotation.Nonnull
  public Integer getStartYear() {
    return startYear;
  }

  public void setStartYear(Integer startYear) {
    this.startYear = startYear;
  }


  public BasinProperties endYear(Integer endYear) {
    this.endYear = endYear;
    return this;
  }

  /**
   * Get endYear
   * @return endYear
   */
  @javax.annotation.Nonnull
  public Integer getEndYear() {
    return endYear;
  }

  public void setEndYear(Integer endYear) {
    this.endYear = endYear;
  }


  public BasinProperties daterangeTotTreeloss(BigDecimal daterangeTotTreeloss) {
    this.daterangeTotTreeloss = daterangeTotTreeloss;
    return this;
  }

  /**
   * Total tree cover loss, in square kilometers, within the basin polygon over the time period from start_year to end_year (inclusive)
   * @return daterangeTotTreeloss
   */
  @javax.annotation.Nonnull
  public BigDecimal getDaterangeTotTreeloss() {
    return daterangeTotTreeloss;
  }

  public void setDaterangeTotTreeloss(BigDecimal daterangeTotTreeloss) {
    this.daterangeTotTreeloss = daterangeTotTreeloss;
  }


  public BasinProperties daterangeRelTreeloss(BigDecimal daterangeRelTreeloss) {
    this.daterangeRelTreeloss = daterangeRelTreeloss;
    return this;
  }

  /**
   * Tree cover loss within the basin polygon relative to the total area of the polygon, over the time period from start_year to end_year (inclusive). Equivalent to &#x60;daterange_tot_treeloss / basin_area&#x60;.
   * @return daterangeRelTreeloss
   */
  @javax.annotation.Nonnull
  public BigDecimal getDaterangeRelTreeloss() {
    return daterangeRelTreeloss;
  }

  public void setDaterangeRelTreeloss(BigDecimal daterangeRelTreeloss) {
    this.daterangeRelTreeloss = daterangeRelTreeloss;
  }


  public BasinProperties treelossPerYear(List<LossYear> treelossPerYear) {
    this.treelossPerYear = treelossPerYear;
    return this;
  }

  public BasinProperties addTreelossPerYearItem(LossYear treelossPerYearItem) {
    if (this.treelossPerYear == null) {
      this.treelossPerYear = new ArrayList<>();
    }
    this.treelossPerYear.add(treelossPerYearItem);
    return this;
  }

  /**
   * Get treelossPerYear
   * @return treelossPerYear
   */
  @javax.annotation.Nonnull
  public List<LossYear> getTreelossPerYear() {
    return treelossPerYear;
  }

  public void setTreelossPerYear(List<LossYear> treelossPerYear) {
    this.treelossPerYear = treelossPerYear;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasinProperties basinProperties = (BasinProperties) o;
    return Objects.equals(this.downstreamId, basinProperties.downstreamId) &&
        Objects.equals(this.basinArea, basinProperties.basinArea) &&
        Objects.equals(this.upstreamArea, basinProperties.upstreamArea) &&
        Objects.equals(this.startYear, basinProperties.startYear) &&
        Objects.equals(this.endYear, basinProperties.endYear) &&
        Objects.equals(this.daterangeTotTreeloss, basinProperties.daterangeTotTreeloss) &&
        Objects.equals(this.daterangeRelTreeloss, basinProperties.daterangeRelTreeloss) &&
        Objects.equals(this.treelossPerYear, basinProperties.treelossPerYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downstreamId, basinArea, upstreamArea, startYear, endYear, daterangeTotTreeloss, daterangeRelTreeloss, treelossPerYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasinProperties {\n");
    sb.append("    downstreamId: ").append(toIndentedString(downstreamId)).append("\n");
    sb.append("    basinArea: ").append(toIndentedString(basinArea)).append("\n");
    sb.append("    upstreamArea: ").append(toIndentedString(upstreamArea)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    endYear: ").append(toIndentedString(endYear)).append("\n");
    sb.append("    daterangeTotTreeloss: ").append(toIndentedString(daterangeTotTreeloss)).append("\n");
    sb.append("    daterangeRelTreeloss: ").append(toIndentedString(daterangeRelTreeloss)).append("\n");
    sb.append("    treelossPerYear: ").append(toIndentedString(treelossPerYear)).append("\n");
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
    openapiFields.add("downstream_id");
    openapiFields.add("basin_area");
    openapiFields.add("upstream_area");
    openapiFields.add("start_year");
    openapiFields.add("end_year");
    openapiFields.add("daterange_tot_treeloss");
    openapiFields.add("daterange_rel_treeloss");
    openapiFields.add("treeloss_per_year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("downstream_id");
    openapiRequiredFields.add("basin_area");
    openapiRequiredFields.add("upstream_area");
    openapiRequiredFields.add("start_year");
    openapiRequiredFields.add("end_year");
    openapiRequiredFields.add("daterange_tot_treeloss");
    openapiRequiredFields.add("daterange_rel_treeloss");
    openapiRequiredFields.add("treeloss_per_year");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BasinProperties
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BasinProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BasinProperties is not found in the empty JSON string", BasinProperties.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BasinProperties.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BasinProperties` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BasinProperties.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("treeloss_per_year").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `treeloss_per_year` to be an array in the JSON string but got `%s`", jsonObj.get("treeloss_per_year").toString()));
      }

      JsonArray jsonArraytreelossPerYear = jsonObj.getAsJsonArray("treeloss_per_year");
      // validate the required field `treeloss_per_year` (array)
      for (int i = 0; i < jsonArraytreelossPerYear.size(); i++) {
        LossYear.validateJsonElement(jsonArraytreelossPerYear.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BasinProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BasinProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BasinProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BasinProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<BasinProperties>() {
           @Override
           public void write(JsonWriter out, BasinProperties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BasinProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BasinProperties given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BasinProperties
   * @throws IOException if the JSON string is invalid with respect to BasinProperties
   */
  public static BasinProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BasinProperties.class);
  }

  /**
   * Convert an instance of BasinProperties to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
