package org.example;

import com.example.invoker.ApiClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // Start Spring Boot application
        SpringApplication.run(Main.class, args);

        // Your custom code after Spring Boot startup
        System.out.printf("Hello and welcome!");
        ApiClient api = new ApiClient();

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
