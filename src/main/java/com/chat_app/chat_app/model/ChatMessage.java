package com.chat_app.chat_app.model;

public class ChatMessage {
    private Long id;
    private String sender;
    private String message;

    public ChatMessage() {}

    public ChatMessage(Long id, String sender, String message) {
        this.id = id;
        this.sender = sender;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
