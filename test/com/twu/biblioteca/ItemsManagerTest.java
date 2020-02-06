package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;


public class ItemsManagerTest {
    ItemsManager itemsManager;
    ArrayList<Book> booksList;
    ArrayList<Movie> moviesList;
    User user;

    @Before
    public void createUser(){
        user = new User("123-4567", "123");
    }

    @Before
    public void startItemsList() {
        itemsManager = new ItemsManager(true);
        booksList = itemsManager.getBooksList();
        moviesList = itemsManager.getMoviesList();
    }

    @Test
    public void verifyIfThereIsTheDefaultBooks(){
        assertEquals(booksList.size(), 5);
    }

    @Test
    public void verifyIfThereIsTheDefaultMovies(){assertEquals(moviesList.size(), 3);}

    @Test
    public void verifyAvailableListAfterCheckout(){
        ArrayList<Book> availableBooksList;
        booksList.get(1).checkout(user);
        availableBooksList = itemsManager.getAvailableBookList();
        assertEquals(availableBooksList.size(), 4);
    }

    @Test
    public void verifyListAfterCheckout(){
        ArrayList<Book> availableBooksList;
        booksList.get(1).checkout(user);
        availableBooksList = itemsManager.getBooksList();
        assertEquals(availableBooksList.size(), 5);
    }

    @Test
    public void verifyCheckInList(){
        ArrayList<Book> availableBooksList;
        availableBooksList = itemsManager.getCheckInList();
        assertEquals(availableBooksList.size(), 0);
    }

    @Test
    public void verifyCheckInListAfterACheckout(){
        ArrayList<Book> checkinBooksList;
        booksList.get(1).checkout(user);
        checkinBooksList = itemsManager.getCheckInList();
        assertEquals(checkinBooksList.size(), 1);
    }

    @Test
    public void verifyAvailableListAfterACheckoutAndCheckIn(){
        ArrayList<Book> availableBooksList;
        booksList.get(1).checkout(user);
        booksList.get(1).checkin();
        availableBooksList = itemsManager.getAvailableBookList();
        assertEquals(availableBooksList.size(), 5);
    }

    @Test
    public void verifyCheckInListAfterACheckoutAndCheckIn(){
        ArrayList<Book> checkinBooksList;
        booksList.get(1).checkout(user);
        booksList.get(1).checkin();
        checkinBooksList = itemsManager.getCheckInList();
        assertEquals(checkinBooksList.size(), 0);
    }

    @Test
    public void verifyAvailableMovieListAfterCheckout(){
        ArrayList<Movie> checkoutMovieList;
        moviesList.get(1).checkout(user);
        checkoutMovieList = itemsManager.getAvailableMovieList();
        assertEquals(checkoutMovieList.size(), 2);
    }

    @Test
    public void verifyAvailableMovieListAfterCheckin(){
        ArrayList<Movie> checkinMovieList;
        moviesList.get(1).checkout(user);
        moviesList.get(1).checkin();
        checkinMovieList = itemsManager.getAvailableMovieList();
        assertEquals(checkinMovieList.size(), 3);
    }
}
