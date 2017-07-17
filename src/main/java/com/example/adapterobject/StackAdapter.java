package com.example.adapterobject;

import java.util.Optional;

public class StackAdapter implements StackNew {

    private StackOld adapted = new StackOld();

    @Override
    public void push(Optional<String> element) {
        element.ifPresent(elem -> adapted.addHead(elem));
    }

    @Override
    public Optional<String> pop() {
        return Optional.ofNullable(adapted.getHead());
    }
}
