package ollama4j.picture;

import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.exceptions.OllamaBaseException;
import io.github.ollama4j.models.response.OllamaResult;
import io.github.ollama4j.utils.OptionsBuilder;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * deepseek不支持图片识别
 */
public class PicturePath {

    public static void main(String[] args) throws OllamaBaseException, IOException, InterruptedException {
        String host = "http://localhost:11434/";
        OllamaAPI ollamaAPI = new OllamaAPI(host);
        ollamaAPI.setRequestTimeoutSeconds(10);

        OllamaResult result = ollamaAPI.generateWithImageFiles("deepseek-r1:1.5b",
                "What's in this image?",
                Arrays.asList(new File("E:\\code\\demo3\\src\\test\\java\\com\\example\\demo\\picture\\img.png")),
                new OptionsBuilder().build()
        );
        System.out.println(result.getResponse());
    }
}