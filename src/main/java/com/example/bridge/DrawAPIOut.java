package com.example.bridge;

public class DrawAPIOut implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Draw circle: [" + x + ", " + y + "] r=" + radius);
    }
}
