package com.example.cryptocurrencyx.API;

import com.example.cryptocurrencyx.Model.CryptoClass;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Muzaffer Atmaca on 13.12.2020.
 */
public interface CryptoDataAccessObject {

    @GET("v1/cryptocurrency/listings/historical")
    Call<CryptoClass> everyPrices();




}
