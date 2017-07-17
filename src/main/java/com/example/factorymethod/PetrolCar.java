package com.example.factorymethod;

public class PetrolCar extends Car {
    @Override
    protected Engine createEngine() {
        return new PetrolEngine();
    }
}
