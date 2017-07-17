package com.example.command;

public class PaintCircleCommand implements Command {

    private final Receiver receiver;

    public PaintCircleCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.paintCircle();
    }
}
