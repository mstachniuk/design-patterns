package com.example.strategy;

import java.math.BigDecimal;

public interface Strategy {
    BigDecimal calculateTax(BigDecimal price);
}
