package com.example.asynchexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsynchexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsynchexampleApplication.class, args);
    }

}
