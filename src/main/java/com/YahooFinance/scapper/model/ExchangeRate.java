package com.YahooFinance.scapper.model;

import com.YahooFinance.scapper.helper.*;
public class ExchangeRate {
    private Long id;

    public String fromCurrency;
    public String toCurrency;
    public Period period;
    public Double openRate;
    public Double closeRate;
    ExchangeRate(String fromCurrency,String toCurrency, String period){
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.period = setPeriod(period);
    }
    String getFromDate(){
        this.period.g
        return "";
    }
    Period setPeriod(String period){
        DateUtils obj = new DateUtils();
        return obj.extractPeriod(period);
    }

}
