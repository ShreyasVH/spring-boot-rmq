package com.example.demo.controllers;

import com.example.demo.services.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController
{
    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping("/send")
    public String send()
    {
        Map<String, String> message = new HashMap<>();
        message.put("a", "A");
        message.put("b", "B");
        rabbitMQSender.send(message, "spring-direct-exchange", "spring-direct-key");
        return "Message Sent";
    }

}
