package com.twu.biblioteca;

public class User {
    String idNumber, password;

    public User(String idNumber, String password) {
        this.idNumber = idNumber;
        this.password = password;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public boolean login(String password){
        return this.password.equals(password);
    }
}
