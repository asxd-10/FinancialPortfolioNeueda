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

    @GetMapping("investors")
    public List<Investor> getInvestors() {
        return investorRep.findAll();
    }

    @GetMapping("stock-check/{id}")
    public Stock getStock(@PathVariable long id) {
        return stockRep.findById(id).orElse(null);
    }

    @PostMapping("BuyOrder")
    public void addFixedInvestor() {
        Investor i1 = new Investor(new Stock("AXINK", 240,290,220),400, 237, 255);
        investorRep.save(i1);

    }

    @PostMapping("buyOrder")
    public void addInvestor(@RequestBody long stock_id, @RequestBody double quantity,
                            @RequestBody double buying_price, @RequestBody double selling_price) {
        Investor i1 = new Investor(stockRep.findById(stock_id).orElse(null), quantity, buying_price, selling_price);
        investorRep.save(i1);
    }
//
//    @DeleteMapping("person")
//    public void deleteEmployee(@RequestBody long id) {
//        personRepository.deleteById(id);
//    }
//
//    @GetMapping("personByID/{id}")
//    public Optional<Person> getEmployeeByID(@PathVariable long id) {
//        return personRepository.findById(id);
//    }
//
    @DeleteMapping("AllInvestors")
    public void deleteAllInvestors() {
        investorRep.deleteAll();
    }
}
