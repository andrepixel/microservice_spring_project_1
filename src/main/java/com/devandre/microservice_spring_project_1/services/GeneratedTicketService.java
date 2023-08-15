package com.devandre.microservice_spring_project_1.services;

import com.devandre.microservice_spring_project_1.dtos.KafkaDTO;
import com.devandre.microservice_spring_project_1.dtos.TicketDTO;

import io.github.benas.randombeans.EnhancedRandomBuilder;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class GeneratedTicketService {

    public KafkaTemplate<String, Object> kafkaTemplate;

    public GeneratedTicketService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Scheduled(fixedRate = 5000)
    public void execute() {
        var enhancedRandomBuilder = EnhancedRandomBuilder.aNewEnhancedRandomBuilder();
        var newTicketGenerated = enhancedRandomBuilder.build()
                                                      .nextObject(TicketDTO.class);

        var logger = LoggerFactory.getLogger(GeneratedTicketService.class);

        var newMessageKafka = new KafkaDTO();

        newMessageKafka.setTicketDTO(newTicketGenerated);

        var response = kafkaTemplate.send(String.valueOf(enhancedRandomBuilder.build()
                                                                              .nextInt()), newMessageKafka);

        response.whenComplete((message, ex) -> {
            if (ex == null) {
                logger.info(newTicketGenerated.toString());
            } else {
                logger.warn("Deu ruim");
            }
        });
    }
}
