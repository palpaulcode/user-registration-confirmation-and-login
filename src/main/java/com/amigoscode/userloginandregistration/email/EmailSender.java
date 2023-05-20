package com.amigoscode.userloginandregistration.email;

// interface enables change in implementation
public interface EmailSender {
    void send(String to, String email);
}
