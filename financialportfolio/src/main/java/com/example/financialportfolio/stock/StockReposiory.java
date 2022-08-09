package com.example.financialportfolio.stock;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StockReposiory extends CrudRepository<Stock, Long>{
    List<Stock> findAll();
}
