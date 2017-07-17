package com.example.adapterclass;

import java.util.Optional;

public class Client {

    public static void main(String[] args) {
        StackNew stack = new StackAdapter();
        stack.push(Optional.of("lala"));
        Optional<String> pop = stack.pop();
        pop.ifPresent(s -> System.out.println("get " + s));
        String text = pop.orElse("default");
        System.out.println("or else: " + text);
    }
}
