package com.example.decorator;

public class HtmlText implements Text {

    private Text text;

    public HtmlText(Text text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return addHtmlToText(text.getText());
    }

    private String addHtmlToText(String text) {
        return "<p>" + text + "</p>";
    }
}
