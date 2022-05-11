package com.example.cryptocurrencyx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cryptocurrencyx.API.CryptoDataAccessObject;
import com.example.cryptocurrencyx.API.RetrofitClient;
import com.example.cryptocurrencyx.Model.CryptoClass;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    CryptoDataAccessObject cryptoDataAccessObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cryptoDataAccessObject = RetrofitClient.getAPi().create(CryptoDataAccessObject.class);
    }

    public void getPrices(){

        Call<CryptoClass> cryptoClassCall = cryptoDataAccessObject.everyPrices();

    }


}