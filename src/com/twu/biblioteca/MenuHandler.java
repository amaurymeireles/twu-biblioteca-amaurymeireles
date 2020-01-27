package com.twu.biblioteca;

public class MenuHandler {
    private int screen;
    private MessageHandler messageHandler = new MessageHandler();
    /*
    0-Menu
    1-List Books
    */

    public MenuHandler(){
        this.screen = 0;
    }

    public int getScreen() {
        return screen;
    }

    public void redirect(int userInput) {
        if(userInput > -1 && userInput < 2) {
            this.screen = userInput;
        }else{
            System.out.println("Please select a valid option!");
        }

    }

    public void renderScreen(){
        switch(this.screen){
            case 0:
                messageHandler.showWelcomeMessage();
                messageHandler.showMenuList();
            break;
            case 1:
                messageHandler.showBooksList();
            break;
        }
    }
}
