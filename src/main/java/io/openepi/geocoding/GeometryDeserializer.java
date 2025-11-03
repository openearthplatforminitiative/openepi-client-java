package io.openepi.geocoding;

import com.google.gson.*;
import io.openepi.geocoding.model.*;
import java.lang.reflect.Type;

public class GeometryDeserializer implements JsonDeserializer<Geometry> {

    @Override
    public Geometry deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        String geoType = obj.get("type").getAsString();

        switch (geoType) {
            case "Point":
                return context.deserialize(obj, Point.class);
            case "MultiPoint":
                return context.deserialize(obj, MultiPoint.class);
            case "LineString":
                return context.deserialize(obj, LineString.class);
            case "MultiLineString":
                return context.deserialize(obj, MultiLineString.class);
            case "Polygon":
                return context.deserialize(obj, Polygon.class);
            case "MultiPolygon":
                return context.deserialize(obj, MultiPolygon.class);
            default:
                throw new JsonParseException("Unknown geometry type: " + geoType);
        }
    }
}