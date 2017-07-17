package com.example.chainofresponsibility;

public abstract class AbstractHandler {

    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler handler) {
        this.nextHandler = handler;
    }

    public abstract String handle(String input);
}
