package com.example.demo.role;

import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.exceptions.RoleNotFoundException;
import io.github.ollama4j.models.chat.OllamaChatMessageRole;

import java.util.List;

public class Main {

    public static void main(String[] args) throws RoleNotFoundException {
        String host = "http://localhost:11434/";
        OllamaAPI ollamaAPI = new OllamaAPI(host);

        List<OllamaChatMessageRole> roles = (List<OllamaChatMessageRole>) ollamaAPI.getRole("custom-role");
        System.out.println(roles);
    }
}