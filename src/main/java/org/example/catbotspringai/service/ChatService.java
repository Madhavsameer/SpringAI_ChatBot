package org.example.catbotspringai.service;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;


@Service
public class ChatService {
    private ChatClient chatClient;

    public ChatService (ChatClient.Builder builder){
        this.chatClient=builder.build();
    }
    public String ragChat(String question){
        return chatClient.prompt().user(question).call().content();
    }
}

