package com.example.financialportfolio.investor;

import com.example.financialportfolio.stock.Stock;

import javax.persistence.Id;

public class Investor {
    @Id
    private Stock stock;
    private double quantity, buying_price, selling_price, p_or_l;

    public Investor(Stock stock, double quantity, double buying_price, double selling_price) {
        this.stock = stock;
        this.quantity = quantity;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
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
