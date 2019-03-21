package com.suns.A5_traditionaldependencymethod;

public class Enclosure {
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
        return "Enclosure{" +
                "filename='" + filename + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
