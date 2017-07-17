package com.example.abstractfactory;

public class RegularStarFactory extends StarFactory {

    @Override
    public Star createStar() {
        return new RegularStar();
    }
}
