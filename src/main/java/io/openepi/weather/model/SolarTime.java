package io.openepi.weather.model;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.reflect.TypeToken;
import io.openepi.weather.WeatherJSON;

public class SolarTime {
    private OffsetDateTime time;
    private BigDecimal azimuth;

    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    public BigDecimal getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(BigDecimal azimuth) {
        this.azimuth = azimuth;
    }


    public static void validateJsonElement(JsonElement jsonElement) {
        if (!jsonElement.isJsonObject()) {
            throw new IllegalArgumentException("Expected a JSON object for SolarTime");
        }
        JsonObject obj = jsonElement.getAsJsonObject();

        if (!obj.has("time") || obj.get("time").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: time");
        }
        // azimuth is optional, no check needed
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SolarTime.class.isAssignableFrom(type.getRawType())) {
                return null;
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SolarTime> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(SolarTime.class));

            return (TypeAdapter<T>) new TypeAdapter<SolarTime>() {
                @Override
                public void write(JsonWriter out, SolarTime value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public SolarTime read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    SolarTime.validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }
            }.nullSafe();
        }
    }

    /**
     * Create an instance of SolarTime given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SolarTime
     * @throws IOException if the JSON string is invalid with respect to SolarTime
     */
    public static SolarTime fromJson(String jsonString) throws IOException {
        return WeatherJSON.getGson().fromJson(jsonString, SolarTime.class);
    }

    /**
     * Convert an instance of SolarTime to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return WeatherJSON.getGson().toJson(this);

    }
}
