package com.example.loose;

public class SMSService implements NoticationService{

    @Override
    public void send(String message) {

        System.out.println("SMS :" + message);
    }
}
