package com.twu.biblioteca;

import java.util.Scanner;

public class MenuHandler {
    private final int MENU = 0, LIST_BOOKS = 1, CHECKOUT_BOOKS = 2, CHECKIN_BOOKS = 3, EXIT= 9;
    private int screen;
    private MessageHandler messageHandler;
    private BooksManager booksManager;

    public MenuHandler(){
        booksManager = new BooksManager(true);
        messageHandler = new MessageHandler();
        this.screen = MENU;
    }

    public int getScreen() {
        return screen;
    }

    public void redirect(int userInput) {
        this.screen = userInput;
    }

    public void renderScreen(){
        Scanner reader = new Scanner(System.in);
        int selectedBook;
        switch(this.screen){
            case MENU:
                messageHandler.showWelcomeMessage();
                messageHandler.showMenuList();
            break;
            case LIST_BOOKS:
                messageHandler.showBooksList(booksManager);
                this.redirect(0);
            break;
            case CHECKOUT_BOOKS:
                messageHandler.showAvailableBooksList(booksManager);
                messageHandler.showCheckoutSelectBookMessage();
                selectedBook = reader.nextInt();
                if(selectedBook <= booksManager.getAvailableBookList().size()) {
                    booksManager.getAvailableBookList().get(selectedBook - 1).checkout();
                    messageHandler.showSuccessfulCheckout();
                }else{
                    messageHandler.showUnsuccessfulCheckout();
                }
                this.redirect(0);
            break;
            case CHECKIN_BOOKS:
                messageHandler.showCheckInBooksList(booksManager);
                messageHandler.showCheckInSelectBookMessage();
                selectedBook = reader.nextInt();
                if(selectedBook <= booksManager.getCheckInList().size()) {
                    booksManager.getCheckInList().get(selectedBook-1).checkin();
                    messageHandler.showSuccessfulCheckIn();
                }else{
                    messageHandler.showUnsuccessfulCheckIn();
                }
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
