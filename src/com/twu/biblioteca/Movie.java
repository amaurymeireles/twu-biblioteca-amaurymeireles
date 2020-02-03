package com.twu.biblioteca;

public class Movie extends Item {
    public String director;
    public double rating;
    public boolean hasRating;

    Movie(String name, String director, int year){
        super(name, year, true);
        this.director = director;
        hasRating = false;
    }

    Movie(String name, String director, int year, double rating){
        super(name, year, true);
        this.director = director;
        this.rating = rating;
        hasRating = true;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public boolean isRated() {
        return hasRating;
    }
}
