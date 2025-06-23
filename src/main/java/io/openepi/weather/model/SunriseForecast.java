package io.openepi.weather.model;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.reflect.TypeToken;
import io.openepi.weather.WeatherJSON;

import java.io.IOException;

public class SunriseForecast {
    private String body;
    private SolarTime sunrise;
    private SolarTime sunset;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public SolarTime getSunrise() {
        return sunrise;
    }

    public void setSunrise(SolarTime sunrise) {
        this.sunrise = sunrise;
    }

    public SolarTime getSunset() {
        return sunset;
    }

    public void setSunset(SolarTime sunset) {
        this.sunset = sunset;
    }

    public static void validateJsonElement(JsonElement jsonElement) {
        if (!jsonElement.isJsonObject()) {
            throw new IllegalArgumentException("Expected a JSON object");
        }
        JsonObject obj = jsonElement.getAsJsonObject();

        if (!obj.has("body") || obj.get("body").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: body");
        }
        if (!obj.has("sunrise") || obj.get("sunrise").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: sunrise");
        }
        if (!obj.has("sunset") || obj.get("sunset").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: sunset");
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SunriseForecast.class.isAssignableFrom(type.getRawType())) {
                return null;
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SunriseForecast> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(SunriseForecast.class));

            return (TypeAdapter<T>) new TypeAdapter<SunriseForecast>() {
                @Override
                public void write(JsonWriter out, SunriseForecast value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public SunriseForecast read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    SunriseForecast.validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }
            }.nullSafe();
        }
    }
    /**
     * Create an instance of SunriseForecast given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SunriseForecast
     * @throws IOException if the JSON string is invalid with respect to SunriseForecast
     */
    public static SunriseForecast fromJson(String jsonString) throws IOException {
        return WeatherJSON.getGson().fromJson(jsonString, SunriseForecast.class);
    }

    /**
     * Convert an instance of SunriseForecast to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return WeatherJSON.getGson().toJson(this);

    }
}

