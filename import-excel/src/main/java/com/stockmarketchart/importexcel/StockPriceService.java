package com.stockmarketchart.importexcel;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StockPriceService {
    private StockPriceRepository stockPriceRepository;

    public StockPriceService(StockPriceRepository stockPriceRepository) {
        this.stockPriceRepository = stockPriceRepository;
    }
    public List<StockPrice> getAllStockPrice()
    {
        return (List<StockPrice>) stockPriceRepository.findAll();
    }
    public StockPrice getStockPrice(int id)
    {
        Optional<StockPrice> stockPrice=stockPriceRepository.findById(id);
        return stockPrice.isPresent() ? stockPrice.get() : null;
    }
    public List<StockPrice> addStockPrice(List<StockPrice> stockPrice)
    {
        List<StockPrice> newStockPrice=stockPriceRepository.saveAll(stockPrice);
        return newStockPrice;
    }
    public String deleteStockPrice(int id)
    {
        stockPriceRepository.deleteById(id);
        return "Stock Price Deleted";
    }
    public StockPrice editStockPrice(StockPrice stockPrice)
    {

        StockPrice savedStockPrice=stockPriceRepository.save(stockPrice);
        return savedStockPrice;

    }
}
