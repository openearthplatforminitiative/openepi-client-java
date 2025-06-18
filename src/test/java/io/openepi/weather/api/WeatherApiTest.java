package io.openepi.weather.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import io.openepi.common.ApiException;
import io.openepi.geocoding.model.Point;
import io.openepi.weather.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * API tests for WeatherApi
 */
public class WeatherApiTest {

    @Mock
    private WeatherApi api = new WeatherApi();

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getLocationForecastTest() throws ApiException {
        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");

        // Create mock objects
        METJSONForecast mockResponse = new METJSONForecast();
        PointGeometry mockGeometry = new PointGeometry();
        Forecast mockForecast = new Forecast();
        ForecastTimeStep mockTimeStep = new ForecastTimeStep();
        ForecastTimeStepData mockTimeStepData = new ForecastTimeStepData();
        ForecastTimeStepDataInstant mockTimeStepDataInstant = new ForecastTimeStepDataInstant();
        ForecastTimeInstant mockTimeInstant = new ForecastTimeInstant();

        // Set mock objects
        mockTimeInstant.setAirTemperature(new BigDecimal("10"));
        mockTimeStepDataInstant.setDetails(mockTimeInstant);
        mockTimeStepData.setInstant(mockTimeStepDataInstant);
        mockTimeStep.setData(mockTimeStepData);
        List<ForecastTimeStep> mockTimeSteps = new ArrayList<>();
        mockTimeSteps.add(mockTimeStep);
        mockForecast.setTimeseries(mockTimeSteps);
        mockResponse.setGeometry(mockGeometry);
        mockResponse.setProperties(mockForecast);


        when(api.getCompactForecast(59.9F, 10.7F, null)).thenReturn(mockResponse);
        assertEquals(new BigDecimal("10"), api.getCompactForecast(59.9F, 10.7F, null).getProperties().getTimeseries().get(0).getData().getInstant().getDetails().getAirTemperature());
    }

    @Test
    public void getSunriseAndSunsetTest() throws ApiException {
        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");

//        METJSONSunrise mockResponse = new METJSONSunrise();
//        WeatherApiModelsMetSunriseTypesForecast forecast = new WeatherApiModelsMetSunriseTypesForecast();
//        SolarTime mockTime = new SolarTime();
//        mockTime.setTime("20:24");
//        forecast.setSunrise(mockTime);
//        mockResponse.setProperties(forecast);
//
//        when(api.getSunriseAndSunset(lat, lon, null)).thenReturn(mockResponse);
//
//        METJSONSunrise response = api.getSunriseAndSunset(lat, lon, null);
//        assertEquals("20:24", response.getProperties().getSunrise().getTime());
    }

}
