package com.twu.biblioteca;

public class MenuHandler {
    private int screen;
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

    public void setScreen(int screen) {
        this.screen = screen;
    }
}
