package com.company;

import java.util.List;

public class User implements Observer{
    private String login;

    public User(String login) {
        this.login = login;
    }

    @Override
    public void update(List<String> messages) {
        System.out.println(login + "\nMessage: " + messages);
    }
}
