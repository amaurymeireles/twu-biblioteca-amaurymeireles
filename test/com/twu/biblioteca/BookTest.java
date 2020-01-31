package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book;
    @Before
    public void createHarryPotter(){
         book = new Book("Harry Potter", "J.K", 1997);
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
        book.checkout();
        assertFalse(book.isAvailable());
    }

    @Test
    public void verifyCheckIn(){
        book.checkout();
        book.checkin();
        assertTrue(book.isAvailable());

    }
}
