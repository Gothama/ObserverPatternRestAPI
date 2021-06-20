package com.example.demo.ObserverDesignPattern;


public class Type2Observer implements Observer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name,email;
    public Type2Observer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void notifyObserver(String news) {
        System.out.println("Wrap the :" + news);
    }
}
