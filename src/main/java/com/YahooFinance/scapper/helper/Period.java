package com.YahooFinance.scapper.helper;

public class Period {
    public String fromDate;
    public String toDate;

    public Period(String from_date, String to_date) {
        this.fromDate = from_date;
        this.toDate = to_date;
    }

    @Override
    public String toString() {
        return "from: " + fromDate + " To: " + toDate;
    }

}