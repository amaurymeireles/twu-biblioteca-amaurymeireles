package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user;
    @Before
    public void createUser(){
        user = new User("123-4567", "123", "Babu", "babu@gmail.com", "1234-5678");
    }

    @Test
    public void verifyIfUserWasCreated(){
        assertEquals(user.getIdNumber(), "123-4567");
    }

    @Test
    public void verifyCorrectLogin(){
        assertTrue(user.login("123"));
    }

    @Test
    public void verifyIncorrectLogin(){
        assertFalse(user.login("333"));
    }
}
