package com.suns.A3_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Email email = (Email) applicationContext.getBean("email2");
        email.setBody("I am obj0");
        System.out.println(email.toString());

        Email email1 = (Email) applicationContext.getBean("email2");
        System.out.println(email1.toString());
    }
}
