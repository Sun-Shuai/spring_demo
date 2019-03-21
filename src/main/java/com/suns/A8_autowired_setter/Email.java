package com.suns.A8_autowired_setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Email {
    private String title;
    private String body;
    private Enclosure0 enclosure0;

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

    public Enclosure0 getEnclosure0() {
        return enclosure0;
    }

    @Autowired
    public void setEnclosure0(Enclosure0 enclosure0) {
        this.enclosure0 = enclosure0;
    }

    @Override
    public String toString() {
        return "Email{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", enclosure0=" + enclosure0 +
                '}';
    }
}
