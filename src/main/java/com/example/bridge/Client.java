package com.example.bridge;

public class Client {

    public static void main(String[] args) {
        DrawingAPI api = new DrawAPIOut();
        Shape circle = new CircleShape(api, 1, 2, 3);
        circle.draw();
        circle.drawResize(50);
    }
}
