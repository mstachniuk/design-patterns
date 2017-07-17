package com.example.adapterclass;

import java.util.Optional;

public class StackAdapter extends StackOld implements StackNew {
    @Override
    public void push(Optional<String> element) {
        element.ifPresent(elem -> addHead(elem));
    }

    @Override
    public Optional<String> pop() {
        return Optional.ofNullable(getHead());
    }
}
