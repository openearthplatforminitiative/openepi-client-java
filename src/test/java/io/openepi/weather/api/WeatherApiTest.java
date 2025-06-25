package io.openepi.weather.api;

import java.math.BigDecimal;

import io.openepi.weather.model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherApiTest {

    private MockWebServer mockWebServer;
    private WeatherApi weatherApi;

    @BeforeEach
    public void setUp() throws Exception {
        mockWebServer = new MockWebServer();
        mockWebServer.start();

        // Set the base URL to the mock server's URL
        String baseUrl = mockWebServer.url("/").toString();
        weatherApi = new WeatherApi();
        weatherApi.setCustomBaseUrl(baseUrl);
    }

    @AfterEach
    public void tearDown() throws Exception {
        mockWebServer.shutdown();
    }

    @Test
    public void testGetCompactForecast() throws Exception {
        mockWebServer.enqueue(new MockResponse()
                .setBody(mockResponse())
                .setResponseCode(200));

        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");
        METJSONForecast forecast = weatherApi.getCompactForecast(lat, lon, null);

        assertEquals(new BigDecimal("10.0"), forecast.getProperties().getTimeseries().get(0).getData().getInstant().getDetails().getAirTemperature());
    }

    /**
     * Creates a mocked response for the "complete" endpoint on MET location forecast api
     *
     * @return Formatted mock response
     */
    private String mockResponse() {
        return "{"
                + "\"geometry\": {"
                + "  \"coordinates\": [60.5, 11.59, 1001],"
                + "  \"type\": \"Point\""
                + "},"
                + "\"properties\": {"
                + "  \"meta\": {"
                + "    \"units\": {"
                + "      \"air_pressure_at_sea_level\": \"hPa\","
                + "      \"air_temperature\": \"C\","
                + "      \"air_temperature_max\": \"C\","
                + "      \"air_temperature_min\": \"C\","
                + "      \"cloud_area_fraction\": \"%\","
                + "      \"cloud_area_fraction_high\": \"%\","
                + "      \"cloud_area_fraction_low\": \"%\","
                + "      \"cloud_area_fraction_medium\": \"%\","
                + "      \"dew_point_temperature\": \"C\","
                + "      \"fog_area_fraction\": \"%\","
                + "      \"precipitation_amount\": \"mm\","
                + "      \"precipitation_amount_max\": \"mm\","
                + "      \"precipitation_amount_min\": \"mm\","
                + "      \"probability_of_precipitation\": \"%\","
                + "      \"probability_of_thunder\": \"%\","
                + "      \"relative_humidity\": \"%\","
                + "      \"ultraviolet_index_clear_sky_max\": \"1\","
                + "      \"wind_from_direction\": \"degrees\","
                + "      \"wind_speed\": \"m/s\","
                + "      \"wind_speed_of_gust\": \"m/s\""
                + "    },"
                + "    \"updated_at\": \"2019-12-03T13:52:13Z\""
                + "  },"
                + "  \"timeseries\": ["
                + "    {"
                + "      \"data\": {"
                + "        \"instant\": {"
                + "          \"details\": {"
                + "            \"air_pressure_at_sea_level\": 1017.23,"
                + "            \"air_temperature\": 10.0,"
                + "            \"cloud_area_fraction\": 95.2,"
                + "            \"cloud_area_fraction_high\": 95.2,"
                + "            \"cloud_area_fraction_low\": 95.2,"
                + "            \"cloud_area_fraction_medium\": 95.2,"
                + "            \"dew_point_temperature\": 8.1,"
                + "            \"fog_area_fraction\": 95.2,"
                + "            \"relative_humidity\": 81.1,"
                + "            \"wind_from_direction\": 121.3,"
                + "            \"wind_speed\": 5.9,"
                + "            \"wind_speed_of_gust\": 15.9"
                + "          }"
                + "        },"
                + "        \"next_12_hours\": {"
                + "          \"details\": {"
                + "            \"air_temperature_max\": 17.1,"
                + "            \"air_temperature_min\": 11.1,"
                + "            \"precipitation_amount\": 1.71,"
                + "            \"precipitation_amount_max\": 4.32,"
                + "            \"precipitation_amount_min\": 4.32,"
                + "            \"probability_of_precipitation\": 37,"
                + "            \"probability_of_thunder\": 54.32,"
                + "            \"ultraviolet_index_clear_sky_max\": 1"
                + "          },"
                + "          \"summary\": {"
                + "            \"symbol_code\": \"clearsky_day\""
                + "          }"
                + "        },"
                + "        \"next_1_hours\": {"
                + "          \"details\": {"
                + "            \"air_temperature_max\": 17.1,"
                + "            \"air_temperature_min\": 11.1,"
                + "            \"precipitation_amount\": 1.71,"
                + "            \"precipitation_amount_max\": 4.32,"
                + "            \"precipitation_amount_min\": 4.32,"
                + "            \"probability_of_precipitation\": 37,"
                + "            \"probability_of_thunder\": 54.32,"
                + "            \"ultraviolet_index_clear_sky_max\": 1"
                + "          },"
                + "          \"summary\": {"
                + "            \"symbol_code\": \"clearsky_day\""
                + "          }"
                + "        },"
                + "        \"next_6_hours\": {"
                + "          \"details\": {"
                + "            \"air_temperature_max\": 17.1,"
                + "            \"air_temperature_min\": 11.1,"
                + "            \"precipitation_amount\": 1.71,"
                + "            \"precipitation_amount_max\": 4.32,"
                + "            \"precipitation_amount_min\": 4.32,"
                + "            \"probability_of_precipitation\": 37,"
                + "            \"probability_of_thunder\": 54.32,"
                + "            \"ultraviolet_index_clear_sky_max\": 1"
                + "          },"
                + "          \"summary\": {"
                + "            \"symbol_code\": \"clearsky_day\""
                + "          }"
                + "        }"
                + "      },"
                + "      \"time\": \"2019-12-03T14:00:00Z\""
                + "    }"
                + "  ]"
                + "},"
                + "\"type\": \"Feature\""
                + "}";
    }
}
