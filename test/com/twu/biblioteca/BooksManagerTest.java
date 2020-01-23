package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;


public class BooksManagerTest {
    @Test
    public void verifyIfThereIsTheDefaultBooks(){
        BooksManager booksManager = new BooksManager(true);
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList = booksManager.getBooksList();
        assertEquals(booksList.size(), 5);
    }

}
