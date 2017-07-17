package com.example.adapterjdk;

import java.util.*;

import static java.util.Collections.checkedList;

public class Client {

    public static void main(String[] args) {
        List<String> list = getStrings();

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static List getStrings() {
        List list = checkedList(new ArrayList<>(), String.class);
        list.add("ala");
        list.add(Integer.MAX_VALUE);
        return list;
    }


}
