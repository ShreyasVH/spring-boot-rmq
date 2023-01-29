package com.example.demo.services;

import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.util.Map;

@Component
public class FanoutQueueListener
{
    @RabbitListener(queues = "userservice.add_ack_user")
    public void receivedMessage(Message message)
    {
        System.out.println("################# Received Message on FanoutQueueListener ##################");
        System.out.println("Message: " + new String(message.getBody()));
    }
}
