package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MenuHandlerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    MenuHandler menuHandler = new MenuHandler();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void verifyRedirectToLisOfBooks(){
        menuHandler.redirect(1);
        assertEquals(1, menuHandler.getScreen());
    }
    @Test
    public void verifyRedirectToQuitApplication(){
        menuHandler.redirect(9);
        assertEquals(9, menuHandler.getScreen());
    }


    @Test
    public void verifyIfStartsOnWelcomeScreen(){
        assertEquals(0, menuHandler.getScreen());
    }

    @Test
    public void verifyRenderStartScreen(){
        menuHandler.renderScreen();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n"+
                "Choose your option\n1)ListBooks\n2)Quit Application\n", outContent.toString());
    }

    @Test
    public void verifyRenderBookListScreen(){
        menuHandler.redirect(1);
        menuHandler.renderScreen();
        assertEquals("1)Title:1984|Author:George|Year:1949"+
                "\n2)Title:Animal Farm|Author:George|Year:1945"+
                "\n3)Title:It|Author:King|Year:1986"+
                "\n4)Title:Pet Sematary|Author:King|Year:1983"+
                "\n5)Title:Dagon|Author:Lovecraft|Year:1916\n",
                "\n5)Title:Dagon|Author:Lovecraft|Year:1916\n", outContent.toString());
    }

    @Test
    public void verifyInvalidRedirect(){
        menuHandler.redirect(5);
        menuHandler.renderScreen();
        assertEquals("Please select a valid option!\n", outContent.toString());
    }

    @Test
    public void verifyCheckoutBookScreen(){
        menuHandler.redirect(2);
        menuHandler.renderScreen();
        assertEquals("1)Title:1984|Author:George|Year:1949"+
                        "\n2)Title:Animal Farm|Author:George|Year:1945"+
                        "\n3)Title:It|Author:King|Year:1986"+
                        "\n4)Title:Pet Sematary|Author:King|Year:1983"+
                        "\n5)Title:Dagon|Author:Lovecraft|Year:1916"+
                        "\nPlease select a book to checkout: \n", outContent.toString());
    }
}
