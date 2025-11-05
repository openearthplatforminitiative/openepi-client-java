package io.openepi.geocoding.model;

import java.util.List;

public class Properties {
    private String name;
    private String osm_type;
    private long osm_id;
    private String type;
    private String country;
    private String county;
    private String city;
    private String countrycode;
    private String osm_key;
    private String osm_value;
    private String postcode;
    private List<Double> extent;

    public String getName() { return name; }
    public String getOsmType() { return osm_type; }
    public long getOsmId() { return osm_id; }
    public String getType() { return type; }
    public String getCountry() { return country; }
    public String getCounty() { return county; }
    public String getCity() { return city; }
    public String getCountryCode() { return countrycode; }
    public String getOsmKey() { return osm_key; }
    public String getOsmValue() { return osm_value; }
    public String getPostcode() { return postcode; }
    public List<Double> getExtent() { return extent; }

    public void setName(String name) {
        this.name = name;
    }

    public void setOsm_type(String osm_type) {
        this.osm_type = osm_type;
    }

    public void setOsm_id(long osm_id) {
        this.osm_id = osm_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public void setOsm_key(String osm_key) {
        this.osm_key = osm_key;
    }

    public void setOsm_value(String osm_value) {
        this.osm_value = osm_value;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setExtent(List<Double> extent) {
        this.extent = extent;
    }
}