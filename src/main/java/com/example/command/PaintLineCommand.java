package com.example.command;

public class PaintLineCommand implements Command {

    private final Receiver receiver;

    public PaintLineCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.paintLine();
    }
}
