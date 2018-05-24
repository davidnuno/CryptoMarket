package com.davidnuno.cryptomarket;

import com.google.gson.annotations.SerializedName;

public class Currency {

    /**
     * Asset identifier. Superset of the ISO 4217 currency codes standard.
     */
    @SerializedName("asset_id")
    public String assetId;

    @SerializedName("name")
    public String name;

    /**
     * First trade price inside period range.
     */
    @SerializedName("price_open")
    public double priceOpen;

    /**
     * Last trade price inside period range.
     */
    @SerializedName("price_close")
    public double priceClose;

    /**
     * Boolean value; true for cryptocurrency assets, false otherwise.
     */
    @SerializedName("type_is_crypto")
    public boolean isCyrpto;
}
