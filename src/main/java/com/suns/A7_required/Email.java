package com.suns.A7_required;

import org.springframework.beans.factory.annotation.Required;

public class Email {
    private String title;
    private String body;

    public String getTitle() {
        return title;
    }

    @Required
    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    @Required
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Email{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
