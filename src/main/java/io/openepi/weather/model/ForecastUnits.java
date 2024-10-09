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

import io.openepi.weather.JSON;

/**
 * ForecastUnits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T14:24:03.616486+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class ForecastUnits {
  public static final String SERIALIZED_NAME_AIR_PRESSURE_AT_SEA_LEVEL = "air_pressure_at_sea_level";
  @SerializedName(SERIALIZED_NAME_AIR_PRESSURE_AT_SEA_LEVEL)
  private String airPressureAtSeaLevel;

  public static final String SERIALIZED_NAME_AIR_TEMPERATURE = "air_temperature";
  @SerializedName(SERIALIZED_NAME_AIR_TEMPERATURE)
  private String airTemperature;

  public static final String SERIALIZED_NAME_AIR_TEMPERATURE_MAX = "air_temperature_max";
  @SerializedName(SERIALIZED_NAME_AIR_TEMPERATURE_MAX)
  private String airTemperatureMax;

  public static final String SERIALIZED_NAME_AIR_TEMPERATURE_MIN = "air_temperature_min";
  @SerializedName(SERIALIZED_NAME_AIR_TEMPERATURE_MIN)
  private String airTemperatureMin;

  public static final String SERIALIZED_NAME_CLOUD_AREA_FRACTION = "cloud_area_fraction";
  @SerializedName(SERIALIZED_NAME_CLOUD_AREA_FRACTION)
  private String cloudAreaFraction;

  public static final String SERIALIZED_NAME_CLOUD_AREA_FRACTION_HIGH = "cloud_area_fraction_high";
  @SerializedName(SERIALIZED_NAME_CLOUD_AREA_FRACTION_HIGH)
  private String cloudAreaFractionHigh;

  public static final String SERIALIZED_NAME_CLOUD_AREA_FRACTION_LOW = "cloud_area_fraction_low";
  @SerializedName(SERIALIZED_NAME_CLOUD_AREA_FRACTION_LOW)
  private String cloudAreaFractionLow;

  public static final String SERIALIZED_NAME_CLOUD_AREA_FRACTION_MEDIUM = "cloud_area_fraction_medium";
  @SerializedName(SERIALIZED_NAME_CLOUD_AREA_FRACTION_MEDIUM)
  private String cloudAreaFractionMedium;

  public static final String SERIALIZED_NAME_DEW_POINT_TEMPERATURE = "dew_point_temperature";
  @SerializedName(SERIALIZED_NAME_DEW_POINT_TEMPERATURE)
  private String dewPointTemperature;

  public static final String SERIALIZED_NAME_FOG_AREA_FRACTION = "fog_area_fraction";
  @SerializedName(SERIALIZED_NAME_FOG_AREA_FRACTION)
  private String fogAreaFraction;

  public static final String SERIALIZED_NAME_PRECIPITATION_AMOUNT = "precipitation_amount";
  @SerializedName(SERIALIZED_NAME_PRECIPITATION_AMOUNT)
  private String precipitationAmount;

  public static final String SERIALIZED_NAME_PRECIPITATION_AMOUNT_MAX = "precipitation_amount_max";
  @SerializedName(SERIALIZED_NAME_PRECIPITATION_AMOUNT_MAX)
  private String precipitationAmountMax;

  public static final String SERIALIZED_NAME_PRECIPITATION_AMOUNT_MIN = "precipitation_amount_min";
  @SerializedName(SERIALIZED_NAME_PRECIPITATION_AMOUNT_MIN)
  private String precipitationAmountMin;

  public static final String SERIALIZED_NAME_PROBABILITY_OF_PRECIPITATION = "probability_of_precipitation";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_OF_PRECIPITATION)
  private String probabilityOfPrecipitation;

  public static final String SERIALIZED_NAME_PROBABILITY_OF_THUNDER = "probability_of_thunder";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_OF_THUNDER)
  private String probabilityOfThunder;

  public static final String SERIALIZED_NAME_RELATIVE_HUMIDITY = "relative_humidity";
  @SerializedName(SERIALIZED_NAME_RELATIVE_HUMIDITY)
  private String relativeHumidity;

  public static final String SERIALIZED_NAME_ULTRAVIOLET_INDEX_CLEAR_SKY_MAX = "ultraviolet_index_clear_sky_max";
  @SerializedName(SERIALIZED_NAME_ULTRAVIOLET_INDEX_CLEAR_SKY_MAX)
  private String ultravioletIndexClearSkyMax;

  public static final String SERIALIZED_NAME_WIND_FROM_DIRECTION = "wind_from_direction";
  @SerializedName(SERIALIZED_NAME_WIND_FROM_DIRECTION)
  private String windFromDirection;

  public static final String SERIALIZED_NAME_WIND_SPEED = "wind_speed";
  @SerializedName(SERIALIZED_NAME_WIND_SPEED)
  private String windSpeed;

  public static final String SERIALIZED_NAME_WIND_SPEED_OF_GUST = "wind_speed_of_gust";
  @SerializedName(SERIALIZED_NAME_WIND_SPEED_OF_GUST)
  private String windSpeedOfGust;

  public ForecastUnits() {
  }

  public ForecastUnits airPressureAtSeaLevel(String airPressureAtSeaLevel) {
    this.airPressureAtSeaLevel = airPressureAtSeaLevel;
    return this;
  }

  /**
   * Get airPressureAtSeaLevel
   * @return airPressureAtSeaLevel
   */
  @javax.annotation.Nullable
  public String getAirPressureAtSeaLevel() {
    return airPressureAtSeaLevel;
  }

  public void setAirPressureAtSeaLevel(String airPressureAtSeaLevel) {
    this.airPressureAtSeaLevel = airPressureAtSeaLevel;
  }


  public ForecastUnits airTemperature(String airTemperature) {
    this.airTemperature = airTemperature;
    return this;
  }

  /**
   * Get airTemperature
   * @return airTemperature
   */
  @javax.annotation.Nullable
  public String getAirTemperature() {
    return airTemperature;
  }

  public void setAirTemperature(String airTemperature) {
    this.airTemperature = airTemperature;
  }


  public ForecastUnits airTemperatureMax(String airTemperatureMax) {
    this.airTemperatureMax = airTemperatureMax;
    return this;
  }

  /**
   * Get airTemperatureMax
   * @return airTemperatureMax
   */
  @javax.annotation.Nullable
  public String getAirTemperatureMax() {
    return airTemperatureMax;
  }

  public void setAirTemperatureMax(String airTemperatureMax) {
    this.airTemperatureMax = airTemperatureMax;
  }


  public ForecastUnits airTemperatureMin(String airTemperatureMin) {
    this.airTemperatureMin = airTemperatureMin;
    return this;
  }

  /**
   * Get airTemperatureMin
   * @return airTemperatureMin
   */
  @javax.annotation.Nullable
  public String getAirTemperatureMin() {
    return airTemperatureMin;
  }

  public void setAirTemperatureMin(String airTemperatureMin) {
    this.airTemperatureMin = airTemperatureMin;
  }


  public ForecastUnits cloudAreaFraction(String cloudAreaFraction) {
    this.cloudAreaFraction = cloudAreaFraction;
    return this;
  }

  /**
   * Get cloudAreaFraction
   * @return cloudAreaFraction
   */
  @javax.annotation.Nullable
  public String getCloudAreaFraction() {
    return cloudAreaFraction;
  }

  public void setCloudAreaFraction(String cloudAreaFraction) {
    this.cloudAreaFraction = cloudAreaFraction;
  }


  public ForecastUnits cloudAreaFractionHigh(String cloudAreaFractionHigh) {
    this.cloudAreaFractionHigh = cloudAreaFractionHigh;
    return this;
  }

  /**
   * Get cloudAreaFractionHigh
   * @return cloudAreaFractionHigh
   */
  @javax.annotation.Nullable
  public String getCloudAreaFractionHigh() {
    return cloudAreaFractionHigh;
  }

  public void setCloudAreaFractionHigh(String cloudAreaFractionHigh) {
    this.cloudAreaFractionHigh = cloudAreaFractionHigh;
  }


  public ForecastUnits cloudAreaFractionLow(String cloudAreaFractionLow) {
    this.cloudAreaFractionLow = cloudAreaFractionLow;
    return this;
  }

  /**
   * Get cloudAreaFractionLow
   * @return cloudAreaFractionLow
   */
  @javax.annotation.Nullable
  public String getCloudAreaFractionLow() {
    return cloudAreaFractionLow;
  }

  public void setCloudAreaFractionLow(String cloudAreaFractionLow) {
    this.cloudAreaFractionLow = cloudAreaFractionLow;
  }


  public ForecastUnits cloudAreaFractionMedium(String cloudAreaFractionMedium) {
    this.cloudAreaFractionMedium = cloudAreaFractionMedium;
    return this;
  }

  /**
   * Get cloudAreaFractionMedium
   * @return cloudAreaFractionMedium
   */
  @javax.annotation.Nullable
  public String getCloudAreaFractionMedium() {
    return cloudAreaFractionMedium;
  }

  public void setCloudAreaFractionMedium(String cloudAreaFractionMedium) {
    this.cloudAreaFractionMedium = cloudAreaFractionMedium;
  }


  public ForecastUnits dewPointTemperature(String dewPointTemperature) {
    this.dewPointTemperature = dewPointTemperature;
    return this;
  }

  /**
   * Get dewPointTemperature
   * @return dewPointTemperature
   */
  @javax.annotation.Nullable
  public String getDewPointTemperature() {
    return dewPointTemperature;
  }

  public void setDewPointTemperature(String dewPointTemperature) {
    this.dewPointTemperature = dewPointTemperature;
  }


  public ForecastUnits fogAreaFraction(String fogAreaFraction) {
    this.fogAreaFraction = fogAreaFraction;
    return this;
  }

  /**
   * Get fogAreaFraction
   * @return fogAreaFraction
   */
  @javax.annotation.Nullable
  public String getFogAreaFraction() {
    return fogAreaFraction;
  }

  public void setFogAreaFraction(String fogAreaFraction) {
    this.fogAreaFraction = fogAreaFraction;
  }


  public ForecastUnits precipitationAmount(String precipitationAmount) {
    this.precipitationAmount = precipitationAmount;
    return this;
  }

  /**
   * Get precipitationAmount
   * @return precipitationAmount
   */
  @javax.annotation.Nullable
  public String getPrecipitationAmount() {
    return precipitationAmount;
  }

  public void setPrecipitationAmount(String precipitationAmount) {
    this.precipitationAmount = precipitationAmount;
  }


  public ForecastUnits precipitationAmountMax(String precipitationAmountMax) {
    this.precipitationAmountMax = precipitationAmountMax;
    return this;
  }

  /**
   * Get precipitationAmountMax
   * @return precipitationAmountMax
   */
  @javax.annotation.Nullable
  public String getPrecipitationAmountMax() {
    return precipitationAmountMax;
  }

  public void setPrecipitationAmountMax(String precipitationAmountMax) {
    this.precipitationAmountMax = precipitationAmountMax;
  }


  public ForecastUnits precipitationAmountMin(String precipitationAmountMin) {
    this.precipitationAmountMin = precipitationAmountMin;
    return this;
  }

  /**
   * Get precipitationAmountMin
   * @return precipitationAmountMin
   */
  @javax.annotation.Nullable
  public String getPrecipitationAmountMin() {
    return precipitationAmountMin;
  }

  public void setPrecipitationAmountMin(String precipitationAmountMin) {
    this.precipitationAmountMin = precipitationAmountMin;
  }


  public ForecastUnits probabilityOfPrecipitation(String probabilityOfPrecipitation) {
    this.probabilityOfPrecipitation = probabilityOfPrecipitation;
    return this;
  }

  /**
   * Get probabilityOfPrecipitation
   * @return probabilityOfPrecipitation
   */
  @javax.annotation.Nullable
  public String getProbabilityOfPrecipitation() {
    return probabilityOfPrecipitation;
  }

  public void setProbabilityOfPrecipitation(String probabilityOfPrecipitation) {
    this.probabilityOfPrecipitation = probabilityOfPrecipitation;
  }


  public ForecastUnits probabilityOfThunder(String probabilityOfThunder) {
    this.probabilityOfThunder = probabilityOfThunder;
    return this;
  }

  /**
   * Get probabilityOfThunder
   * @return probabilityOfThunder
   */
  @javax.annotation.Nullable
  public String getProbabilityOfThunder() {
    return probabilityOfThunder;
  }

  public void setProbabilityOfThunder(String probabilityOfThunder) {
    this.probabilityOfThunder = probabilityOfThunder;
  }


  public ForecastUnits relativeHumidity(String relativeHumidity) {
    this.relativeHumidity = relativeHumidity;
    return this;
  }

  /**
   * Get relativeHumidity
   * @return relativeHumidity
   */
  @javax.annotation.Nullable
  public String getRelativeHumidity() {
    return relativeHumidity;
  }

  public void setRelativeHumidity(String relativeHumidity) {
    this.relativeHumidity = relativeHumidity;
  }


  public ForecastUnits ultravioletIndexClearSkyMax(String ultravioletIndexClearSkyMax) {
    this.ultravioletIndexClearSkyMax = ultravioletIndexClearSkyMax;
    return this;
  }

  /**
   * Get ultravioletIndexClearSkyMax
   * @return ultravioletIndexClearSkyMax
   */
  @javax.annotation.Nullable
  public String getUltravioletIndexClearSkyMax() {
    return ultravioletIndexClearSkyMax;
  }

  public void setUltravioletIndexClearSkyMax(String ultravioletIndexClearSkyMax) {
    this.ultravioletIndexClearSkyMax = ultravioletIndexClearSkyMax;
  }


  public ForecastUnits windFromDirection(String windFromDirection) {
    this.windFromDirection = windFromDirection;
    return this;
  }

  /**
   * Get windFromDirection
   * @return windFromDirection
   */
  @javax.annotation.Nullable
  public String getWindFromDirection() {
    return windFromDirection;
  }

  public void setWindFromDirection(String windFromDirection) {
    this.windFromDirection = windFromDirection;
  }


  public ForecastUnits windSpeed(String windSpeed) {
    this.windSpeed = windSpeed;
    return this;
  }

  /**
   * Get windSpeed
   * @return windSpeed
   */
  @javax.annotation.Nullable
  public String getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(String windSpeed) {
    this.windSpeed = windSpeed;
  }


  public ForecastUnits windSpeedOfGust(String windSpeedOfGust) {
    this.windSpeedOfGust = windSpeedOfGust;
    return this;
  }

  /**
   * Get windSpeedOfGust
   * @return windSpeedOfGust
   */
  @javax.annotation.Nullable
  public String getWindSpeedOfGust() {
    return windSpeedOfGust;
  }

  public void setWindSpeedOfGust(String windSpeedOfGust) {
    this.windSpeedOfGust = windSpeedOfGust;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastUnits forecastUnits = (ForecastUnits) o;
    return Objects.equals(this.airPressureAtSeaLevel, forecastUnits.airPressureAtSeaLevel) &&
        Objects.equals(this.airTemperature, forecastUnits.airTemperature) &&
        Objects.equals(this.airTemperatureMax, forecastUnits.airTemperatureMax) &&
        Objects.equals(this.airTemperatureMin, forecastUnits.airTemperatureMin) &&
        Objects.equals(this.cloudAreaFraction, forecastUnits.cloudAreaFraction) &&
        Objects.equals(this.cloudAreaFractionHigh, forecastUnits.cloudAreaFractionHigh) &&
        Objects.equals(this.cloudAreaFractionLow, forecastUnits.cloudAreaFractionLow) &&
        Objects.equals(this.cloudAreaFractionMedium, forecastUnits.cloudAreaFractionMedium) &&
        Objects.equals(this.dewPointTemperature, forecastUnits.dewPointTemperature) &&
        Objects.equals(this.fogAreaFraction, forecastUnits.fogAreaFraction) &&
        Objects.equals(this.precipitationAmount, forecastUnits.precipitationAmount) &&
        Objects.equals(this.precipitationAmountMax, forecastUnits.precipitationAmountMax) &&
        Objects.equals(this.precipitationAmountMin, forecastUnits.precipitationAmountMin) &&
        Objects.equals(this.probabilityOfPrecipitation, forecastUnits.probabilityOfPrecipitation) &&
        Objects.equals(this.probabilityOfThunder, forecastUnits.probabilityOfThunder) &&
        Objects.equals(this.relativeHumidity, forecastUnits.relativeHumidity) &&
        Objects.equals(this.ultravioletIndexClearSkyMax, forecastUnits.ultravioletIndexClearSkyMax) &&
        Objects.equals(this.windFromDirection, forecastUnits.windFromDirection) &&
        Objects.equals(this.windSpeed, forecastUnits.windSpeed) &&
        Objects.equals(this.windSpeedOfGust, forecastUnits.windSpeedOfGust);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(airPressureAtSeaLevel, airTemperature, airTemperatureMax, airTemperatureMin, cloudAreaFraction, cloudAreaFractionHigh, cloudAreaFractionLow, cloudAreaFractionMedium, dewPointTemperature, fogAreaFraction, precipitationAmount, precipitationAmountMax, precipitationAmountMin, probabilityOfPrecipitation, probabilityOfThunder, relativeHumidity, ultravioletIndexClearSkyMax, windFromDirection, windSpeed, windSpeedOfGust);
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
    sb.append("class ForecastUnits {\n");
    sb.append("    airPressureAtSeaLevel: ").append(toIndentedString(airPressureAtSeaLevel)).append("\n");
    sb.append("    airTemperature: ").append(toIndentedString(airTemperature)).append("\n");
    sb.append("    airTemperatureMax: ").append(toIndentedString(airTemperatureMax)).append("\n");
    sb.append("    airTemperatureMin: ").append(toIndentedString(airTemperatureMin)).append("\n");
    sb.append("    cloudAreaFraction: ").append(toIndentedString(cloudAreaFraction)).append("\n");
    sb.append("    cloudAreaFractionHigh: ").append(toIndentedString(cloudAreaFractionHigh)).append("\n");
    sb.append("    cloudAreaFractionLow: ").append(toIndentedString(cloudAreaFractionLow)).append("\n");
    sb.append("    cloudAreaFractionMedium: ").append(toIndentedString(cloudAreaFractionMedium)).append("\n");
    sb.append("    dewPointTemperature: ").append(toIndentedString(dewPointTemperature)).append("\n");
    sb.append("    fogAreaFraction: ").append(toIndentedString(fogAreaFraction)).append("\n");
    sb.append("    precipitationAmount: ").append(toIndentedString(precipitationAmount)).append("\n");
    sb.append("    precipitationAmountMax: ").append(toIndentedString(precipitationAmountMax)).append("\n");
    sb.append("    precipitationAmountMin: ").append(toIndentedString(precipitationAmountMin)).append("\n");
    sb.append("    probabilityOfPrecipitation: ").append(toIndentedString(probabilityOfPrecipitation)).append("\n");
    sb.append("    probabilityOfThunder: ").append(toIndentedString(probabilityOfThunder)).append("\n");
    sb.append("    relativeHumidity: ").append(toIndentedString(relativeHumidity)).append("\n");
    sb.append("    ultravioletIndexClearSkyMax: ").append(toIndentedString(ultravioletIndexClearSkyMax)).append("\n");
    sb.append("    windFromDirection: ").append(toIndentedString(windFromDirection)).append("\n");
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
    sb.append("    windSpeedOfGust: ").append(toIndentedString(windSpeedOfGust)).append("\n");
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
    openapiFields.add("air_pressure_at_sea_level");
    openapiFields.add("air_temperature");
    openapiFields.add("air_temperature_max");
    openapiFields.add("air_temperature_min");
    openapiFields.add("cloud_area_fraction");
    openapiFields.add("cloud_area_fraction_high");
    openapiFields.add("cloud_area_fraction_low");
    openapiFields.add("cloud_area_fraction_medium");
    openapiFields.add("dew_point_temperature");
    openapiFields.add("fog_area_fraction");
    openapiFields.add("precipitation_amount");
    openapiFields.add("precipitation_amount_max");
    openapiFields.add("precipitation_amount_min");
    openapiFields.add("probability_of_precipitation");
    openapiFields.add("probability_of_thunder");
    openapiFields.add("relative_humidity");
    openapiFields.add("ultraviolet_index_clear_sky_max");
    openapiFields.add("wind_from_direction");
    openapiFields.add("wind_speed");
    openapiFields.add("wind_speed_of_gust");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ForecastUnits
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ForecastUnits.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ForecastUnits is not found in the empty JSON string", ForecastUnits.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ForecastUnits.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ForecastUnits` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("air_pressure_at_sea_level") != null && !jsonObj.get("air_pressure_at_sea_level").isJsonNull()) && !jsonObj.get("air_pressure_at_sea_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `air_pressure_at_sea_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("air_pressure_at_sea_level").toString()));
      }
      if ((jsonObj.get("air_temperature") != null && !jsonObj.get("air_temperature").isJsonNull()) && !jsonObj.get("air_temperature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `air_temperature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("air_temperature").toString()));
      }
      if ((jsonObj.get("air_temperature_max") != null && !jsonObj.get("air_temperature_max").isJsonNull()) && !jsonObj.get("air_temperature_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `air_temperature_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("air_temperature_max").toString()));
      }
      if ((jsonObj.get("air_temperature_min") != null && !jsonObj.get("air_temperature_min").isJsonNull()) && !jsonObj.get("air_temperature_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `air_temperature_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("air_temperature_min").toString()));
      }
      if ((jsonObj.get("cloud_area_fraction") != null && !jsonObj.get("cloud_area_fraction").isJsonNull()) && !jsonObj.get("cloud_area_fraction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloud_area_fraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloud_area_fraction").toString()));
      }
      if ((jsonObj.get("cloud_area_fraction_high") != null && !jsonObj.get("cloud_area_fraction_high").isJsonNull()) && !jsonObj.get("cloud_area_fraction_high").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloud_area_fraction_high` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloud_area_fraction_high").toString()));
      }
      if ((jsonObj.get("cloud_area_fraction_low") != null && !jsonObj.get("cloud_area_fraction_low").isJsonNull()) && !jsonObj.get("cloud_area_fraction_low").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloud_area_fraction_low` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloud_area_fraction_low").toString()));
      }
      if ((jsonObj.get("cloud_area_fraction_medium") != null && !jsonObj.get("cloud_area_fraction_medium").isJsonNull()) && !jsonObj.get("cloud_area_fraction_medium").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloud_area_fraction_medium` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloud_area_fraction_medium").toString()));
      }
      if ((jsonObj.get("dew_point_temperature") != null && !jsonObj.get("dew_point_temperature").isJsonNull()) && !jsonObj.get("dew_point_temperature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dew_point_temperature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dew_point_temperature").toString()));
      }
      if ((jsonObj.get("fog_area_fraction") != null && !jsonObj.get("fog_area_fraction").isJsonNull()) && !jsonObj.get("fog_area_fraction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fog_area_fraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fog_area_fraction").toString()));
      }
      if ((jsonObj.get("precipitation_amount") != null && !jsonObj.get("precipitation_amount").isJsonNull()) && !jsonObj.get("precipitation_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `precipitation_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("precipitation_amount").toString()));
      }
      if ((jsonObj.get("precipitation_amount_max") != null && !jsonObj.get("precipitation_amount_max").isJsonNull()) && !jsonObj.get("precipitation_amount_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `precipitation_amount_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("precipitation_amount_max").toString()));
      }
      if ((jsonObj.get("precipitation_amount_min") != null && !jsonObj.get("precipitation_amount_min").isJsonNull()) && !jsonObj.get("precipitation_amount_min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `precipitation_amount_min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("precipitation_amount_min").toString()));
      }
      if ((jsonObj.get("probability_of_precipitation") != null && !jsonObj.get("probability_of_precipitation").isJsonNull()) && !jsonObj.get("probability_of_precipitation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `probability_of_precipitation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("probability_of_precipitation").toString()));
      }
      if ((jsonObj.get("probability_of_thunder") != null && !jsonObj.get("probability_of_thunder").isJsonNull()) && !jsonObj.get("probability_of_thunder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `probability_of_thunder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("probability_of_thunder").toString()));
      }
      if ((jsonObj.get("relative_humidity") != null && !jsonObj.get("relative_humidity").isJsonNull()) && !jsonObj.get("relative_humidity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relative_humidity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relative_humidity").toString()));
      }
      if ((jsonObj.get("ultraviolet_index_clear_sky_max") != null && !jsonObj.get("ultraviolet_index_clear_sky_max").isJsonNull()) && !jsonObj.get("ultraviolet_index_clear_sky_max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ultraviolet_index_clear_sky_max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ultraviolet_index_clear_sky_max").toString()));
      }
      if ((jsonObj.get("wind_from_direction") != null && !jsonObj.get("wind_from_direction").isJsonNull()) && !jsonObj.get("wind_from_direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wind_from_direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wind_from_direction").toString()));
      }
      if ((jsonObj.get("wind_speed") != null && !jsonObj.get("wind_speed").isJsonNull()) && !jsonObj.get("wind_speed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wind_speed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wind_speed").toString()));
      }
      if ((jsonObj.get("wind_speed_of_gust") != null && !jsonObj.get("wind_speed_of_gust").isJsonNull()) && !jsonObj.get("wind_speed_of_gust").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wind_speed_of_gust` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wind_speed_of_gust").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ForecastUnits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ForecastUnits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ForecastUnits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ForecastUnits.class));

       return (TypeAdapter<T>) new TypeAdapter<ForecastUnits>() {
           @Override
           public void write(JsonWriter out, ForecastUnits value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ForecastUnits read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ForecastUnits given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ForecastUnits
   * @throws IOException if the JSON string is invalid with respect to ForecastUnits
   */
  public static ForecastUnits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ForecastUnits.class);
  }

  /**
   * Convert an instance of ForecastUnits to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
