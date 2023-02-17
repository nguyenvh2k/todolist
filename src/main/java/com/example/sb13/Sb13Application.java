package com.example.sb13;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "TodoApp API", version = "2.0", description = "TodoApp Information"))
public class Sb13Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb13Application.class, args);
    }
    
}
