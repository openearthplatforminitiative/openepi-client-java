package io.openepi.weather.model;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.openepi.weather.WeatherJSON;

import java.io.IOException;


public class METJSONSunrise {
    public static final String SERIALIZED_NAME_COPYRIGHT = "copyright";
    @SerializedName(SERIALIZED_NAME_COPYRIGHT)
    @javax.annotation.Nonnull
    private String copyright;

    public static final String SERIALIZED_NAME_LICENSEURL = "licenseURL";
    @SerializedName(SERIALIZED_NAME_LICENSEURL)
    @javax.annotation.Nonnull
    private String licenseURL;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    @javax.annotation.Nonnull
    private String type;

    public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
    @SerializedName(SERIALIZED_NAME_GEOMETRY)
    @javax.annotation.Nonnull
    private PointGeometry geometry;

    public static final String SERIALIZED_NAME_PROPERTIES = "properties";
    @SerializedName(SERIALIZED_NAME_PROPERTIES)
    @javax.annotation.Nonnull
    private SunriseForecast properties;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getLicenseURL() {
        return licenseURL;
    }

    public void setLicenseURL(String licenseURL) {
        this.licenseURL = licenseURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PointGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(PointGeometry geometry) {
        this.geometry = geometry;
    }

    public SunriseForecast getProperties() {
        return properties;
    }

    public void setProperties(SunriseForecast properties) {
        this.properties = properties;
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (!jsonElement.isJsonObject()) {
            throw new IllegalArgumentException("Expected a JSON object for METJSONSunrise");
        }
        JsonObject obj = jsonElement.getAsJsonObject();

        if (!obj.has("copyright") || obj.get("copyright").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: copyright");
        }
        if (!obj.has("licenseURL") || obj.get("licenseURL").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: licenseURL");
        }
        if (!obj.has("type") || obj.get("type").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: type");
        }
        if (!obj.has("geometry") || obj.get("geometry").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: geometry");
        } else {
            try {
                PointGeometry.validateJsonElement(obj.get("geometry"));
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
        if (!obj.has("properties") || obj.get("properties").isJsonNull()) {
            throw new IllegalArgumentException("Missing required field: properties");
        } else {
            SunriseForecast.validateJsonElement(obj.get("properties"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!METJSONSunrise.class.isAssignableFrom(type.getRawType())) {
                return null;
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<METJSONSunrise> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(METJSONSunrise.class));

            return (TypeAdapter<T>) new TypeAdapter<METJSONSunrise>() {
                @Override
                public void write(JsonWriter out, METJSONSunrise value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public METJSONSunrise read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    METJSONSunrise.validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }
            }.nullSafe();
        }
    }
    /**
     * Create an instance of METJSONSunrise given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of METJSONSunrise
     * @throws IOException if the JSON string is invalid with respect to METJSONSunrise
     */
    public static METJSONSunrise fromJson(String jsonString) throws IOException {
        return WeatherJSON.getGson().fromJson(jsonString, METJSONSunrise.class);
    }

    /**
     * Convert an instance of METJSONSunrise to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return WeatherJSON.getGson().toJson(this);

    }
}
