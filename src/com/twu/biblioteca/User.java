package com.twu.biblioteca;

public class User {
    String idNumber, password, name, email, phone;

    public User(String idNumber, String password) {
        this.idNumber = idNumber;
        this.password = password;
    }

    public User(String idNumber, String password, String name, String email, String phone) {
        this.idNumber = idNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public boolean login(String password){
        return this.password.equals(password);
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
