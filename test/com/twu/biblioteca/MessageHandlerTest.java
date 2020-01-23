package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;



public class MessageHandlerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    MessageHandler messageHandler = new MessageHandler();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void verifyIfThereIsAWelcomeMessage() {
        messageHandler.showWelcomeMessage();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n", outContent.toString());
    }

    @Test
    public void verifyBooksList(){
        messageHandler.showBooksList();
        assertEquals("1)Title:1984|Author:George|Year:1949"+
                "\n2)Title:Animal Farm|Author:George|Year:1945"+
                "\n3)Title:It|Author:King|Year:1986"+
                "\n4)Title:Pet Sematary|Author:King|Year:1983"+
                "\n5)Title:Dagon|Author:LoveCraft|Year1916:\n", outContent.toString());
    }
}
