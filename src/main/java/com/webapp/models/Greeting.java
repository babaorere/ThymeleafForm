package com.webapp.models;

public class Greeting {

    private Integer id;
    private String content;

    public Greeting() {
        this(0, "");
    }

    public Greeting(final Integer id, final String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getId() {
        return this.id;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

}