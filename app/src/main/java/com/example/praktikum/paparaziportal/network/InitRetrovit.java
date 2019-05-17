package com.example.praktikum.paparaziportal.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InitRetrovit {
    // URL Server API
    public static String API_URL = "http://apptesterarmawan.000webhostapp.com/api/";

    public static Retrofit setInit() {
        return new Retrofit.Builder().baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServices getInstance() {
        return setInit().create(ApiServices.class);
    }
    public static ApiServices getAPIService() {
        return RetrofitClient.getClient(API_URL).create(ApiServices.class);
    }


}
