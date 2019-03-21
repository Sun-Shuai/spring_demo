package com.suns.A10_javareplacexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Email email(){
        Email email = new Email();
        email.setTitle("hello");
        email.setBody("hi");

        return email;
    }

    @Bean
    public Enclosure2 enclosure2(){
        Enclosure2 enclosure2 = new Enclosure2();
        enclosure2.setFilename("001.mp4");
        enclosure2.setContent("lalala...");
        return enclosure2;
    }
}
