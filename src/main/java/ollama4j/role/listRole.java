package ollama4j.role;

import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.models.chat.OllamaChatMessageRole;

import java.util.List;

public class listRole {

    public static void main(String[] args) {
        String host = "http://localhost:11434/";
        OllamaAPI ollamaAPI = new OllamaAPI(host);

        List<OllamaChatMessageRole> roles = ollamaAPI.listRoles();
        System.out.println(roles);
    }
}