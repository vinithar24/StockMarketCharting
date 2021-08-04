package com.stockmarket.stockexchange;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/stockexchange")

public class StockExchangeController {
    private StockExchangeService stockExchangeService;

    public StockExchangeController(StockExchangeService stockExchangeService) {
        this.stockExchangeService = stockExchangeService;
    }
    @GetMapping()
    public List<StockExchange> listStockExchange(){
        return stockExchangeService.getAllStockExchanges();
    }
    @GetMapping("/{id}")
    public StockExchange getStockExchange(@PathVariable String id)
    {
        return stockExchangeService.getStockExchange(id);
    }
    @PostMapping()
    public StockExchange addStockExchange(@RequestBody StockExchange stockExchange)
    {
        return stockExchangeService.addStockExchange(stockExchange);
    }
    @PutMapping()
    public StockExchange editStockExchange(@RequestBody StockExchange stockExchange)
    {
        return stockExchangeService.editStockExchange(stockExchange);
    }
    @DeleteMapping("/{id}")
    public void deleteStockExchange(@PathVariable String id)
    {
         stockExchangeService.deleteStockExchange(id);
    }
}
