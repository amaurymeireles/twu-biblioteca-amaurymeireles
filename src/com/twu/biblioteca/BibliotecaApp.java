package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        messageHandler.showWelcomeMessage();
        messageHandler.showBooksList();
    }
}
