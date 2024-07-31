package io.openepi.deforestation.api;

import io.openepi.common.ApiException;
import io.openepi.deforestation.model.BasinProperties;
import io.openepi.deforestation.model.DeforestationBasinFeature;
import io.openepi.deforestation.model.DeforestationBasinGeoJSON;
import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * API tests for DeforestationApi
 */
public class DeforestationApiTest {

    @Mock
    private DeforestationApi api = new DeforestationApi();

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void lossyearBasinGetTest() throws ApiException {
        BigDecimal lon = new BigDecimal("30.06");
        BigDecimal lat = BigDecimal.valueOf(-1.94);
        BigDecimal minLon = new BigDecimal("28.85");
        BigDecimal minLat = BigDecimal.valueOf(-2.84);
        BigDecimal maxLon = new BigDecimal("30.90");
        BigDecimal maxLat = BigDecimal.valueOf(-1.04);

        DeforestationBasinGeoJSON mockResponse = new DeforestationBasinGeoJSON();

        BasinProperties basinProperties = new BasinProperties();
        basinProperties.setStartYear(2001);

        DeforestationBasinFeature mockFeature = new DeforestationBasinFeature();
        mockFeature.setProperties(basinProperties);
        ArrayList<DeforestationBasinFeature> features = new ArrayList<>();
        features.add(mockFeature);
        mockResponse.setFeatures(features);

        when(api.lossyearBasinGet(lon, lat, null, null, null, null, null, null)).thenReturn(mockResponse);
        when(api.lossyearBasinGet(null, null, minLon, minLat, maxLon, maxLat, null, null)).thenReturn(mockResponse);

        DeforestationBasinGeoJSON response = api.lossyearBasinGet(lon, lat, null, null, null, null, null, null);
        assertEquals(response.getFeatures().get(0).getProperties().getStartYear(), 2001);

        response = api.lossyearBasinGet(null, null, minLon, minLat, maxLon, maxLat, null, null);
        assertEquals(2001, response.getFeatures().get(0).getProperties().getStartYear());
    }

}
