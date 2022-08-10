package com.example.financialportfolio.investor;

import com.example.financialportfolio.stock.Stock;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
public class Investor {
    @Id
    @GeneratedValue(
            strategy =  GenerationType.IDENTITY
    )
    private long id;
    @ManyToOne(cascade = CascadeType.ALL )
//    @JoinColumn(name = "stock_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Stock stock;
    private double quantity, buying_price, selling_price, p_or_l;

    public Investor(){}

    public Investor(Stock stock, double quantity, double buying_price, double selling_price) {
        this.stock = stock;
        this.quantity = quantity;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getBuying_price() {
        return buying_price;
    }

    public void setBuying_price(double buying_price) {
        this.buying_price = buying_price;
    }

    public double getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

    public double getP_or_l() {
        return p_or_l;
    }

    public void setP_or_l(double p_or_l) {
        this.p_or_l = p_or_l;
    }
}
