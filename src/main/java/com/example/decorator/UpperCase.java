package com.example.decorator;

public class UpperCase implements Text {

    Text text;

    public UpperCase(Text text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text.getText().toUpperCase();
    }
}
