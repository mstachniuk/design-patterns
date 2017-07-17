package com.example.strategy;

import java.math.BigDecimal;

public class ProgressiveTax implements Strategy {
    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        if(price.compareTo(new BigDecimal("500")) < 0) {
            return price.multiply(new BigDecimal("0.15"));
        }
        return price.multiply(new BigDecimal("0.4"));
    }
}
