package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        int redirectInput = 0;
        Scanner reader = new Scanner(System.in);
        MenuHandler menuHandler = new MenuHandler();
        while(redirectInput !=9){
            menuHandler.renderScreen();
            redirectInput = reader.nextInt();
            menuHandler.redirect(redirectInput);
            menuHandler.renderScreen();
        }

    }

}
