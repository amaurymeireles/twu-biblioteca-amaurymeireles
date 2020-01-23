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
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", outContent.toString());
    }

    @Test
    public void verifyBooksList(){
        messageHandler.showBooksList();
        assertEquals("1-1984\n2-Animal Farm\n3-It\n4-Pet Sematary\n5-Dagon\n", outContent.toString());
    }
}
