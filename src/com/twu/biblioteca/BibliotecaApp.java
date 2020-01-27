package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int redirectInput;
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.renderScreen();
        redirectInput = reader.nextInt();
        menuHandler.redirect(redirectInput);
        menuHandler.renderScreen();

    }
}
