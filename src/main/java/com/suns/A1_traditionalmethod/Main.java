package com.suns.A1_traditionalmethod;

public class Main {
    public static void main(String[] args){
        Email email = new Email();
        email.setTitle("apply for a job");
        email.setBody("Hello, I want a job.");
        System.out.println(email.toString());
    }
}
