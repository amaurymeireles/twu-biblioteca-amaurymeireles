package com.twu.biblioteca;

public abstract class Item {
    private String name;
    private int year;
    private boolean available;
    User user;

    public Item(String name, int year, boolean available) {
        this.name = name;
        this.year = year;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkout(User user){
        this.available = false;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void checkin(){this.available = true;}
}
