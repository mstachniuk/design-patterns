package com.example.state;

public class TiredState implements State {

    @Override
    public String saySomething() {
        return "I'm sorry, I'm tired";
    }
}
