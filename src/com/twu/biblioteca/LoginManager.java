package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class LoginManager {
    ArrayList<User> users;

    LoginManager(boolean createDefaultList){
        users = new ArrayList<User>();
        if(createDefaultList){
            users.add(new User("123-4567", "123", "Babu", "babu@gmail.com", "1234-5678"));
            users.add(new User("666-4567", "123", "Manu", "manu@gmail.com", "1234-5678"));
        }
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public User login(String id, String password){
        User foundUser = null;

        for (User user : users) {
            if (user.getIdNumber().equals(id)) {
                if (user.login(password)) {
                    foundUser = user;
                }
            }
        }
        return foundUser;
    }
}
