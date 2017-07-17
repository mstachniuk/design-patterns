package com.example.bridge;

public class CircleShape extends Shape {

    private final double x;
    private final double y;
    private final double radius;

    public CircleShape(DrawingAPI drawingAPI, double x, double y, double radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void drawResize(double percentage) {
        drawingAPI.drawCircle(x,y, radius + radius * percentage / 100.0);
    }
}
