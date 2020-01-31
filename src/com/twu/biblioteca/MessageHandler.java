package com.twu.biblioteca;

import java.util.ArrayList;

public class MessageHandler {
    private final String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    private final String menuList = "Choose your option\n1)ListBooks\n2)Checkout a book\n3)Check in a book\n9)Quit Application";
    private final String selectCheckOutBookMessage = "Please select a book to checkout:";
    private final String selectCheckInBookMessage = "Please select a book to check in:";
    private final String successfulCheckout = "Thank you! Enjoy the book!\n";
    private final String unsuccessfulCheckout = "Sorry, that book is not available\n";
    private final String successfulCheckIn = "Thank you for returning the book\n";
    private final String unsuccessfulCheckIn = "That is not a valid book to return";


    public void showWelcomeMessage(){
        System.out.println(welcomeMessage);
    }

    public void showCheckoutSelectBookMessage(){
        System.out.println(selectCheckOutBookMessage);
    }

    public void showUnsuccessfulCheckIn(){
        System.out.println(unsuccessfulCheckIn);
    }

    public void showSuccessfulCheckIn() {System.out.println(successfulCheckIn);}

    public void showCheckInSelectBookMessage(){
        System.out.println(selectCheckInBookMessage);
    }

    public void showSuccessfulCheckout() {System.out.println(successfulCheckout);}

    public void showUnsuccessfulCheckout() {System.out.println(unsuccessfulCheckout);}

    public void showAvailableBooksList(BooksManager booksManager){
        ArrayList<Book> booksList = booksManager.getAvailableBookList();

        for(int i = 0; i < booksList.size(); i++){
            System.out.println((i+1)+")Title:"+booksList.get(i).getName()+
                    "|Author:"+booksList.get(i).getAuthor()+
                    "|Year:"+booksList.get(i).getYear());
        }
        System.out.println("");
    }

    public void showCheckInBooksList(BooksManager booksManager){
        ArrayList<Book> booksList = booksManager.getCheckInList();

        for(int i = 0; i < booksList.size(); i++){
            System.out.println((i+1)+")Title:"+booksList.get(i).getName()+
                    "|Author:"+booksList.get(i).getAuthor()+
                    "|Year:"+booksList.get(i).getYear());
        }
        System.out.println("");
    }
    public void showBooksList(BooksManager booksManager){
        ArrayList<Book> booksList = booksManager.getBooksList();

        for(int i = 0; i < booksList.size(); i++){
            System.out.println((i+1)+")Title:"+booksList.get(i).getName()+
                    "|Author:"+booksList.get(i).getAuthor()+
                    "|Year:"+booksList.get(i).getYear());
        }
        System.out.println("");
    }


    public void showMenuList(){
        System.out.println(menuList);
    }

}
