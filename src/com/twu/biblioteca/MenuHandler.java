package com.twu.biblioteca;

import java.util.Scanner;

public class MenuHandler {
    private final int MENU = 0, LIST_BOOKS = 1, CHECKOUT_BOOKS = 2, CHECKIN_BOOKS = 3, LIST_MOVIES = 4,
            CHECKOUT_MOVIES = 5, USER_INFO = 6, EXIT= 9;
    private int screen;
    private User user;
    private MessageHandler messageHandler;
    private ItemsManager itemsManager;

    public MenuHandler(User user){
        itemsManager = new ItemsManager(true);
        messageHandler = new MessageHandler();
        this.screen = MENU;
        this.user = user;
    }

    public int getScreen() {
        return screen;
    }

    public void redirect(int userInput) {
        this.screen = userInput;
    }

    public void renderScreen(){
        Scanner reader = new Scanner(System.in);
        int selectedBook, selectedMovie;
        switch(this.screen){
            case MENU:
                messageHandler.showWelcomeMessage();
                messageHandler.showMenuList();
            break;
            case LIST_BOOKS:
                messageHandler.showBooksList(itemsManager);
                this.redirect(0);
            break;
            case CHECKOUT_BOOKS:
                messageHandler.showAvailableBooksList(itemsManager);
                messageHandler.showCheckoutSelectBookMessage();
                selectedBook = reader.nextInt();
                if(selectedBook <= itemsManager.getAvailableBookList().size()) {
                    itemsManager.getAvailableBookList().get(selectedBook - 1).checkout(user);
                    messageHandler.showSuccessfulCheckout();
                }else{
                    messageHandler.showUnsuccessfulCheckout();
                }
                this.redirect(0);
            break;
            case CHECKIN_BOOKS:
                messageHandler.showCheckInBooksList(itemsManager);
                messageHandler.showCheckInSelectBookMessage();
                selectedBook = reader.nextInt();
                if(selectedBook <= itemsManager.getCheckInList().size()) {
                    itemsManager.getCheckInList().get(selectedBook-1).checkin();
                    messageHandler.showSuccessfulCheckIn();
                }else{
                    messageHandler.showUnsuccessfulCheckIn();
                }
                this.redirect(0);
            break;
            case LIST_MOVIES:
                messageHandler.showMoviesList(itemsManager);
                this.redirect(0);
            break;
            case CHECKOUT_MOVIES:
                messageHandler.showAvailableMoviesList(itemsManager);
                messageHandler.showCheckoutMovieMessage();
                selectedMovie = reader.nextInt();
                if(selectedMovie <= itemsManager.getAvailableMovieList().size()) {
                    itemsManager.getAvailableMovieList().get(selectedMovie - 1).checkout(user);
                    messageHandler.showSuccessfulCheckout();
                }else{
                    messageHandler.showUnsuccessfulCheckout();
                }
                this.redirect(0);
            break;
            case USER_INFO:
                messageHandler.showUserInfo(user);
                this.redirect(0);
            break;
            case EXIT:
                System.exit(0);
            break;
            default:
                System.out.println("Please select a valid option!");
                this.redirect(0);
            break;
        }
    }
}
