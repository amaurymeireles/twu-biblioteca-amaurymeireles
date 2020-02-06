package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book;
    User user;
    @Before
    public void createHarryPotter(){
         book = new Book("Harry Potter", "J.K", 1997);
         user = new User("123-4567", "123");
    }


    @Test
    public void verifyBookTitleAuthorYear(){
        assertEquals(book.getName(), "Harry Potter");
        assertEquals(book.getAuthor(), "J.K");
        assertEquals(book.getYear(), 1997);
        assertTrue(book.isAvailable());
    }

    @Test
    public void verifyCheckout(){
        book.checkout(user);
        assertFalse(book.isAvailable());
    }

    @Test
    public void verifyCheckIn(){
        book.checkout(user);
        book.checkin();
        assertTrue(book.isAvailable());

    }
}
