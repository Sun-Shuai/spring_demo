package com.suns.A4_inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Email email = (Email) applicationContext.getBean("email3");
        System.out.println(email.toString());

        Email email1 = (Email) applicationContext.getBean("email4");
        System.out.println(email1.toString());

    }
}
