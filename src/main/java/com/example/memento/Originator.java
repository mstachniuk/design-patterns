package com.example.memento;

/**
 * Twórca, założyciel
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Current state: " + state);
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        setState(memento.getSavedState());
    }
}
