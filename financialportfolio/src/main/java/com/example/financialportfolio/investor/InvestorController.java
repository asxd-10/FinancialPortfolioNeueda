package com.example.financialportfolio.investor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class InvestorController {
    @Autowired
    private InvestorRepository investorRep;

    @GetMapping("investors")
    public List<Investor> getEmployees() {
        return investorRep.findAll();
    }

//    @PostMapping("person")
//    public void addEmployee(@RequestBody Person person) {
//        personRepository.save(person);
//    }
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
