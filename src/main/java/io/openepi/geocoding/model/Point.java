package io.openepi.geocoding.model;

import java.util.List;

public class Point implements Geometry {
    private String type;
    private List<Double> coordinates;

    @Override public String getType() { return type; }
    public List<Double> getCoordinates() { return coordinates; }

    public void setType(String type) { this.type = type; }
    public void setCoordinates(List<Double> coordinates) { this.coordinates = coordinates; }

    public Point(List<Double> coordinates) {
        this.type = "Point";
        this.coordinates = coordinates;
    }

    public Point() {
        this.type = "Point";
    }
}