package io.openepi.weather.api;

import java.math.BigDecimal;

import io.openepi.weather.model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SunriseApiTest {
    private MockWebServer mockWebServer;
    private SunriseApi sunriseApi;

    @BeforeEach
    public void setUp() throws Exception {
        mockWebServer = new MockWebServer();
        mockWebServer.start();

        String baseUrl = mockWebServer.url("/").toString();
        sunriseApi = new SunriseApi();
        sunriseApi.setCustomBaseUrl(baseUrl);
    }

    @AfterEach
    public void tearDown() throws Exception {
        mockWebServer.shutdown();
    }

    @Test
    public void getSunriseAndSunsetTest() throws Exception {
        mockWebServer.enqueue(new MockResponse()
                .setBody(mockResponse())
                .setResponseCode(200));

        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");
        METJSONSunrise sunrise = sunriseApi.getSunriseAndSunset(lat, lon, null, null);

        assertEquals(new BigDecimal("66.07"), sunrise.getProperties().getSunrise().getAzimuth());
    }

    /**
     * Creates a mocked response for the sun endpoint on MET sunrise forecast api
     * @return Formatted mock response
     */
    private String mockResponse() {
        return "{"
        + "\"copyright\": \"MET Norway\","
        + "\"licenseURL\": \"https://api.met.no/license_data.html\","
        + "\"type\": \"Feature\","
        + "\"geometry\": {"
        + "  \"type\": \"Point\","
        + "  \"coordinates\": [10, 10]"
        + "},"
        + "\"when\": {"
        + "  \"interval\": ["
        + "    \"2025-06-24T23:20:00Z\","
        + "    \"2025-06-25T23:22:00Z\""
        + "  ]"
        + "},"
        + "\"properties\": {"
        + "  \"body\": \"Sun\","
        + "  \"sunrise\": {"
        + "    \"time\": \"2025-06-25T05:01+00:00\","
        + "    \"azimuth\": 66.07"
        + "  },"
        + "  \"sunset\": {"
        + "    \"time\": \"2025-06-25T17:43+00:00\","
        + "    \"azimuth\": 293.91"
        + "  },"
        + "  \"solarnoon\": {"
        + "    \"time\": \"2025-06-25T11:22+00:00\","
        + "    \"disc_centre_elevation\": 76.63,"
        + "    \"visible\": true"
        + "  },"
        + "  \"solarmidnight\": {"
        + "    \"time\": \"2025-06-24T23:22+00:00\","
        + "    \"disc_centre_elevation\": -56.61,"
        + "    \"visible\": false"
        + "  }"
        + "}"
        + "}";
    }
}
