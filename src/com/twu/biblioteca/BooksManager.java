package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BooksManager {
    ArrayList<Book> booksList = new ArrayList<Book>();

    BooksManager(boolean createDefaultBooksList){
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



}
