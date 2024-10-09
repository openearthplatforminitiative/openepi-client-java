/*
 * Geocoder API
 * <p>This is a RESTful service that provides geocoding and reverse geocoding using <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap<sup>®</sup></a> data. The data is licensed under the <a href=\"https://opendatacommons.org/licenses/odbl/\">Open Data Commons Open Database License (ODbL)</a>, by the <a href=\"https://osmfoundation.org\">OpenStreetMap Foundation (OSMF)</a>.</p><p>The data is sourced from <a href=\"https://photon.komoot.io\">https://photon.komoot.io</a>.</p>
 *
 * The version of the OpenAPI document: 0.4.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openepi.geocoding.model;

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
import io.openepi.geocoding.model.LineString;
import io.openepi.geocoding.model.MultiLineString;
import io.openepi.geocoding.model.MultiPoint;
import io.openepi.geocoding.model.MultiPolygon;
import io.openepi.geocoding.model.Point;
import io.openepi.geocoding.model.Polygon;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import io.openepi.geocoding.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T12:45:40.887231+02:00[Europe/Oslo]", comments = "Generator version: 7.7.0")
public class Geometry extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Geometry.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Geometry.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Geometry' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Point> adapterPoint = gson.getDelegateAdapter(this, TypeToken.get(Point.class));
            final TypeAdapter<MultiPoint> adapterMultiPoint = gson.getDelegateAdapter(this, TypeToken.get(MultiPoint.class));
            final TypeAdapter<LineString> adapterLineString = gson.getDelegateAdapter(this, TypeToken.get(LineString.class));
            final TypeAdapter<MultiLineString> adapterMultiLineString = gson.getDelegateAdapter(this, TypeToken.get(MultiLineString.class));
            final TypeAdapter<Polygon> adapterPolygon = gson.getDelegateAdapter(this, TypeToken.get(Polygon.class));
            final TypeAdapter<MultiPolygon> adapterMultiPolygon = gson.getDelegateAdapter(this, TypeToken.get(MultiPolygon.class));

            return (TypeAdapter<T>) new TypeAdapter<Geometry>() {
                @Override
                public void write(JsonWriter out, Geometry value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Point`
                    if (value.getActualInstance() instanceof Point) {
                        JsonElement element = adapterPoint.toJsonTree((Point)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MultiPoint`
                    if (value.getActualInstance() instanceof MultiPoint) {
                        JsonElement element = adapterMultiPoint.toJsonTree((MultiPoint)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `LineString`
                    if (value.getActualInstance() instanceof LineString) {
                        JsonElement element = adapterLineString.toJsonTree((LineString)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MultiLineString`
                    if (value.getActualInstance() instanceof MultiLineString) {
                        JsonElement element = adapterMultiLineString.toJsonTree((MultiLineString)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Polygon`
                    if (value.getActualInstance() instanceof Polygon) {
                        JsonElement element = adapterPolygon.toJsonTree((Polygon)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MultiPolygon`
                    if (value.getActualInstance() instanceof MultiPolygon) {
                        JsonElement element = adapterMultiPolygon.toJsonTree((MultiPolygon)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: LineString, MultiLineString, MultiPoint, MultiPolygon, Point, Polygon");
                }

                @Override
                public Geometry read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Point
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Point.validateJsonElement(jsonElement);
                        actualAdapter = adapterPoint;
                        Geometry ret = new Geometry();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Point failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Point'", e);
                    }
                    // deserialize MultiPoint
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MultiPoint.validateJsonElement(jsonElement);
                        actualAdapter = adapterMultiPoint;
                        Geometry ret = new Geometry();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MultiPoint failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MultiPoint'", e);
                    }
                    // deserialize LineString
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LineString.validateJsonElement(jsonElement);
                        actualAdapter = adapterLineString;
                        Geometry ret = new Geometry();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LineString failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LineString'", e);
                    }
                    // deserialize MultiLineString
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MultiLineString.validateJsonElement(jsonElement);
                        actualAdapter = adapterMultiLineString;
                        Geometry ret = new Geometry();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MultiLineString failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MultiLineString'", e);
                    }
                    // deserialize Polygon
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Polygon.validateJsonElement(jsonElement);
                        actualAdapter = adapterPolygon;
                        Geometry ret = new Geometry();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Polygon failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Polygon'", e);
                    }
                    // deserialize MultiPolygon
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MultiPolygon.validateJsonElement(jsonElement);
                        actualAdapter = adapterMultiPolygon;
                        Geometry ret = new Geometry();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MultiPolygon failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MultiPolygon'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for Geometry: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Geometry() {
        super("anyOf", Boolean.FALSE);
    }

    public Geometry(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Point", Point.class);
        schemas.put("MultiPoint", MultiPoint.class);
        schemas.put("LineString", LineString.class);
        schemas.put("MultiLineString", MultiLineString.class);
        schemas.put("Polygon", Polygon.class);
        schemas.put("MultiPolygon", MultiPolygon.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Geometry.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * LineString, MultiLineString, MultiPoint, MultiPolygon, Point, Polygon
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Point) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MultiPoint) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LineString) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MultiLineString) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Polygon) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MultiPolygon) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be LineString, MultiLineString, MultiPoint, MultiPolygon, Point, Polygon");
    }

    /**
     * Get the actual instance, which can be the following:
     * LineString, MultiLineString, MultiPoint, MultiPolygon, Point, Polygon
     *
     * @return The actual instance (LineString, MultiLineString, MultiPoint, MultiPolygon, Point, Polygon)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Point`. If the actual instance is not `Point`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Point`
     * @throws ClassCastException if the instance is not `Point`
     */
    public Point getPoint() throws ClassCastException {
        return (Point)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MultiPoint`. If the actual instance is not `MultiPoint`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MultiPoint`
     * @throws ClassCastException if the instance is not `MultiPoint`
     */
    public MultiPoint getMultiPoint() throws ClassCastException {
        return (MultiPoint)super.getActualInstance();
    }
    /**
     * Get the actual instance of `LineString`. If the actual instance is not `LineString`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LineString`
     * @throws ClassCastException if the instance is not `LineString`
     */
    public LineString getLineString() throws ClassCastException {
        return (LineString)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MultiLineString`. If the actual instance is not `MultiLineString`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MultiLineString`
     * @throws ClassCastException if the instance is not `MultiLineString`
     */
    public MultiLineString getMultiLineString() throws ClassCastException {
        return (MultiLineString)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Polygon`. If the actual instance is not `Polygon`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Polygon`
     * @throws ClassCastException if the instance is not `Polygon`
     */
    public Polygon getPolygon() throws ClassCastException {
        return (Polygon)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MultiPolygon`. If the actual instance is not `MultiPolygon`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MultiPolygon`
     * @throws ClassCastException if the instance is not `MultiPolygon`
     */
    public MultiPolygon getMultiPolygon() throws ClassCastException {
        return (MultiPolygon)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Geometry
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Point
        try {
            Point.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Point failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MultiPoint
        try {
            MultiPoint.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MultiPoint failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with LineString
        try {
            LineString.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for LineString failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MultiLineString
        try {
            MultiLineString.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MultiLineString failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Polygon
        try {
            Polygon.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Polygon failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MultiPolygon
        try {
            MultiPolygon.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MultiPolygon failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for Geometry with anyOf schemas: LineString, MultiLineString, MultiPoint, MultiPolygon, Point, Polygon. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of Geometry given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Geometry
     * @throws IOException if the JSON string is invalid with respect to Geometry
     */
    public static Geometry fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Geometry.class);
    }

    /**
     * Convert an instance of Geometry to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
