package com.mycompany.fithivesystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 96653
 */
public class User {
     private String name;
    private int id;
    private String phone;
    private String email;
    private String username;
    private String password;

    public User(String name, int id, String phone, String email, String username, String password) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone(String phone) {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail(String email) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername(String username) {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(String password) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
