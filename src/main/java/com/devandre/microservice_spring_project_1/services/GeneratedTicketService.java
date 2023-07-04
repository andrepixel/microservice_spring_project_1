package com.devandre.microservice_spring_project_1.services;

import com.devandre.microservice_spring_project_1.dtos.TicketDTO;

import io.github.benas.randombeans.EnhancedRandomBuilder;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class GeneratedTicketService {

    @Scheduled(fixedRate = 5000)
    public void run() {
        var enhancedRandomBuilder = EnhancedRandomBuilder.aNewEnhancedRandomBuilder();
        var newTicketGenerated = enhancedRandomBuilder.build().nextObject(TicketDTO.class);

        var logger = LoggerFactory.getLogger(GeneratedTicketService.class);

        logger.info(newTicketGenerated.toString());
    }
}
