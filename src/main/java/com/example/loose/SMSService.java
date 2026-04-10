package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements NoticationService{

    @Override
    public void send(String message) {

        System.out.println("SMS :" + message);
    }
}
