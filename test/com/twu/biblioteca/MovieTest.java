package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    Movie killBill;
    User user;
    @Before
    public void createKillBill(){
        killBill = new Movie("Kill Bill", "Tarantino", 2004, 7.58);
        user = new User("123-4567", "123");
    }

    @Test
    public void verifyCheckout(){
        killBill.checkout(user);
        assertEquals("123-4567", killBill.getUser().getIdNumber());
    }

    @Test
    public void verifyMovieCreatedWithRating(){
        assertEquals(killBill.getName(), "Kill Bill");
        assertEquals(killBill.getDirector(), "Tarantino");
        assertEquals(killBill.getYear(), 2004);
        assertEquals(killBill.getRating(), 7.58, 0);
        assertTrue(killBill.isAvailable());
        assertTrue(killBill.isRated());
    }

    @Test
    public void verifyMovieCreatedWithoutRating(){
        Movie spiritedAway = new Movie("Spirited Away", "Miyazaki", 2003);
        assertEquals(spiritedAway.getName(), "Spirited Away");
        assertEquals(spiritedAway.getDirector(), "Miyazaki");
        assertEquals(spiritedAway.getYear(), 2003);
        assertEquals(spiritedAway.getRating(), 0, 0);
        assertTrue(spiritedAway.isAvailable());
        assertFalse(spiritedAway.isRated());
    }
}
