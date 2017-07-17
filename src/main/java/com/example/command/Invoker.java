package com.example.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Named also: Caller, odbiorca
 */
public class Invoker {

    private final List<Command> history = new ArrayList<>();

    public void saveAndExecute(Command command) {
        history.add(command);
        command.execute();
    }

    public void printHistory() {
        for (Command command : history) {
            System.out.println(command.getClass().getName());
        }
    }
}
