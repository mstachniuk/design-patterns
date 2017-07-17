package com.example.adapterobject;

import java.util.Optional;

public class Client {

    public static void main(String[] args) {
        StackNew stack = new StackAdapter();
        stack.push(Optional.of("lala"));
        Optional<String> pop = stack.pop();
    }
}
