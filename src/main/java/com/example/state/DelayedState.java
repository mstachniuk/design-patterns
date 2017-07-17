package com.example.state;

public class DelayedState implements State {
    @Override
    public String saySomething() {
        return "I'm delayed, I need to go!";
    }
}
