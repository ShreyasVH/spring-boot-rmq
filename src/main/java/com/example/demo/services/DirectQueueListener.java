package com.example.demo.services;

import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.util.Map;

@Component
public class DirectQueueListener
{
    @RabbitListener(queues = "${queue}")
    public void receivedMessage(Map message)
    {
        System.out.println("################# Received Message on DirectQueueListener ##################");
        System.out.println("Message: " + message);
    }
}
