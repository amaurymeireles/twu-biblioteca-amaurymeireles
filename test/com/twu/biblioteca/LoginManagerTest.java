package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LoginManagerTest {

    LoginManager loginManager;

    @Before
    public void createLoginManager(){
        loginManager = new LoginManager(true);
    }

    @Test
    public void verifyIfThereIsUserDataBase() {
        assertEquals(loginManager.getUsers().size(), 2);
    }

    @Test
    public void verifyCorrectLogin() {
        assertTrue(loginManager.login("123-4567","123") != null);
    }

    @Test
    public void verifyIncorrectLogin() {
        assertFalse(loginManager.login("123-4567","12eeeeeee3") != null);
    }

}
