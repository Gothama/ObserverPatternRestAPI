package com.example.demo.Controller;

import com.example.demo.ObserverDesignPattern.Observer;
import com.example.demo.ObserverDesignPattern.Subject;
import com.example.demo.ObserverDesignPattern.Type1Observer;
import com.example.demo.ObserverDesignPattern.Type2Observer;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ObserverController {


    private Subject subject = new Subject();
    Observer observer1;

    @PostMapping("/subscribe")
    public String subscribeobserver(@RequestBody ParamsUser paramsUser) {
        if (paramsUser.getType().equals("Type1")) {
            observer1 = new Type1Observer(paramsUser.getName(), paramsUser.getEmail());
        } else {
            observer1 = new Type2Observer(paramsUser.getName(), paramsUser.getEmail());
        }
        return subject.subscriber(observer1);

    }


    @DeleteMapping("/unsubscribe")
    public String unsubscribeobserver(@RequestBody ParamsUser paramsUser) {
        if (paramsUser.getType().equals("Type1")) {
            observer1 = new Type1Observer(paramsUser.getName(), paramsUser.getEmail());
        } else {
            observer1 = new Type2Observer(paramsUser.getName(), paramsUser.getEmail());
        }
        return subject.unsubscribe(observer1);

    }

    @PostMapping("/sendnews")
    public String sendnewsobserver(@RequestBody String news) {

        subject.notifyObservers(news);
        return "notified Observers";
    }

    @GetMapping("/getall")
    public int getall() {
        return subject.gall();
    }
}
