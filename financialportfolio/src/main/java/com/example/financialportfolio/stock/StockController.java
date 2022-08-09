package com.example.financialportfolio.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StockController {
    @Autowired
    private StockRepository stockRep;

    @GetMapping("stocks")
    public List<Stock> getStocks() {
        return stockRep.findAll();
    }

    @GetMapping("stockByID")
    public Optional<Stock> getEmployeeByID(@RequestBody long id) {
        return stockRep.findById(id);

    }
}
