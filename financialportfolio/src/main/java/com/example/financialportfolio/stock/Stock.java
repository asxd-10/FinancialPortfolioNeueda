package com.example.financialportfolio.stock;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

@Entity
public class Stock {
    @Id
    @GeneratedValue(
            strategy =  GenerationType.IDENTITY
    )

    private long id;
    private String Symbol;
    private double openv, high, low, ltp, changes, percent_change, volume, turnover, week_high_52,
            week_low_52, annual_pct_change, monthly_pct_change;

    public Stock(String symbol, double openv, double high, double low) {
        this.Symbol=symbol;
        this.openv=openv;
        this.high=high;
        this.low=low;

    }

    public Stock(){}

    public double getWeek_low_52() {
        return week_low_52;
    }

    public void setWeek_low_52(double week_low_52) {
        this.week_low_52 = week_low_52;
    }

    public double getAnnual_pct_change() {
        return annual_pct_change;
    }

    public void setAnnual_pct_change(double annual_pct_change) {
        this.annual_pct_change = annual_pct_change;
    }

    public double getMonthly_pct_change() {
        return monthly_pct_change;
    }

    public void setMonthly_pct_change(double monthly_pct_change) {
        this.monthly_pct_change = monthly_pct_change;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        this.Symbol = symbol;
    }

    public double getOpen() {
        return openv;
    }

    public void setOpen(double openv) {
        this.openv = openv;
    }

//    public double getClose() {
//        return close;
//    }
//
//    public void setClose(double close) {
//        this.close = close;
//    }

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
        return changes;
    }

    public void setChange(double changes) {
        this.changes = changes;
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
