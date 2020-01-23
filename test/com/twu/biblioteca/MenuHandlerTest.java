package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuHandlerTest {
    @Test
    public void verifyRedirectToLisOfBooks(){
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.redirect(1);
        assertEquals(1, menuHandler.getScreen());
    }
}
