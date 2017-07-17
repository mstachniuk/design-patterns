package com.example.factorymethod;

public abstract class Car {
    private Engine engine;

    public Car() {
        engine = createEngine();
    }

    protected abstract Engine createEngine();
}
