package com.example.demo.ObserverDesignPattern;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

//newspaper agency
public class Subject {

   List<Observer> observers = new ArrayList<>();


    //subscribe
    public String subscriber(Observer observer){

        //call the database and run a sql query to insert this observer
        observers.add(observer);
        System.out.println("Successfull");
        return "Subscribed Successfull";

    }

    //unsubscribe
    public String unsubscribe(Observer observer){
        //call the database and run a sql query to delete this observer
        observers.remove(observer);

        return "Unsubscribed";
    }

    public int gall(){
        //call the database and run a sql query to delete this observer

        return observers.size();
    }

    public void notifyObservers(String news ){
        for (Observer observer : observers) {
            observer.notifyObserver(news);

        }
    }

}