package com.example.abstractfactory;

public class Client {

    public static void main(String[] args) {
        StarFactory factory = new RegularStarFactory();
        Star star = factory.createStar();
        System.out.println(star.getClass().getName());

        StarFactory factory2 = new RedGiantStarFactory();
        Star star2 = factory2.createStar();
        System.out.println(star2.getClass().getName());
    }
}
