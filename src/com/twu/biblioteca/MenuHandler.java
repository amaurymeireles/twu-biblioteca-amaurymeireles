package com.twu.biblioteca;

public class MenuHandler {
    private final int MENU = 0, LIST_BOOKS = 1, EXIT= 2;
    private int screen;
    private MessageHandler messageHandler;

    public MenuHandler(){
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
        switch(this.screen){
            case MENU:
                messageHandler.showWelcomeMessage();
                messageHandler.showMenuList();
            break;
            case LIST_BOOKS:
                messageHandler.showBooksList();
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
