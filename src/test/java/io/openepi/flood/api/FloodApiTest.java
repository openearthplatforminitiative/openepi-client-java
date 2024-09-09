package io.openepi.flood.api;

import io.openepi.common.ApiException;
import java.math.BigDecimal;

import io.openepi.flood.model.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * API tests for FloodApi
 */
public class FloodApiTest {

    @Mock
    private FloodApi api = new FloodApi();

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getDetailedForecastTest() throws ApiException {
        BigDecimal lon = new BigDecimal("33.57");
        BigDecimal lat = BigDecimal.valueOf(-1.37);
        Boolean includeNeighbors = false;

        BigDecimal minLon = new BigDecimal("33.5");
        BigDecimal maxLon = new BigDecimal("34.55");
        BigDecimal minLat = BigDecimal.valueOf(-1.4);
        BigDecimal maxLat = BigDecimal.valueOf(-1.3);

        DetailedResponseModel mockResponse = new DetailedResponseModel();
        DetailedFeatureCollection mockFeatureCollection = new DetailedFeatureCollection();
        DetailedFeature mockFeature = new DetailedFeature();
        mockFeature.setId("123");
        mockFeatureCollection.addFeaturesItem(mockFeature);
        mockResponse.setQueriedLocation(mockFeatureCollection);

        when(api.getDetailedForecast(lon, lat, null, null, null, null, includeNeighbors, null, null)).thenReturn(mockResponse);
        when(api.getDetailedForecast(null, null, minLon, maxLon, minLat, maxLat, includeNeighbors, null, null)).thenReturn(mockResponse);

        DetailedResponseModel response = api.getDetailedForecast(lon, lat, null, null, null, null, includeNeighbors, null, null);
        assertEquals("123", response.getQueriedLocation().getFeatures().get(0).getId());

        response = api.getDetailedForecast(null, null, minLon, maxLon, minLat, maxLat, includeNeighbors, null, null);
        assertEquals("123", response.getQueriedLocation().getFeatures().get(0).getId());
    }


    @Test
    public void getForecastSummaryTest() throws ApiException {
        BigDecimal lon = new BigDecimal("33.57");
        BigDecimal lat = BigDecimal.valueOf(-1.37);
        Boolean includeNeighbors = false;

        BigDecimal minLon = new BigDecimal("33.5");
        BigDecimal maxLon = new BigDecimal("34.55");
        BigDecimal minLat = BigDecimal.valueOf(-1.4);
        BigDecimal maxLat = BigDecimal.valueOf(-1.3);

        SummaryResponseModel mockResponse = new SummaryResponseModel();
        SummaryFeatureCollection mockFeatureCollection = new SummaryFeatureCollection();
        SummaryFeature mockFeature = new SummaryFeature();
        mockFeature.setId("123");
        mockFeatureCollection.addFeaturesItem(mockFeature);
        mockResponse.setQueriedLocation(mockFeatureCollection);

        when(api.getForecastSummary(lon, lat, null, null, null, null, includeNeighbors)).thenReturn(mockResponse);
        when(api.getForecastSummary(null, null, minLon, maxLon, minLat, maxLat, includeNeighbors)).thenReturn(mockResponse);

        SummaryResponseModel response = api.getForecastSummary(lon, lat, null, null, null, null, includeNeighbors);
        assertEquals("123", response.getQueriedLocation().getFeatures().get(0).getId());

        response = api.getForecastSummary(null, null, minLon, maxLon, minLat, maxLat, includeNeighbors);
        assertEquals("123", response.getQueriedLocation().getFeatures().get(0).getId());
    }

    @Test
    public void getThresholdTest() throws ApiException {
        BigDecimal lon = new BigDecimal("33.57");
        BigDecimal lat = BigDecimal.valueOf(-1.37);

        BigDecimal minLon = new BigDecimal("33.5");
        BigDecimal maxLon = new BigDecimal("34.55");
        BigDecimal minLat = BigDecimal.valueOf(-1.4);
        BigDecimal maxLat = BigDecimal.valueOf(-1.3);

        ThresholdResponseModel mockResponse = new ThresholdResponseModel();
        ThresholdFeatureCollection mockFeatureCollection = new ThresholdFeatureCollection();
        ThresholdFeature mockFeature = new ThresholdFeature();
        mockFeature.setId("123");
        mockFeatureCollection.addFeaturesItem(mockFeature);
        mockResponse.setQueriedLocation(mockFeatureCollection);

        when(api.getThreshold(lon, lat, null, null, null, null)).thenReturn(mockResponse);
        when(api.getThreshold(null, null, minLon, maxLon, minLat, maxLat)).thenReturn(mockResponse);

        ThresholdResponseModel response = api.getThreshold(lon, lat, null, null, null, null);
        assertEquals("123", response.getQueriedLocation().getFeatures().get(0).getId());

        response = api.getThreshold(null, null, minLon, maxLon, minLat, maxLat);
        assertEquals("123", response.getQueriedLocation().getFeatures().get(0).getId());
    }

}
