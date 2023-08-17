package com.devandre.microservice_spring_project_1.services;

import com.devandre.microservice_spring_project_1.dtos.KafkaDTO;
import com.devandre.microservice_spring_project_1.dtos.TicketDTO;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GeneratedTicketService {
    public KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.topic}")
    String defaultTopic;

    public GeneratedTicketService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Scheduled(fixedRate = 5000000)
    public void execute() {
        var enhancedRandomBuilder = EnhancedRandomBuilder.aNewEnhancedRandomBuilder();
        var newTicketGenerated = enhancedRandomBuilder.build().nextObject(TicketDTO.class);

        var logger = LoggerFactory.getLogger(GeneratedTicketService.class);

        var newMessageKafka = new KafkaDTO();

        newMessageKafka.setTicketDTO(newTicketGenerated);

        var response = kafkaTemplate.send(defaultTopic, UUID.randomUUID().toString(), newMessageKafka.toString());

        response.whenComplete((message, ex) -> {
            if (ex == null) {
                logger.info(message.toString());
            } else {
                logger.warn("Not possible send message to Kafka, error: " + ex.getMessage());
            }
        });
    }
}
