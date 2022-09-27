package com.example.bookfirebase;

public class Book {

    private String name;
    private int page;
    private String url;

    public Book(){
    }

    public Book(String name, int page, String url) {
        this.name = name;
        this.page = page;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
