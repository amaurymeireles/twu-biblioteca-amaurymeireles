package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        int redirectInput = 0;
        String userId, password;
        boolean loggedIn = false;
        User user = null;
        LoginManager loginManager = new LoginManager(true);
        Scanner reader = new Scanner(System.in);
        MessageHandler messageHandler = new MessageHandler();
        messageHandler.showLoginMessage();
        while(!loggedIn){
            userId = reader.nextLine();
            password = reader.nextLine();
            user = loginManager.login(userId, password);
            loggedIn = user != null;
            if(!loggedIn){
                messageHandler.showFailedLoginMessage();
            }
        }

        MenuHandler menuHandler = new MenuHandler(user);
        while(redirectInput !=9){
            menuHandler.renderScreen();
            redirectInput = reader.nextInt();
            menuHandler.redirect(redirectInput);
            menuHandler.renderScreen();
        }

    }

}
