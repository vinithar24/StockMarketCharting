package com.stockmarketchart.importexcel;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/stockprice")
public class StockPriceController {
    private StockPriceService stockPriceService;

    public StockPriceController(StockPriceService stockPriceService) {
        this.stockPriceService = stockPriceService;
    }
    @GetMapping()
    public List<StockPrice> listStockPrice(){
        return stockPriceService.getAllStockPrice();
    }
    @GetMapping("/{id}")
    public StockPrice getStockPrice(@PathVariable int id)
    {
        return stockPriceService.getStockPrice(id);
    }
    @PostMapping()
    public List<StockPrice> addStockPrice(@RequestBody List<StockPrice> stockPrice)
    {
        return stockPriceService.addStockPrice(stockPrice);
    }
    @PutMapping()
    public StockPrice editCompany(@RequestBody StockPrice stockPrice)
    {
        return stockPriceService.editStockPrice(stockPrice);
    }
    @DeleteMapping("/{id}")
    public String deleteStockPrice(@PathVariable int id)
    {
        return stockPriceService.deleteStockPrice(id);
    }
}
