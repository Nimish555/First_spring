package com.example.loose;
import com.example.loose.NoticationService;
public class UserService {

    private NoticationService smsService;
    private NoticationService emailService;

    public UserService(NoticationService smsService) {
        this.smsService = smsService;
    }

    public void setEmailService(NoticationService emailService) {
        this.emailService = emailService;
    }

    public void notifyUser(String message) {
        smsService.send(message);
        emailService.send(message);
    }
}