package com.twu.biblioteca;

import java.util.ArrayList;

public class MessageHandler {
    private final String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    private final String menuList = "Choose your option\n1)ListBooks\n2)Checkout a book\n3)Check in a book"+
        "\n4)ListMovies\n5)Checkout a Movie\n6)User Info\n9)Quit Application";
    private final String selectCheckOutBookMessage = "Please select a book to checkout:";
    private final String selectCheckOutMovieMessage = "Please select a movie to checkout:";
    private final String selectCheckInBookMessage = "Please select a book to check in:";
    private final String successfulCheckout = "Thank you! Enjoy the book!\n";
    private final String unsuccessfulCheckout = "Sorry, that book is not available\n";
    private final String successfulCheckIn = "Thank you for returning the book\n";
    private final String unsuccessfulCheckIn = "That is not a valid book to return";
    private final String loginMessage = "Please enter your user name and password: ";
    private final String failedLoginMessage = "Invalid UserId and Password!";



    public void showWelcomeMessage(){
        System.out.println(welcomeMessage);
    }

    public void showFailedLoginMessage(){
        System.out.println(failedLoginMessage);
    }

    public void showLoginMessage(){
        System.out.println(loginMessage);
    }

    public void showCheckoutSelectBookMessage(){
        System.out.println(selectCheckOutBookMessage);
    }

    public void showCheckoutMovieMessage(){
        System.out.println(selectCheckOutMovieMessage);
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

    public void showAvailableBooksList(ItemsManager itemsManager){
        ArrayList<Book> booksList = itemsManager.getAvailableBookList();

        for(int i = 0; i < booksList.size(); i++){
            System.out.println((i+1)+")Title:"+booksList.get(i).getName()+
                    "|Author:"+booksList.get(i).getAuthor()+
                    "|Year:"+booksList.get(i).getYear());
        }
        System.out.println("");
    }

    public void showUserInfo(User user){
        System.out.println("Name: " + user.getName());
        System.out.println("Email: "+ user.getEmail());
        System.out.println("Phone: "+ user.getPhone());
        System.out.println("");
    }

    public void showCheckInBooksList(ItemsManager itemsManager){
        ArrayList<Book> booksList = itemsManager.getCheckInList();

        for(int i = 0; i < booksList.size(); i++){
            System.out.println((i+1)+")Title:"+booksList.get(i).getName()+
                    "|Author:"+booksList.get(i).getAuthor()+
                    "|Year:"+booksList.get(i).getYear()+
                    "|User:"+booksList.get(i).getUser().getIdNumber());
        }
        System.out.println("");
    }
    public void showBooksList(ItemsManager itemsManager){
        ArrayList<Book> booksList = itemsManager.getBooksList();

        for(int i = 0; i < booksList.size(); i++){
            System.out.println((i+1)+")Title:"+booksList.get(i).getName()+
                    "|Author:"+booksList.get(i).getAuthor()+
                    "|Year:"+booksList.get(i).getYear());
        }
        System.out.println("");
    }

    public void showMoviesList(ItemsManager itemsManager){
        ArrayList<Movie> moviesList = itemsManager.getMoviesList();

        for(int i = 0; i < moviesList.size(); i++){
            System.out.println((i+1)+")Title:"+moviesList.get(i).getName()+
                    "|Author:"+moviesList.get(i).getDirector()+
                    "|Year:"+moviesList.get(i).getYear()+
                    "|Rating:"+moviesList.get(i).getRating());
        }
        System.out.println("");
    }



    public void showAvailableMoviesList(ItemsManager itemsManager){
        ArrayList<Movie> moviesList = itemsManager.getAvailableMovieList();

        for(int i = 0; i < moviesList.size(); i++){
            System.out.println((i+1)+")Title:"+moviesList.get(i).getName()+
                    "|Author:"+moviesList.get(i).getDirector()+
                    "|Year:"+moviesList.get(i).getYear()+
                    "|Rating:"+moviesList.get(i).getRating());
        }
        System.out.println("");
    }



    public void showMenuList(){
        System.out.println(menuList);
    }

}
