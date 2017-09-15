package com.quickenloans.ocularproject.utils;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SolutionEngineApiUtils {

    public static Retrofit initRetrofit() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.addInterceptor(logging);
        httpClientBuilder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                HttpUrl originalUrl = chain.request().url();
                String query = originalUrl.encodedQuery();
                if (query == null) {
                    return chain.proceed(chain.request());
                } else {
                    Request.Builder builder = chain.request().newBuilder();
                    builder.url(originalUrl.newBuilder()
                            .encodedQuery(query.replace("&PurchasePrice", "PurchasePrice"))
                            .build());
                    return chain.proceed(builder.build());
                }
            }
        });

        httpClientBuilder.connectTimeout(60, TimeUnit.SECONDS);
        httpClientBuilder.readTimeout(60, TimeUnit.SECONDS);
        httpClientBuilder.writeTimeout(60, TimeUnit.SECONDS);

        return new Retrofit.Builder()
                .baseUrl("https://servicesbeta.quickenloans.com/solutionengine/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(httpClientBuilder.build())
                .build();
    }
}
