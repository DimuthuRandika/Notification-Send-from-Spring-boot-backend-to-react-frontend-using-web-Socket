package com.example.notificationsender.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

public class NotificationController {

    @MessageMapping
    @SendTo("/topic/notifications")
    public String sendNotification(){
        String message ="{\"text\": \"Your notification message here\"}";
        return message;
    }
}
