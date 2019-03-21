package com.suns.A9_autowired_attribute;

import org.springframework.beans.factory.annotation.Autowired;

public class Email {
    private String title;
    private String body;
    @Autowired
    private Enclosure1 enclosure1;

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
                ", enclosure1=" + enclosure1 +
                '}';
    }
}
