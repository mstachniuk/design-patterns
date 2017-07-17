package com.example.proxy;

public class ProxyImage implements Image {

    private Image image;

    @Override
    public String getImage() {
        if(image == null) {
            image = new Image4K();
        }
        return image.getImage();
    }

    @Override
    public String getMiniature() {
        return "Miniature from Proxy";
    }
}
