package com.YahooFinance.scapper.service;

import com.YahooFinance.scapper.model.ExchangeRate;
import com.YahooFinance.scapper.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class YahooFinanceService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;
    public ExchangeRate scrapeAndSave(String fromCurrency, String toCurrency, String period) {
        // Example URL for Yahoo Finance scraping (URL construction can be dynamic)
        String quote = fromCurrency+toCurrency+"%3DX";
        Period
        String url = String.format("https://finance.yahoo.com/quote/%s/history?period1=UNIX_TIMESTAMP&period2=UNIX_TIMESTAMP",quote);
//        String url = String.format(
//                "https://finance.yahoo.com/quote/%s%s=X/history?period1=UNIX_TIMESTAMP&period2=UNIX_TIMESTAMP",
//                fromCurrency, toCurrency);

        // Make HTTP request to Yahoo Finance
        String response = restTemplate.getForObject(url, String.class);

        // Here, you would parse the response (e.g., using Jsoup or similar) and extract
        // required data
        ExchangeRate exchangeRate = new ExchangeRate();
//        exchangeRate.setFromCurrency(fromCurrency);
//        exchangeRate.setToCurrency(toCurrency);
//        exchangeRate.setPeriod(period);
//        exchangeRate.setDate("2024-01-01");
//        exchangeRate.setOpenRate(73.50);
//        exchangeRate.setCloseRate(73.90);

        // Save the scraped data into the database
        return exchangeRateRepository.save(exchangeRate);
    }

    public List<ExchangeRate> getAllExchangeRates() {
        return exchangeRateRepository.findAll();
    }
}
