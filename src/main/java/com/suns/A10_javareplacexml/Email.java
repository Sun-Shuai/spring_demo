package com.suns.A10_javareplacexml;

import org.springframework.beans.factory.annotation.Autowired;

public class Email {
    private String title;
    private String body;
    @Autowired
    private Enclosure2 enclosure2;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    @Override
    public String toString() {
        return "Email{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", enclosure2=" + enclosure2 +
                '}';
    }
}
