package com.example.demo.chat;

import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.exceptions.OllamaBaseException;
import io.github.ollama4j.types.OllamaModelType;
import io.github.ollama4j.models.embeddings.OllamaEmbedRequestModel;
import io.github.ollama4j.models.embeddings.OllamaEmbedResponseModel;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Generate Embeddings
 * Generate embeddings from a model.
 * Parameters:
 * model: name of model to generate embeddings from
 * input: text/s to generate embeddings for
 */
public class OllamaEmbed {

    public static void main(String[] args) throws IOException, OllamaBaseException, InterruptedException {

        String host = "http://localhost:11434/";

        OllamaAPI ollamaAPI = new OllamaAPI(host);

        OllamaEmbedResponseModel embeddings = ollamaAPI.embed("deepseek-r1:1.5b", Arrays.asList("Why is the sky blue?", "Why is the grass green?"));

        System.out.println(embeddings);
    }
}