package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class booksManagerTest {
    @Test
    public void verifyIfThereIsTheDefaultBooks(){
        BooksManager booksManager = new BooksManager(true);
        ArrayList<BooksManager> booksList = new ArrayList<BooksManager>();
        assertEquals(booksList.size(), 5);
    }

}
