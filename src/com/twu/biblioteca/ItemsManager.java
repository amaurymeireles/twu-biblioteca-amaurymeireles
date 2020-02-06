package com.twu.biblioteca;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Movie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ItemsManager {
    private ArrayList<Book> booksList;
    private ArrayList<Movie> moviesList;

    ItemsManager(boolean createDefaultList){
        booksList = new ArrayList<Book>();
        moviesList = new ArrayList<Movie>();
        if(createDefaultList){
            createDefaultBookList();
            createDefaultMovieList();
        }
    }

    private void createDefaultBookList (){
        booksList.add(new Book("1984", "George", 1949));
        booksList.add(new Book("Animal Farm","George", 1945));
        booksList.add(new Book("It", "King", 1986));
        booksList.add(new Book("Pet Sematary", "King", 1983));
        booksList.add(new Book("Dagon", "Lovecraft", 1916));
    }

    private void createDefaultMovieList (){
        moviesList.add(new Movie("Kill Bill", "Tarantino", 2004, 7.58));
        moviesList.add(new Movie("Spirited Away", "Miyazaki", 2003, 10));
        moviesList.add(new Movie("Birdemic", "James Nguyen", 2010, 1.9));

    }

    public ArrayList<Book> getBooksList(){
        return booksList;
    }

    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }

    public ArrayList<Book> getAvailableBookList() {
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        booksList.forEach(book -> {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        });
        return availableBooks;
    }

    public ArrayList<Movie> getAvailableMovieList() {
        ArrayList<Movie> availableMovies= new ArrayList<Movie>();
        moviesList.forEach(movie -> {
            if (movie.isAvailable()) {
                availableMovies.add(movie);
            }
        });
        return availableMovies;
    }

    public ArrayList<Book> getCheckInList(){
        ArrayList<Book> unavailableBooks = new ArrayList<Book>();
        booksList.forEach(book -> {
            if(!book.isAvailable()) {
                unavailableBooks.add(book);
            }
        });
        return unavailableBooks;

    }

}
