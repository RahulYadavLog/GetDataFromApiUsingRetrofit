package com.example.daboyatask.model;

public class UserModel {
    String author;
    String download_url;

    public UserModel(String author, String url) {
        this.author = author;
        this.download_url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return download_url;
    }

    public void setUrl(String url) {
        this.download_url = url;
    }
}
