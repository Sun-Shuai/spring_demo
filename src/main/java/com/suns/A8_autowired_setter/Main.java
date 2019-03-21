package com.suns.A8_autowired_setter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Email email = (Email) applicationContext.getBean("email7");
        System.out.println(email.toString());


    }
}
