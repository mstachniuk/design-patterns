package com.example.abstractfactory;

public class RedGiantStarFactory extends StarFactory {

    @Override
    public Star createStar() {
        return new RedGiantStar();
    }
}
