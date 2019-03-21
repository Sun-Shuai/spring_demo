package com.suns.A9_autowired_attribute;


public class Enclosure1 {
    private String filename;
    private String content;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Enclosure1{" +
                "filename='" + filename + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
