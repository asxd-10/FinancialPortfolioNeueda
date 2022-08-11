package com.example.financialportfolio.investor;

import com.example.financialportfolio.stock.Stock;
import com.example.financialportfolio.stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InvestorController {
    @Autowired
    private InvestorRepository investorRep;

    @Autowired
    private StockRepository stockRep;

    @GetMapping("stock-check/{id}")
    public Stock getStock(@PathVariable long id) {
        return stockRep.findById(id).orElse(null);
    }

    @GetMapping("investors")
    public List<Investor> getInvestors() {
        return investorRep.findAll();
    }

    @PostMapping("BuyOrder")
    public void addFixedInvestor() {
        Investor i1 = new Investor(new Stock("AXINK", 240,290,220),400, 237, 255);
        i1.computeProfitOrLoss();
        investorRep.save(i1);
    }

    @PostMapping("buyOrder")
    public void addInvestor(@RequestParam long stock_id, @RequestParam double quantity,
                            @RequestParam double buying_price, @RequestParam double selling_price) {
        Investor i1 = new Investor(stockRep.findById(stock_id).orElse(null), quantity, buying_price, selling_price);
        i1.computeProfitOrLoss();
        investorRep.save(i1);
    }

    @PostMapping("simplePost")
    public void addInvestorExplicit(@RequestParam String symbol, @RequestParam double openv, @RequestParam double high, @RequestParam double low, @RequestParam double quantity,
                                     @RequestParam double buying_price, @RequestParam double selling_price) {
        Investor i1 = new Investor(new Stock(symbol, openv, high, low), quantity, buying_price, selling_price);
        i1.computeProfitOrLoss();
        investorRep.save(i1);
    }
//
    @DeleteMapping("deleteRecord")
    public void deleteInvestor(@RequestParam long id) {
        investorRep.deleteById(id);
    }

    @DeleteMapping("AllInvestors")
    public void deleteAllInvestors() {
        investorRep.deleteAll();
    }
}
