package com.example.templatemoethod;

public abstract class AbstractSoup {

    public void cook() {
        prepareIngredients();
        cookIngredients();
        cleanUp();
    }

    protected abstract void cleanUp();

    protected abstract void cookIngredients();

    protected abstract void prepareIngredients();
}
