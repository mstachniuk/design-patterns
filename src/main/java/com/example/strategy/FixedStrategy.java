package com.example.strategy;

import java.math.BigDecimal;

public class FixedStrategy implements Strategy {
    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return price.multiply(new BigDecimal("0.23"));
    }
}
