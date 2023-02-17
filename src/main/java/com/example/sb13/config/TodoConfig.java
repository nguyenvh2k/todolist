package com.example.sb13.config;

import com.example.sb13.model.TodoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class TodoConfig {
    /**
     * Tao ra Bean todovalid de su dung sau nay
     */
    @Bean
    public TodoValidator validator(){
        return new TodoValidator();
    }
}
