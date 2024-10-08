package com.YahooFinance.scapper.model;

import com.YahooFinance.scapper.helper.*;
public class ExchangeRate {
    private Long id;

    public String fromCurrency;
    public String toCurrency;
    public String period;
    private Period timePeriod;
    public Double openRate;
    public Double closeRate;
    ExchangeRate(String fromCurrency,String toCurrency, String Period){
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }
    Period setPeriod(String period){

    }

}
