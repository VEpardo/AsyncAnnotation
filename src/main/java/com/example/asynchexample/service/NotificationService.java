package com.example.asynchexample.service;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class NotificationService {

    @Async
    public void sendTextMessage(String mobile){
        //business logic
        sleep(2);
        System.out.println("Called 3rd party to send text message: " + Thread.currentThread().getName());
        System.out.println(10/0);
    }


    @SneakyThrows
    private void sleep(int args){
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
