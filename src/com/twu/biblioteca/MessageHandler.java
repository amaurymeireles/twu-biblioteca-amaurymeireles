package com.twu.biblioteca;

import java.util.ArrayList;

public class MessageHandler {
    private final String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    private final String menuList = "Choose your option\n1)ListBooks";

    public void showWelcomeMessage(){
        System.out.println(welcomeMessage);
    }

    public void showBooksList(){
        BooksManager booksManager = new BooksManager(true);
        ArrayList<Book> booksList = booksManager.getBooksList();

        for(int i = 0; i < booksList.size(); i++){
            System.out.println((i+1)+")Title:"+booksList.get(i).getName()+
                    "|Author:"+booksList.get(i).getAuthor()+
                    "|Year:"+booksList.get(i).getYear());
        }
    }

    public void showMenuList(){
        System.out.println(menuList);
    }

}
