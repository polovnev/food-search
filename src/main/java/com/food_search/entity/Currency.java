package com.food_search.entity;

public enum Currency {

    UAH("₴");

    private String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
