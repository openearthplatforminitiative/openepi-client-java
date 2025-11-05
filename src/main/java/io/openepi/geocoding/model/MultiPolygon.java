package io.openepi.geocoding.model;

import java.util.List;

public class MultiPolygon implements Geometry {
    private String type;
    private List<List<List<List<Double>>>> coordinates;

    @Override public String getType() { return type; }
    public List<List<List<List<Double>>>> getCoordinates() { return coordinates; }
}