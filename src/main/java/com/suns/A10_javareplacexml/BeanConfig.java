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
}
