package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
    public void verifyAvailableListAfterCheckout(){
        ArrayList<Book> availableBooksList;
        booksList.get(1).checkout();
        availableBooksList = booksManager.getAvailableBookList();
        assertEquals(availableBooksList.size(), 4);
    }

    @Test
    public void verifyListAfterCheckout(){
        ArrayList<Book> availableBooksList;
        booksList.get(1).checkout();
        availableBooksList = booksManager.getBooksList();
        assertEquals(availableBooksList.size(), 5);
    }

    @Test
    public void verifyCheckInList(){
        ArrayList<Book> availableBooksList;
        availableBooksList = booksManager.getCheckInList();
        assertEquals(availableBooksList.size(), 0);
    }

    @Test
    public void verifyCheckInListAfterACheckout(){
        ArrayList<Book> checkinBooksList;
        booksList.get(1).checkout();
        checkinBooksList = booksManager.getCheckInList();
        assertEquals(checkinBooksList.size(), 1);
    }

    @Test
    public void verifyAvailableListAfterACheckoutAndCheckIn(){
        ArrayList<Book> availableBooksList;
        booksList.get(1).checkout();
        booksList.get(1).checkin();
        availableBooksList = booksManager.getAvailableBookList();
        assertEquals(availableBooksList.size(), 5);
    }

    @Test
    public void verifyCheckInListAfterACheckoutAndCheckIn(){
        ArrayList<Book> checkinBooksList;
        booksList.get(1).checkout();
        booksList.get(1).checkin();
        checkinBooksList = booksManager.getCheckInList();
        assertEquals(checkinBooksList.size(), 0);
    }
}
