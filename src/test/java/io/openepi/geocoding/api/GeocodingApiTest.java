package io.openepi.geocoding.api;

import java.math.BigDecimal;
import io.openepi.common.ApiException;
import io.openepi.geocoding.model.*;
import io.openepi.geocoding.model.Properties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * API tests for GeocodingApi
 */
public class GeocodingApiTest {

    @Mock
    private final GeocodingApi api = new GeocodingApi();

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getGeocodingTest() throws ApiException {
        String q = "Kigali, Rwanda";

        FeatureCollection mockResponse = new FeatureCollection();
        Feature mockFeature = new Feature();
        Point mockPoint = new Point();
        List<String> mockCoordinates = Arrays.asList("-1.97", "30.10");
        mockPoint.setCoordinates(mockCoordinates);
        Geometry mockGeometry = new Geometry(mockPoint);
        mockFeature.setGeometry(mockGeometry);
        List<Feature> mockFeatures = Arrays.asList(mockFeature);
        mockResponse.setFeatures(mockFeatures);

        when(api.getGeocoding(q, null, null, null, null)).thenReturn(mockResponse);

        FeatureCollection response = api.getGeocoding(q, null, null, null, null);
        assertEquals(Arrays.asList("-1.97", "30.10"), response.getFeatures().get(0).getGeometry().getPoint().getCoordinates());
    }

    @Test
    public void getReverseGeocodingTest() throws ApiException {
        BigDecimal lat = new BigDecimal("-1.97");
        BigDecimal lon = new BigDecimal("30.10");

        FeatureCollection mockResponse = new FeatureCollection();
        Feature mockFeature = new Feature();
        Properties mockProperties = new Properties();
        mockProperties.setCountrycode("RW");
        mockFeature.setProperties(mockProperties);
        List<Feature> mockFeatures = Arrays.asList(mockFeature);
        mockResponse.setFeatures(mockFeatures);

        when(api.getReverseGeocoding(lat, lon, null, null)).thenReturn(mockResponse);

        FeatureCollection response = api.getReverseGeocoding(lat, lon, null, null);
        assertEquals("RW", response.getFeatures().get(0).getProperties().getCountrycode());
    }

}
