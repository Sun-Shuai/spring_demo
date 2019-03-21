package com.suns.A6_dependencyinjection;

public class Email {
    private String title;
    private String body;
    private Enclosure enclosure;

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

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    @Override
    public String toString() {
        return "Email{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", enclosure=" + enclosure +
                '}';
    }
}
