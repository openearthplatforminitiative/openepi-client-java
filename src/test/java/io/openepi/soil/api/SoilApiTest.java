package io.openepi.soil.api;

import java.math.BigDecimal;
import io.openepi.common.ApiException;
import io.openepi.soil.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * API tests for SoilApi
 */
public class SoilApiTest {

    @Mock
    private SoilApi api = new SoilApi();

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getSoilPropertyPropertyGetTest() throws ApiException {
        BigDecimal lon = new BigDecimal(9.58);
        BigDecimal lat = new BigDecimal(60.1);
        List<SoilDepthLabels> depths = Arrays.asList(SoilDepthLabels._0_5CM);
        List<SoilPropertiesCodes> properties = Arrays.asList(SoilPropertiesCodes.BDOD);
        List<SoilPropertyValueTypes> values = Arrays.asList(SoilPropertyValueTypes.Q0_5);

        SoilPropertyJSON mockResponse = new SoilPropertyJSON();
        SoilLayerList layerList = new SoilLayerList();
        SoilLayer layer = new SoilLayer();
        layer.setCode(SoilPropertiesCodes.BDOD);
        layerList.addLayersItem(layer);
        mockResponse.setProperties(layerList);

        when(api.getSoilPropertyPropertyGet(lon, lat, depths, properties, values)).thenReturn(mockResponse);

        SoilPropertyJSON response = api.getSoilPropertyPropertyGet(lon, lat, depths, properties, values);
        assertEquals(SoilPropertiesCodes.BDOD, response.getProperties().getLayers().get(0).getCode());
    }


    @Test
    public void getSoilTypeSummaryTypeSummaryGetTest() throws ApiException {
        BigDecimal minLon = new BigDecimal("9.5");
        BigDecimal maxLon = new BigDecimal("9.6");
        BigDecimal minLat = new BigDecimal("60.1");
        BigDecimal maxLat = new BigDecimal("60.12");

        SoilTypeSummaryJSON mockResponse = new SoilTypeSummaryJSON();
        SoilTypeSummaryInfo type = new SoilTypeSummaryInfo();
        SoilTypeSummary summary = new SoilTypeSummary();
        summary.setSoilType(SoilTypes.ALBELUVISOLS);
        type.addSummariesItem(summary);
        mockResponse.setProperties(type);

        when(api.getSoilTypeSummaryTypeSummaryGet(minLon, maxLon, minLat, maxLat)).thenReturn(mockResponse);

        SoilTypeSummaryJSON response = api.getSoilTypeSummaryTypeSummaryGet(minLon, maxLon, minLat, maxLat);
        assertEquals(SoilTypes.ALBELUVISOLS, response.getProperties().getSummaries().get(0).getSoilType());
    }


    @Test
    public void getSoilTypeTypeGetTest() throws ApiException {
        BigDecimal lon = new BigDecimal("9.58");
        BigDecimal lat = new BigDecimal("60.1");

        SoilTypeJSON mockResponse = new SoilTypeJSON();
        SoilTypeInfo type = new SoilTypeInfo();
        type.setMostProbableSoilType(SoilTypes.ALBELUVISOLS);
        mockResponse.setProperties(type);

        when(api.getSoilTypeTypeGet(lon, lat, null)).thenReturn(mockResponse);
        SoilTypeJSON response = api.getSoilTypeTypeGet(lon, lat, null);

        assertEquals(SoilTypes.ALBELUVISOLS, response.getProperties().getMostProbableSoilType());
    }

}
