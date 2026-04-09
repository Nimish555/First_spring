package com.example.demo;

import org.springframework.stereotype.Component;

@Component("myBean")
public class GreetingService {
    public void sayHello(){
        System.out.println("hello backend spring boot");
    }
}
