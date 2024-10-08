package com.YahooFinance.scapper.repository;

import com.YahooFinance.scapper.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
}
