# openepi-client-java
A java client for accessing data from OpenEPI.


## Installation
You can find the library on Maven Central here: https://central.sonatype.com/artifact/io.openepi/openepi-client

### Maven
Add the following to your `pom.xml`:
```xml
<dependency>
    <groupId>io.openepi</groupId>
    <artifactId>openepi-client</artifactId>
    <version>2.0.0</version>
</dependency>
```

### Gradle
Add the following to your `build.gradle`:
```groovy
implementation 'io.openepi:openepi-client-java:0.1'
```
or with the Kotlin DSL:
```kotlin
implementation("io.openepi:openepi-client-java:0.1")
```

## Supported Java environments
Works on Java 8 (and higher)

## Examples

### Geocoding

```java
import io.openepi.geocoding.GeocodingClient;
import io.openepi.geocoding.model.FeatureCollection;

public class Main {
    public static void main(String[] args) {
        GeocodingClient client = new GeocodingClient();
        try {
            FeatureCollection response = client.geocode("Rwanda");
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeocodingClient#geocode");
            e.printStackTrace();
        }
    }
}

```



### Weather

#### Forecast
```java
import io.openepi.weather.api.WeatherApi;
import io.openepi.weather.model.METJSONForecast;
import io.openepi.common.ApiException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");

        WeatherApi api = new WeatherApi();
        try {
            METJSONForecast response = api.getLocationForecast(lat, lon, null);
            System.out.println(response.getProperties().getTimeseries().get(0).getData().getInstant().getDetails());
        } catch (ApiException e) {
            System.err.println("Exception when calling WeatherApi#getWeather");
            e.printStackTrace();
        }
    }
}
```

#### Sunrise and sunset

```java
import io.openepi.weather.api.SunriseApi;
import io.openepi.weather.model.METJSONSunrise;
import io.openepi.common.ApiException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal lat = new BigDecimal("52.52");
        BigDecimal lon = new BigDecimal("13.40");

        SunriseApi api = new SunriseApi();
        try {
            METJSONSunrise response = api.getSunriseAndSunset(lat, lon, null, null);
            System.out.println(response.getProperties().getSunrise().getTime());
            System.out.println(response.getProperties().getSunset().getTime());
        } catch (ApiException e) {
            System.err.println("Exception when calling SunriseApi#getSunriseAndSunset");
            e.printStackTrace();
        }
    }
}
```


## Generation
Most of this library is generated using `openapi-generator`: https://github.com/OpenAPITools/openapi-generator

The generator generates a lot of the same code for each API. This library therefore transfers the repeating code to the
`common` package.

Generation should be done in a separate folder, and files that are relevant should be copied and adapted into this project:
```bash
openapi-generator generate -i https://api.met.no/weatherapi/locationforecast/2.0/swagger -g java -o ./weather
openapi-generator generate -i https://api.met.no/weatherapi/sunrise/3.0/swagger -g java -o ./sunrise
```
 
The following commands downloads and replaces the part that makes `openapi-generator` crash.
```bash
curl -O https://api.openepi.io/geocoding/openapi.weatherJson
jq '.components.schemas.Properties.properties.extent = {
    "type": "array",
    "maxItems": 4,
    "minItems": 4,
    "title": "Extent",
    "description": "The bounding box formatted as (min latitude, max latitude, min longitude, max longitude)"
}' openapi.weatherJson > formatted.weatherJson
openapi-generator generate -i ./formatted.weatherJson -g java -o ./geocoding
```



