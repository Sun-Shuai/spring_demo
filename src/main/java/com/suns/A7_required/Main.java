package com.suns.A7_required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Email email = (Email) applicationContext.getBean("email6");
        System.out.println(email.toString());


    }
}
