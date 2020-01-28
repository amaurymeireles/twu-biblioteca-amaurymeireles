package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void verifyBookTitleAuthorYear(){
        Book book = new Book("Harry Potter", "J.K", 1997);
        assertEquals(book.getName(), "Harry Potter");
        assertEquals(book.getAuthor(), "J.K");
        assertEquals(book.getYear(), 1997);
        assertTrue(book.isAvailable());
    }

    @Test
    public void verifyCheckout(){
        Book book = new Book("Harry Potter", "J.K", 1997);
        book.checkout();
        assertFalse(book.isAvailable());
    }
}
