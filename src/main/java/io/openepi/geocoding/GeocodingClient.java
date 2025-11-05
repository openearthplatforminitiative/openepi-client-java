package io.openepi.geocoding;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.openepi.geocoding.model.FeatureCollection;
import io.openepi.geocoding.model.GeocodeException;
import io.openepi.geocoding.model.Geometry;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class GeocodingClient {
    private final String scheme = "https";
    private final String host = "photon.komoot.io";
    private final OkHttpClient httpClient;
    private static final Gson gson = new GsonBuilder().registerTypeAdapter(Geometry.class, new GeometryDeserializer()).create();

    public GeocodingClient() {
        this.httpClient = new OkHttpClient();
    }

    public FeatureCollection geocode(String query) {
        try (Response response = this.httpClient.newCall(buildGeocodeRequest(query)).execute()) {
            return handleResponse(response);
        } catch (IOException e) {
            throw new GeocodeException(e);
        }
    }

    public CompletableFuture<FeatureCollection> geocodeAsync(String query) {
        CompletableFuture<FeatureCollection> future = new CompletableFuture<>();
        this.httpClient.newCall(buildGeocodeRequest(query)).enqueue(handleCallback(future));

        return future;
    }

    public FeatureCollection reverse(double lat, double lon, Integer limit, String lang) {
        try (Response response = this.httpClient.newCall(buildReverseRequest(lat, lon, limit, lang)).execute()) {
            return handleResponse(response);
        } catch (IOException e) {
            throw new GeocodeException(e);
        }
    }

    public FeatureCollection reverse(double lat, double lon) {
        return reverse(lat, lon, null, null);
    }

    public FeatureCollection reverse(double lat, double lon, Integer limit) {
        return reverse(lat, lon, limit, null);
    }

    public CompletableFuture<FeatureCollection> reverseAsync(double lat, double lon, Integer limit, String lang) {
        CompletableFuture<FeatureCollection> future = new CompletableFuture<>();
        this.httpClient.newCall(buildReverseRequest(lat, lon, limit, lang)).enqueue(handleCallback(future));

        return future;
    }

    public CompletableFuture<FeatureCollection> reverseAsync(double lat, double lon, Integer limit) {
        return reverseAsync(lat, lon, limit, null);
    }

    public CompletableFuture<FeatureCollection> reverseAsync(double lat, double lon) {
        return reverseAsync(lat, lon, null, null);
    }

    @NotNull
    private Callback handleCallback(CompletableFuture<FeatureCollection> future) {
        return new Callback() {

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                future.complete(handleResponse(response));
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new GeocodeException(e));
            }
        };
    }

    private FeatureCollection handleResponse(Response response) {
        try {
            if (!response.isSuccessful()) {
                throw new GeocodeException("Request failed: " + response);
            }
            ResponseBody body = response.body();
            if (body == null) {
                throw new GeocodeException("Response body is null: " + response);
            }

            return gson.fromJson(body.string(), FeatureCollection.class);
        } catch (IOException e) {
            throw new GeocodeException(e);
        }
    }

    private Request buildGeocodeRequest(String query) {
        HttpUrl url = new HttpUrl.Builder()
                .scheme(scheme)
                .host(host)
                .addPathSegment("api")
                .addQueryParameter("q", query)
                .build();

        return new Request.Builder()
                .url(url)
                .build();
    }

    private Request buildReverseRequest(double lat, double lon, Integer limit, String lang) {
        HttpUrl.Builder builder = new HttpUrl.Builder()
                .scheme(scheme)
                .host(host)
                .addPathSegment("reverse")
                .addQueryParameter("lat", String.valueOf(lat))
                .addQueryParameter("lon", String.valueOf(lon));

        if (lang != null && !lang.isEmpty())
            builder.addQueryParameter("lang", lang);

        if (limit != null)
            builder.addQueryParameter("limit", String.valueOf(limit));

        return new Request.Builder().url(builder.build()).build();
    }
}
