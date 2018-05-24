package com.davidnuno.cryptomarket;

public class WatchItem {

    private String name;
    private Currency currency1;
    private Currency currency2;

    public double rateChange;

    public WatchItem(String name, Currency currency1, Currency currency2) {

        this.name = name;
        this.currency1 = currency1;
        this.currency2 = currency2;
    }

    public Currency getCurrency1() {
        return currency1;
    }

    public void setCurrency1(Currency currency1) {
        this.currency1 = currency1;
    }

    public Currency getCurrency2() {
        return currency2;
    }

    public void setCurrency2(Currency currency2) {
        this.currency2 = currency2;
    }

    public double getRateChange() {
        return rateChange;
    }

    public void setRateChange(double rateChange) {
        this.rateChange = rateChange;
    }
}
