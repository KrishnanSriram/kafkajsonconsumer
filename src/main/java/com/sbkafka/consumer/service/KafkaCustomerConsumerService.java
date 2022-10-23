package com.sbkafka.consumer.service;

import com.sbkafka.consumer.model.Customer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaCustomerConsumerService {
    @KafkaListener(topics = "${topic.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listener(Customer value) {
        System.out.println("Message Received - Customer");
        System.out.println("================");
        System.out.println(value.toString());
        System.out.println("--------------------");
    }
}
