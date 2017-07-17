package com.example.adapterobject;

import java.util.Optional;

public interface StackNew {
    void push(Optional<String> element);
    Optional<String> pop();
}
