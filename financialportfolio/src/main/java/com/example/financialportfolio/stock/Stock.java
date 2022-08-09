package com.example.financialportfolio.stock;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Stock {
    @GeneratedValue
    @Id
    private int id;
    private String symbol;
    private String name;
    private double open, close, high, low, ltp, change, percent_change, volume, turnover, week_high_52;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getLtp() {
        return ltp;
    }

    public void setLtp(double ltp) {
        this.ltp = ltp;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getPercent_change() {
        return percent_change;
    }

    public void setPercent_change(double percent_change) {
        this.percent_change = percent_change;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public double getWeek_high_52() {
        return week_high_52;
    }

    public void setWeek_high_52(double week_high_52) {
        this.week_high_52 = week_high_52;
    }
}
