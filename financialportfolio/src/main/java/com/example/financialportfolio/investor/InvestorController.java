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


    @PostMapping("BuyOrder")
    public void addEmployee(@RequestBody long stock_id, @RequestBody double quantity,
                            @RequestBody double buyPrice, @RequestBody double sellPrice) {
        investorRep.save(new Investor(stockRep.findById(stock_id), quantity, buyPrice, sellPrice));
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
//    @DeleteMapping("AllPersons")
//    public void deleteEmployees() {
//        personRepository.deleteAll();
//    }
}
