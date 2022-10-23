package com.sbkafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaStringConsumerService {
    @KafkaListener(topics = "${topic.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listener(String value) {
        System.out.println("Message Received");
        System.out.println("================");
        System.out.println(value);
        System.out.println("--------------------");
    }
}
