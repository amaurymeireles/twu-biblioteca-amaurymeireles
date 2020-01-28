package com.twu.biblioteca;

public class Book {
    private String name, author;
    private int year;
    private boolean available;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable(){return available;}

    public void checkout(){this.available = false;}

}
