package com.example.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("State 1");
        originator.setState("State 2");
        Memento memento = originator.saveToMemento();
        originator.setState("State 3");
        originator.restoreFromMemento(memento);

    }
}
