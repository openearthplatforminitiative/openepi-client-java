package io.openepi.crop_health.api;

import io.openepi.common.ApiException;
import io.openepi.crop_health.model.BinaryPredictionResponse;
import io.openepi.crop_health.model.MultiHLTPredictionResponse;
import io.openepi.crop_health.model.Ping200Response;
import io.openepi.crop_health.model.SingleHLTPredictionResponse;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * API tests for DefaultApi
 */
public class CropHealthApiTest {

    @Mock
    private CropHealthApi api = new CropHealthApi();

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void pingTest() throws ApiException {
        Ping200Response mockResponse = new Ping200Response();
        mockResponse.setStatus("Healthy");
        when(api.ping()).thenReturn(mockResponse);

        Ping200Response response = api.ping();
        assertEquals("Healthy", response.getStatus());
    }

    @Test
    public void predictionsWithBinaryTest() throws ApiException {
        BinaryPredictionResponse mockResponse = new BinaryPredictionResponse();
        mockResponse.setHLT(new BigDecimal("0.5"));
        File body = mock(File.class);
        when(api.predictionsWithBinary(body)).thenReturn(mockResponse);

        BinaryPredictionResponse response = api.predictionsWithBinary(body);
        assertEquals(new BigDecimal("0.5"), response.getHLT());
    }

    @Test
    public void predictionsWithMultiHLTTest() throws ApiException {
        MultiHLTPredictionResponse mockResponse = new MultiHLTPredictionResponse();
        mockResponse.setAlSBeans(new BigDecimal("0.5"));
        mockResponse.setAnTCocoa(new BigDecimal("0.5"));
        File body = mock(File.class);
        when(api.predictionsWithMultiHLT(body)).thenReturn(mockResponse);

        MultiHLTPredictionResponse response = api.predictionsWithMultiHLT(body);
        assertEquals(new BigDecimal("0.5"), response.getAlSBeans());
        assertEquals(new BigDecimal("0.5"), response.getAnTCocoa());
    }

    @Test
    public void predictionsWithSingleHLTTest() throws ApiException {
        SingleHLTPredictionResponse mockResponse = new SingleHLTPredictionResponse();
        mockResponse.setHLT(new BigDecimal("0.5"));
        mockResponse.setALS(new BigDecimal("0.5"));
        File body = mock(File.class);
        when(api.predictionsWithSingleHLT(body)).thenReturn(mockResponse);

        SingleHLTPredictionResponse response = api.predictionsWithSingleHLT(body);
        assertEquals(new BigDecimal("0.5"), response.getHLT());
        assertEquals(new BigDecimal("0.5"), response.getALS());
    }

}
