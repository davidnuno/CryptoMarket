package com.davidnuno.cryptomarket.data;

import com.davidnuno.cryptomarket.Currency;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {

    @Headers({"X-CoinAPI-Key : 260A94F7-621D-400C-B0C5-C0C56F6CCD85"})
    @GET("/v1/assets")
    Call<List<Currency>> getAllAssets();

    @Headers({"X-CoinAPI-Key : 260A94F7-621D-400C-B0C5-C0C56F6CCD85"})
    @GET("/v1/exchangerate/")
    Call<Currency> getCurrencyRate(@Query("asset_id_base") String assetIdBase,
                                   @Query("asset_id_quote") String assetIdQuote);
}
