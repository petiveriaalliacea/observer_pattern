package com.company;

import java.util.ArrayList;
import java.util.List;

public class BlogWebsite implements Observable{

    private List<String> post = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addMessage(String message) {
        post.add(message);
        notifyAllObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer : observers){
            observer.update(this.post);
        }
    }
}
