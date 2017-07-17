package com.example.state;

public class Context {

    private State state = new NiceState();

    public void say() {
        String text = state.saySomething();
        System.out.println(text);
        changeState();
    }

    private void changeState() {
        if(state instanceof NiceState) {
            state = new DelayedState();
        } else if(state instanceof DelayedState) {
            state = new TiredState();
        } else {
            state = new NiceState();
        }
    }
}
