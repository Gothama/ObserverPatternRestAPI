package com.example.demo.ObserverDesignPattern;

public class Type1Observer implements Observer {

    String name,email;
    public Type1Observer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    @Override
    public void notifyObserver(String news) {
        System.out.println("Reading the news: " + news);
    }
}
