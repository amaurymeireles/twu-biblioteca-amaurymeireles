package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ItemsManager {
    private ArrayList<Book> booksList;

    ItemsManager(boolean createDefaultBooksList){
        booksList = new ArrayList<Book>();
        if(createDefaultBooksList){
            booksList.add(new Book("1984", "George", 1949));
            booksList.add(new Book("Animal Farm","George", 1945));
            booksList.add(new Book("It", "King", 1986));
            booksList.add(new Book("Pet Sematary", "King", 1983));
            booksList.add(new Book("Dagon", "Lovecraft", 1916));
        }
    }

    public ArrayList<Book> getBooksList(){
        return booksList;
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
