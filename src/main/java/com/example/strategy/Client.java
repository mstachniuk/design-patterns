package com.example.strategy;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new FixedStrategy());

        System.out.println(context.calculateWholePrice(new BigDecimal("100")));
        System.out.println(context.calculateWholePrice(new BigDecimal("1000")));

        context.setStrategy(new ProgressiveTax());
        System.out.println(context.calculateWholePrice(new BigDecimal("100")));
        System.out.println(context.calculateWholePrice(new BigDecimal("1000")));
    }
}
