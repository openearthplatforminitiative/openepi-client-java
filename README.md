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
    <version>0.1</version>
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

### Crop Health
```java
import io.openepi.client.CropHealthApi;
import io.openepi.client.ApiException;
import io.openepi.crop_health.model.BinaryPredictionResponse;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        CropHealthApi api = new CropHealthApi();
        try {
            File file = new File("path/to/file");
            BinaryPredictionResponse response = api.predictionsWithBinary(file);
            System.out.println(response.getHLT());
        } catch (ApiException e) {
            System.err.println("Exception when calling CropHealthApi#getCropHealth");
            e.printStackTrace();
        }
    }
}
```

### Deforestation

```java
import io.openepi.common.ApiException;
import io.openepi.deforestation.api.DeforestationApi;
import io.openepi.deforestation.model.DeforestationBasinGeoJSON;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        DeforestationApi api = new DeforestationApi();
        try {
            BigDecimal lon = new BigDecimal("30.06");
            BigDecimal lat = BigDecimal.valueOf(-1.94);
            DeforestationBasinGeoJSON response = api.getLossyearBasinSinglePoint(lon, lat);
            System.out.println(response.getFeatures());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeforestationApi#lossyearBasinGet");
            e.printStackTrace();
        }
    }
}
```

### Flood

```java
import io.openepi.flood.api.FloodApi;
import io.openepi.flood.model.SummaryResponseModel;
import io.openepi.common.ApiException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FloodApi api = new FloodApi();
        try {
            BigDecimal lon = new BigDecimal("33.57");
            BigDecimal lat = BigDecimal.valueOf(-1.37);
            SummaryResponseModel response = api.getForecastSummarySinglePoint(lon, lat, false);
            System.out.println(response.getQueriedLocation().getFeatures());
        } catch (ApiException e) {
            System.err.println("Exception when calling FloodApi#getFlood");
            e.printStackTrace();
        }
    }
}
```

### Geocoding

```java
import io.openepi.geocoding.api.GeocodingApi;
import io.openepi.geocoding.model.FeatureCollection;
import io.openepi.common.ApiException;

public class Main {
    public static void main(String[] args) {
        GeocodingApi api = new GeocodingApi();
        try {
            FeatureCollection response = api.getGeocoding("Rwanda");
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeocodingApi#getGeocoding");
            e.printStackTrace();
        }
    }
}

```

### Soil

```java
import io.openepi.soil.api.SoilApi;
import io.openepi.soil.model.SoilTypeJSON;
import io.openepi.common.ApiException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal lon = new BigDecimal("9.58");
        BigDecimal lat = new BigDecimal("60.1");
        SoilApi api = new SoilApi();
        try {
            SoilTypeJSON response = api.getSoilType(lon, lat, null);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling SoilApi#getSoil");
            e.printStackTrace();
        }
    }
}

```

### Weather

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



## Generation
Most of this library is generated using `openapi-generator`: https://github.com/OpenAPITools/openapi-generator

The generator generates a lot of the same code for each API. This library therefore transfers the repeating code to the
`common` package.

Generation should be done in a separate folder, and files that are relevant should be copied into this project:
```bash
openapi-generator generate -i https://api-test.openepi.io/crop-health/openapi.json -g java -o ./crop-health
openapi-generator generate -i https://api-test.openepi.io/deforestation/openapi.json -g java -o ./deforestation
openapi-generator generate -i https://api-test.openepi.io/flood/openapi.json -g java -o ./flood
openapi-generator generate -i https://api-test.openepi.io/soil/openapi.json -g java -o ./soil
openapi-generator generate -i https://api-test.openepi.io/weather/openapi.json -g java -o ./weather
```

There is a special case for the geocoding api. When the api generates its openapi spec, it generates with `anyOf` and 
`prefixItems`, which `openapi-generator` does not support.
 
The following commands downloads and replaces the part that makes `openapi-generator` crash.
```bash
curl -O https://api-test.openepi.io/geocoding/openapi.json
jq '.components.schemas.Properties.properties.extent = {
    "type": "array",
    "maxItems": 4,
    "minItems": 4,
    "title": "Extent",
    "description": "The bounding box formatted as (min latitude, max latitude, min longitude, max longitude)"
}' openapi.json > formatted.json
openapi-generator generate -i ./formatted.json -g java -o ./geocoding
```



