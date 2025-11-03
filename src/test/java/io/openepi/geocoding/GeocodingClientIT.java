package io.openepi.geocoding;

import io.openepi.geocoding.model.FeatureCollection;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class GeocodingClientIT {

    private final String query = "Kigali, Rwanda";

    @Test
    public void testGeocode() {
        FeatureCollection geocode = new GeocodingClient().geocode(query);
        assertTrue(geocode.getFeatures().size() > 1);
    }

    @Test
    public void testGeocodeAsync() {
        new GeocodingClient().geocodeAsync(query).thenAccept(geocode -> {
            assertTrue(geocode.getFeatures().size() > 1);
        }).join();
    }

    @Test
    public void testReverse() {
        double lat = -1.97;
        double lon = 30.10;
        FeatureCollection reverse = new GeocodingClient().reverse(lat, lon, 10);
        assertTrue(reverse.getFeatures().size() > 1);
    }

    @Test
    public void testReverseAsync() {
        double lat = -1.97;
        double lon = 30.10;
        new GeocodingClient().reverseAsync(lat, lon, 10, null).thenAccept(reverse -> {
            assertTrue(reverse.getFeatures().size() > 1);
        }).join();
    }
}
