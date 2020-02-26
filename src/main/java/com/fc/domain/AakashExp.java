package com.fc.domain;

public class AakashExp {

    private final long id;
    private final String content;

    public AakashExp(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
