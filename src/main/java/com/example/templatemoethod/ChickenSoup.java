package com.example.templatemoethod;

public class ChickenSoup extends AbstractSoup {
    @Override
    protected void cleanUp() {
        System.out.println("Cleaning everything");
    }

    @Override
    protected void cookIngredients() {
        System.out.println("Cook chicken");
    }

    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing chicken");
    }
}
