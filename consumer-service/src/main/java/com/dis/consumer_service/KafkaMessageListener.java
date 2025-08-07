package com.dis.consumer_service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "quickstart-events", groupId = "consumer-group-1")
    public void listen(String message) {
        System.out.println("✅ Consumed: " + message);

//hello hi namaste 
    }
}
