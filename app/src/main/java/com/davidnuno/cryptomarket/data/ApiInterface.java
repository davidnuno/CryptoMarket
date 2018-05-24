package com.davidnuno.cryptomarket.data;

import com.davidnuno.cryptomarket.Currency;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/v1/assets")
    Call<List<Currency>> getAssets();
}
