package com.example.strategy;

import java.math.BigDecimal;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculateWholePrice(BigDecimal price) {
        return price.add(strategy.calculateTax(price));
    }
}
