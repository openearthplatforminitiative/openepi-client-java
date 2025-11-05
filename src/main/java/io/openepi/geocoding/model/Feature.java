package io.openepi.geocoding.model;

public class Feature {
    private String type;
    private Geometry geometry;
    private Properties properties;

    public String getType() { return type; }
    public Geometry getGeometry() { return geometry; }
    public Properties getProperties() { return properties; }

    public Feature(Geometry geometry, Properties properties) {
        this.type = "Feature";
        this.geometry = geometry;
        this.properties = properties;
    }

    public Feature() {
        this.type = "Feature";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}