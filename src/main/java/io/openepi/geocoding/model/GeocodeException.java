package io.openepi.geocoding.model;

public class GeocodeException extends RuntimeException {
    public GeocodeException(Throwable cause) {
        super(cause);
    }

    public GeocodeException(String message) {
        super(message);
    }
}
