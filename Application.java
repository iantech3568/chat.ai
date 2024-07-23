import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class ChatbotApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatbotApplication.class, args);
    }
}

@RestController
public class ChatbotController {

    @PostMapping("/chat")
    public Response chat(@RequestBody UserInput userInput) {
        // Implement AI or logic here
        String userMessage = userInput.getMessage();
        String botResponse = "You said: " + userMessage; // Simple echo response for now
        return new Response(botResponse);
    }
}

class UserInput {
    private String message;
    // Getters and setters
}

class Response {
    private String response;

    public Response(String response) {
        this.response = response;
    }
    // Getters and setters
}
