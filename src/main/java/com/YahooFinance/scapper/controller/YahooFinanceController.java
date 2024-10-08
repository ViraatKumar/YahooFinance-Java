package com.YahooFinance.scapper.controller;

import com.YahooFinance.scapper.model.ExchangeRate;
import com.YahooFinance.scapper.service.YahooFinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class YahooFinanceController {

    @Autowired
    private YahooFinanceService yahooFinanceService;

    // POST request to scrape Yahoo Finance and save exchange rate data
    @PostMapping("/forex-data")
    public ExchangeRate scrapeForexData(
            @RequestParam String fromCurrency,
            @RequestParam String toCurrency,
            @RequestParam String period) {
        return yahooFinanceService.scrapeAndSave(fromCurrency, toCurrency, period);
    }

    // GET request to retrieve all saved exchange rate data
    @GetMapping("/forex-data")
    public List<ExchangeRate> getAllExchangeRates() {
        return yahooFinanceService.getAllExchangeRates();
    }
}