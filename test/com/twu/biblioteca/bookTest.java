package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class bookTest {
    @Test
    public void verifyBookTitleAuthorYear(){
        Book book = new Book("Harry Potter", "J.K", 1997);
        assertEquals(book.getName(), "Harry Potter");
        assertEquals(book.getAuthor(), "J.K");
        assertEquals(book.getYear(), 1997);
    }
}
