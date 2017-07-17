package com.example.proxy;

public class Client2 {

    public static void main(String[] args) {
        Image img = new ProxyImage();

        System.out.println(img.getMiniature());
        System.out.println(img.getImage());
    }

}
