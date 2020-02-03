package com.twu.biblioteca;

public class Book extends Item{
    private String author;

    public Book(String name, String author, int year) {
        super(name, year, true);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
