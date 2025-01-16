package com.chat_app.chat_app.controller;

import com.chat_app.chat_app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        if (message == null || message.getSender() == null || message.getMessage() == null) {
            throw new IllegalArgumentException("Invalid message payload");
        }
        System.out.println("Received message: " + message);
        return message;
    }


    @GetMapping("chat")
    public String chat() {
        return "chat";
    }
}
