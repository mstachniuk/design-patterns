package com.example.adapterobjecttask;

import java.util.Arrays;
import java.util.Set;

public class Client {

    public static void main(String[] args) {
        Set<String> set = new SetAdapter();
        set.add("abc");
        set.add("abc");
        set.add("def");
        set.addAll(Arrays.asList("abc", "def", "ghi"));
        for (String s : set) {
            System.out.println(s);
        }
    }
}
