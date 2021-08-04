package com.stockmarket.stockexchange;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockExchangeRepository extends JpaRepository<StockExchange,String> {
}