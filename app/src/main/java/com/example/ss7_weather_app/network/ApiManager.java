package com.example.ss7_weather_app.network;

import com.example.ss7_weather_app.model.Weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL = "http://dataservice.accuweather.com";

    @GET("/forecasts/v1/hourly/12hour/353412?apikey=dXZyAzBDln0eEl5RGraDkclAFer2zUzk&language=vi-vn&metric=true")
    Call<List<Weather>> getHour();

    @GET("/forecasts/v1/daily/5day/353412?apikey=dXZyAzBDln0eEl5RGraDkclAFer2zUzk&language=vi-vn&metric=true")
    Call<List<Weather>> getDay();
}
