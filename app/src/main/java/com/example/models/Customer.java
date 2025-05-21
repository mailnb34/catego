package com.example.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String username;
    private String password;

    public int getId() {
        return id;
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

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(int id, String name, String email, String phone, String username, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    @NonNull
    @Override
    public String toString() {
        String infor = id + " - " + name + "\n" + email + "\n" + phone;
        return infor;
    }
}
