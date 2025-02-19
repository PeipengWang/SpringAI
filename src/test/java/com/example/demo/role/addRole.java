package com.example.demo.role;

import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.models.chat.OllamaChatMessageRole;

public class addRole {

    public static void main(String[] args) {
        String host = "http://localhost:11434/";
        OllamaAPI ollamaAPI = new OllamaAPI(host);

        OllamaChatMessageRole customRole = ollamaAPI.addCustomRole("custom-role");
    }
}