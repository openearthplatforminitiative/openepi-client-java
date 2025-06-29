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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A identifier that sums up the weather condition for this time period, see documentation.
 */
@JsonAdapter(WeatherSymbol.Adapter.class)
public enum WeatherSymbol {
  
  CLEARSKY_DAY("clearsky_day"),
  
  CLEARSKY_NIGHT("clearsky_night"),
  
  CLEARSKY_POLARTWILIGHT("clearsky_polartwilight"),
  
  FAIR_DAY("fair_day"),
  
  FAIR_NIGHT("fair_night"),
  
  FAIR_POLARTWILIGHT("fair_polartwilight"),
  
  LIGHTSSNOWSHOWERSANDTHUNDER_DAY("lightssnowshowersandthunder_day"),
  
  LIGHTSSNOWSHOWERSANDTHUNDER_NIGHT("lightssnowshowersandthunder_night"),
  
  LIGHTSSNOWSHOWERSANDTHUNDER_POLARTWILIGHT("lightssnowshowersandthunder_polartwilight"),
  
  LIGHTSNOWSHOWERS_DAY("lightsnowshowers_day"),
  
  LIGHTSNOWSHOWERS_NIGHT("lightsnowshowers_night"),
  
  LIGHTSNOWSHOWERS_POLARTWILIGHT("lightsnowshowers_polartwilight"),
  
  HEAVYRAINANDTHUNDER("heavyrainandthunder"),
  
  HEAVYSNOWANDTHUNDER("heavysnowandthunder"),
  
  RAINANDTHUNDER("rainandthunder"),
  
  HEAVYSLEETSHOWERSANDTHUNDER_DAY("heavysleetshowersandthunder_day"),
  
  HEAVYSLEETSHOWERSANDTHUNDER_NIGHT("heavysleetshowersandthunder_night"),
  
  HEAVYSLEETSHOWERSANDTHUNDER_POLARTWILIGHT("heavysleetshowersandthunder_polartwilight"),
  
  HEAVYSNOW("heavysnow"),
  
  HEAVYRAINSHOWERS_DAY("heavyrainshowers_day"),
  
  HEAVYRAINSHOWERS_NIGHT("heavyrainshowers_night"),
  
  HEAVYRAINSHOWERS_POLARTWILIGHT("heavyrainshowers_polartwilight"),
  
  LIGHTSLEET("lightsleet"),
  
  HEAVYRAIN("heavyrain"),
  
  LIGHTRAINSHOWERS_DAY("lightrainshowers_day"),
  
  LIGHTRAINSHOWERS_NIGHT("lightrainshowers_night"),
  
  LIGHTRAINSHOWERS_POLARTWILIGHT("lightrainshowers_polartwilight"),
  
  HEAVYSLEETSHOWERS_DAY("heavysleetshowers_day"),
  
  HEAVYSLEETSHOWERS_NIGHT("heavysleetshowers_night"),
  
  HEAVYSLEETSHOWERS_POLARTWILIGHT("heavysleetshowers_polartwilight"),
  
  LIGHTSLEETSHOWERS_DAY("lightsleetshowers_day"),
  
  LIGHTSLEETSHOWERS_NIGHT("lightsleetshowers_night"),
  
  LIGHTSLEETSHOWERS_POLARTWILIGHT("lightsleetshowers_polartwilight"),
  
  SNOW("snow"),
  
  HEAVYRAINSHOWERSANDTHUNDER_DAY("heavyrainshowersandthunder_day"),
  
  HEAVYRAINSHOWERSANDTHUNDER_NIGHT("heavyrainshowersandthunder_night"),
  
  HEAVYRAINSHOWERSANDTHUNDER_POLARTWILIGHT("heavyrainshowersandthunder_polartwilight"),
  
  SNOWSHOWERS_DAY("snowshowers_day"),
  
  SNOWSHOWERS_NIGHT("snowshowers_night"),
  
  SNOWSHOWERS_POLARTWILIGHT("snowshowers_polartwilight"),
  
  FOG("fog"),
  
  SNOWSHOWERSANDTHUNDER_DAY("snowshowersandthunder_day"),
  
  SNOWSHOWERSANDTHUNDER_NIGHT("snowshowersandthunder_night"),
  
  SNOWSHOWERSANDTHUNDER_POLARTWILIGHT("snowshowersandthunder_polartwilight"),
  
  LIGHTSNOWANDTHUNDER("lightsnowandthunder"),
  
  HEAVYSLEETANDTHUNDER("heavysleetandthunder"),
  
  LIGHTRAIN("lightrain"),
  
  RAINSHOWERSANDTHUNDER_DAY("rainshowersandthunder_day"),
  
  RAINSHOWERSANDTHUNDER_NIGHT("rainshowersandthunder_night"),
  
  RAINSHOWERSANDTHUNDER_POLARTWILIGHT("rainshowersandthunder_polartwilight"),
  
  RAIN("rain"),
  
  LIGHTSNOW("lightsnow"),
  
  LIGHTRAINSHOWERSANDTHUNDER_DAY("lightrainshowersandthunder_day"),
  
  LIGHTRAINSHOWERSANDTHUNDER_NIGHT("lightrainshowersandthunder_night"),
  
  LIGHTRAINSHOWERSANDTHUNDER_POLARTWILIGHT("lightrainshowersandthunder_polartwilight"),
  
  HEAVYSLEET("heavysleet"),
  
  SLEETANDTHUNDER("sleetandthunder"),
  
  LIGHTRAINANDTHUNDER("lightrainandthunder"),
  
  SLEET("sleet"),
  
  LIGHTSSLEETSHOWERSANDTHUNDER_DAY("lightssleetshowersandthunder_day"),
  
  LIGHTSSLEETSHOWERSANDTHUNDER_NIGHT("lightssleetshowersandthunder_night"),
  
  LIGHTSSLEETSHOWERSANDTHUNDER_POLARTWILIGHT("lightssleetshowersandthunder_polartwilight"),
  
  LIGHTSLEETANDTHUNDER("lightsleetandthunder"),
  
  PARTLYCLOUDY_DAY("partlycloudy_day"),
  
  PARTLYCLOUDY_NIGHT("partlycloudy_night"),
  
  PARTLYCLOUDY_POLARTWILIGHT("partlycloudy_polartwilight"),
  
  SLEETSHOWERSANDTHUNDER_DAY("sleetshowersandthunder_day"),
  
  SLEETSHOWERSANDTHUNDER_NIGHT("sleetshowersandthunder_night"),
  
  SLEETSHOWERSANDTHUNDER_POLARTWILIGHT("sleetshowersandthunder_polartwilight"),
  
  RAINSHOWERS_DAY("rainshowers_day"),
  
  RAINSHOWERS_NIGHT("rainshowers_night"),
  
  RAINSHOWERS_POLARTWILIGHT("rainshowers_polartwilight"),
  
  SNOWANDTHUNDER("snowandthunder"),
  
  SLEETSHOWERS_DAY("sleetshowers_day"),
  
  SLEETSHOWERS_NIGHT("sleetshowers_night"),
  
  SLEETSHOWERS_POLARTWILIGHT("sleetshowers_polartwilight"),
  
  CLOUDY("cloudy"),
  
  HEAVYSNOWSHOWERSANDTHUNDER_DAY("heavysnowshowersandthunder_day"),
  
  HEAVYSNOWSHOWERSANDTHUNDER_NIGHT("heavysnowshowersandthunder_night"),
  
  HEAVYSNOWSHOWERSANDTHUNDER_POLARTWILIGHT("heavysnowshowersandthunder_polartwilight"),
  
  HEAVYSNOWSHOWERS_DAY("heavysnowshowers_day"),
  
  HEAVYSNOWSHOWERS_NIGHT("heavysnowshowers_night"),
  
  HEAVYSNOWSHOWERS_POLARTWILIGHT("heavysnowshowers_polartwilight");

  private String value;

  WeatherSymbol(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WeatherSymbol fromValue(String value) {
    for (WeatherSymbol b : WeatherSymbol.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WeatherSymbol> {
    @Override
    public void write(final JsonWriter jsonWriter, final WeatherSymbol enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WeatherSymbol read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WeatherSymbol.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    WeatherSymbol.fromValue(value);
  }
}

