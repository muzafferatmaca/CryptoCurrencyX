package com.example.cryptocurrencyx.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Muzaffer Atmaca on 13.12.2020.
 */
public class RetrofitClient {

    public static final String BASE_URL="https://pro-api.coinmarketcap.com/";
    public static final String KEY="ef968836-bc56-4898-887d-89ab98583f88";

    private static Retrofit retrofitClient = null;

    public static Retrofit getAPi(){

        if (retrofitClient==null){

            retrofitClient = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofitClient;

    }

}
