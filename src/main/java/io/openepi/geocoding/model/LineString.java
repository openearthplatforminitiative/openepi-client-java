package io.openepi.geocoding.model;

import java.util.List;

public class LineString implements Geometry {
    private String type;
    private List<List<Double>> coordinates;

    @Override public String getType() { return type; }
    public List<List<Double>> getCoordinates() { return coordinates; }
}