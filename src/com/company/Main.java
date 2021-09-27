package com.company;

public class Main {

    public static void main(String[] args) {
        BlogWebsite twitter = new BlogWebsite();

        twitter.addMessage("Hello ");
        twitter.addMessage("World! ");

        User bob = new User("bobik");
        twitter.registerObserver(bob);
        User mark = new User("marik");
        twitter.registerObserver(mark);

        twitter.addMessage("Yay");
    }
}
