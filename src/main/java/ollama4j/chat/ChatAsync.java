package ollama4j.chat;

import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.models.response.OllamaAsyncResultStreamer;

public class ChatAsync {

    public static void main(String[] args) throws Exception {
        String host = "http://localhost:11434/";
        OllamaAPI ollamaAPI = new OllamaAPI(host);
        ollamaAPI.setRequestTimeoutSeconds(60);
        String prompt = "列出2019年板球世界杯的所有参赛队伍.";
        OllamaAsyncResultStreamer streamer = ollamaAPI.generateAsync("deepseek-r1:1.5b", prompt, false);

        // Set the poll interval according to your needs. 
        // Smaller the poll interval, more frequently you receive the tokens.
        int pollIntervalMilliseconds = 1000;

        while (true) {
            String tokens = streamer.getStream().poll();
            System.out.print(tokens);
            if (!streamer.isAlive()) {
                break;
            }
            Thread.sleep(pollIntervalMilliseconds);
        }

        System.out.println("\n------------------------");
        System.out.println("Complete Response:");
        System.out.println("------------------------");

        System.out.println(streamer.getCompleteResponse());
    }
}