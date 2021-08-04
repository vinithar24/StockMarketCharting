package com.stockmarket.stockexchange;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockExchangeService {
    private StockExchangeRepository stockExchangeRepository;

    public StockExchangeService(StockExchangeRepository stockExchangeRepository) {
        this.stockExchangeRepository = stockExchangeRepository;
    }
    public List<StockExchange> getAllStockExchanges()
    {
        return (List<StockExchange>) stockExchangeRepository.findAll();
    }
    public StockExchange getStockExchange(String id)
    {
        Optional<StockExchange> stockExchange=stockExchangeRepository.findById(id);
        return stockExchange.isPresent() ? stockExchange.get() : null;
    }
    public StockExchange addStockExchange(StockExchange stockExchange)
    {
        StockExchange newStockExchange=stockExchangeRepository.save(stockExchange);
        return newStockExchange;
    }
    public void deleteStockExchange(String id)
    {
        stockExchangeRepository.deleteById(id);

    }
    public StockExchange editStockExchange(StockExchange stockExchange)
    {

        StockExchange savedStockExchange=stockExchangeRepository.save(stockExchange);
        return savedStockExchange;

    }
}


