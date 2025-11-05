package io.openepi.common;

import java.util.Objects;
import java.util.Optional;

public class GeoLocation {
    private final float lat;
    private final float lon;
    private final Integer alt;

    public GeoLocation(final float lat, float lon, Integer alt) {
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
    }

    public GeoLocation(final float lat, float lon) {
        this(lat, lon, null);
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    public Optional<Integer> getAlt() {
        return Optional.ofNullable(alt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoLocation that = (GeoLocation) o;
        return Float.compare(lat, that.lat) == 0 && Float.compare(lon, that.lon) == 0 && Objects.equals(alt, that.alt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon, alt);
    }
}
