package io.openepi.geocoding.model;

import java.util.List;

public class FeatureCollection {
    private String type;
    private List<Feature> features;

    public String getType() { return type; }
    public List<Feature> getFeatures() { return features; }

    public FeatureCollection(List<Feature> features) {
        this();
        this.features = features;
    }

    public FeatureCollection() {
        this.type = "FeatureCollection";
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}