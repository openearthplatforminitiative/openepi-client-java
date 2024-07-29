# openepi-client-java
A java client for accessing data from OpenEPI.


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
