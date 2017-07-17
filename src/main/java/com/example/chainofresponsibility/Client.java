package com.example.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        SimpleHandler english = new SimpleHandler("How are you?", "I'm fine thank you.");
        SimpleHandler polish = new SimpleHandler("Jak się masz?", "Dobrze dziękuję.");
        SimpleHandler german = new SimpleHandler("Wie geht's?", "Alles gut, danke.");

        english.setNextHandler(polish);
        polish.setNextHandler(german);

        System.out.println(english.handle("Jak się masz?"));
        System.out.println(english.handle("Wie geht's?"));
        System.out.println(english.handle("How are you?"));
        System.out.println(english.handle("Hello World!"));
    }
}
