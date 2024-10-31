package org.example.catbotspringai.web;

import org.example.catbotspringai.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatRestController {
    private ChatService chatService;

    public ChatRestController(ChatService chatService) {
        this.chatService = chatService;
    }
    @GetMapping("/ask")
    public String ask(String question){
        return chatService.ragChat(question);
    }
}
