package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.amqp.core.AmqpTemplate;

@Service
public class RabbitMQSender
{
    @Autowired
    private AmqpTemplate template;

    public void send(Object message, String exchange, String routingKey)
    {
        template.convertAndSend(exchange, routingKey, message);
    }

}
