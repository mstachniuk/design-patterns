package com.example.chainofresponsibility;

public class SimpleHandler extends AbstractHandler {

    private String questions;
    private String answer;

    public SimpleHandler(String questions, String answer) {
        this.questions = questions;
        this.answer = answer;
    }

    @Override
    public String handle(String input) {
        if(input.equals(questions)) {
            return answer;
        }
        if(nextHandler != null) {
            return nextHandler.handle(input);
        }
        return null;
    }
}
