package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BooksManager {
    ArrayList<Book> booksList = new ArrayList<Book>();

    BooksManager(boolean createDefaultBooksList){
        if(createDefaultBooksList){
            booksList.add(new Book("1984"));
            booksList.add(new Book("Animal Farm"));
            booksList.add(new Book("It"));
            booksList.add(new Book("Pet Sematary"));
            booksList.add(new Book("Dagon"));
        }
    }

    public ArrayList<Book> getBooksList(){
        return booksList;
    }



}
