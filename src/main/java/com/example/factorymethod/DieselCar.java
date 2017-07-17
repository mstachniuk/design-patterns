package com.example.factorymethod;

public class DieselCar extends Car {
    @Override
    protected Engine createEngine() {
        return new DieselEngine();
    }
}
