package com.example.command;

/**
 * Also called: Nadawca
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        invoker.saveAndExecute(new PaintLineCommand(receiver));
        invoker.saveAndExecute(new PaintCircleCommand(receiver));
        invoker.saveAndExecute(new PaintLineCommand(receiver));

        invoker.printHistory();
    }

}
