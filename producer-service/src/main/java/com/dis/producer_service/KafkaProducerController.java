package com.dis.producer_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "quickstart-events";

    @PostMapping
    public String publish(@RequestParam("message") String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Message sent: " + message;
//hello hi namaste 
    }
}
