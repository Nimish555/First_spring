package com.example.loose;

public class EmailService implements NoticationService{

    @Override
    public void send(String message) {
        System.out.println("email :" + message);
    }
}
