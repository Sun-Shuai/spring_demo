package com.suns.A2_springhelloworld;

public class Email {
    private String title;
    private String body;

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
                '}';
    }
}
