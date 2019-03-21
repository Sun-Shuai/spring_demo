package com.suns.A5_traditionaldependencymethod;


public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        email.setTitle("Hello");
        email.setBody("This email contains an enclosure.");
        Enclosure enclosure = new Enclosure();
        enclosure.setFilename("file001.mp3");
        enclosure.setContent("lalala...");
        email.setEnclosure(enclosure);
        System.out.println(email.toString());


    }
}
