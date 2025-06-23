package io.openepi.weather.api;

import io.openepi.common.ApiException;
import io.openepi.weather.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SunriseApiTest {
    @Mock
    private SunriseApi api = new SunriseApi();

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void getSunriseAndSunsetTest() throws ApiException {
        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");


        METJSONSunrise mockResponse = new METJSONSunrise();
        SunriseForecast mockForecast = new SunriseForecast();
        SolarTime mockSolarTime = new SolarTime();
        OffsetDateTime time = OffsetDateTime.parse("2025-06-23T02:43+00:00");
        mockSolarTime.setTime(time);

        mockForecast.setSunrise(mockSolarTime);
        mockResponse.setProperties(mockForecast);

        when(api.getSunriseAndSunset(lat, lon, null, null)).thenReturn(mockResponse);
        METJSONSunrise response = api.getSunriseAndSunset(lat, lon, null, null);
        assertEquals(time, response.getProperties().getSunrise().getTime());

    }
}
