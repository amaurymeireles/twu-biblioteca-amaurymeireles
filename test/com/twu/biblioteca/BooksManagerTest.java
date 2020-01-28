package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;


public class BooksManagerTest {
    BooksManager booksManager;
    ArrayList<Book> booksList;
    @Before
    public void startBooksList() {
        booksManager = new BooksManager(true);
        booksList = booksManager.getBooksList();
    }

    @Test
    public void verifyIfThereIsTheDefaultBooks(){
        assertEquals(booksList.size(), 5);
    }

    @Test
    public void verifyListAfterCheckout(){
        ArrayList<Book> availableBooksList;
        booksList.get(1).checkout();
        availableBooksList = booksManager.getAvailableBookList();
        assertEquals(availableBooksList.size(), 4);
    }

}
