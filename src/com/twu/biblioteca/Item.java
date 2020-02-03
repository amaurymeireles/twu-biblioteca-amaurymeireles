package com.twu.biblioteca;

public abstract class Item {
    private String name;
    private int year;
    private boolean available;

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

    public void checkout(){this.available = false;}

    public void checkin(){this.available = true;}
}
