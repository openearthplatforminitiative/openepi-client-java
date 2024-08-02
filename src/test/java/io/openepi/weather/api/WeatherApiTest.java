package io.openepi.weather.api;

import java.math.BigDecimal;
import io.openepi.common.ApiException;
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
    public void getForecastLocationforecastGetTest() throws ApiException {
        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");

        METJSONForecast mockResponse = new METJSONForecast();
        WeatherApiModelsMetWeatherTypesForecast forecast = new WeatherApiModelsMetWeatherTypesForecast();
        ForecastTimeStep forecastTimeStep = new ForecastTimeStep();
        Data mockData = new Data();
        Instant mockInstant = new Instant();
        ForecastTimeInstant forecastTimeInstant = new ForecastTimeInstant();
        forecastTimeInstant.setAirPressureAtSeaLevel(new BigDecimal("10"));
        mockInstant.setDetails(forecastTimeInstant);
        mockData.setInstant(mockInstant);
        forecastTimeStep.setData(mockData);
        forecast.addTimeseriesItem(forecastTimeStep);
        mockResponse.setProperties(forecast);

        when(api.getForecastLocationforecastGet(lat, lon, null)).thenReturn(mockResponse);

        METJSONForecast response = api.getForecastLocationforecastGet(lat, lon, null);
        assertEquals(new BigDecimal("10"), response.getProperties().getTimeseries().get(0).getData().getInstant().getDetails().getAirPressureAtSeaLevel());

    }

    @Test
    public void getSunriseSunriseGetTest() throws ApiException {
        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");

        METJSONSunrise mockResponse = new METJSONSunrise();
        WeatherApiModelsMetSunriseTypesForecast forecast = new WeatherApiModelsMetSunriseTypesForecast();
        SolarTime mockTime = new SolarTime();
        mockTime.setTime("20:24");
        forecast.setSunrise(mockTime);
        mockResponse.setProperties(forecast);

        when(api.getSunriseSunriseGet(lat, lon, null)).thenReturn(mockResponse);

        METJSONSunrise response = api.getSunriseSunriseGet(lat, lon, null);
        assertEquals("20:24", response.getProperties().getSunrise().getTime());
    }

}
