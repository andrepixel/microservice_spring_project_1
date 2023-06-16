package com.devandre.microservice_spring_project_1.services;

import com.devandre.microservice_spring_project_1.dtos.TicketDTO;
import com.devandre.microservice_spring_project_1.utils.enums.ListOfCompanies;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.annotation.Randomizer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class GeneratedTicketService {
    @Scheduled(fixedRate = 5000)
    public void run() {
        var newTicketGenerated = new EnhancedRandomBuilder().build().nextObject(TicketDTO.class);

        System.out.println(newTicketGenerated);
    }
}
