package com.example.demo;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.ai.prompt.Prompt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    OpenAiChatClient chatClient = new OpenAiChatClient(new OpenAiApi("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"));

    @GetMapping("/ai/message")
    public String getMessage(@RequestParam(value = "prompt") String prompt) {
        return chatClient.generate(prompt);
    }
}
