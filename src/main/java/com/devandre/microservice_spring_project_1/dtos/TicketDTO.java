package com.devandre.microservice_spring_project_1.dtos;

import com.devandre.microservice_spring_project_1.utils.enums.ListOfCompanies;
import com.devandre.microservice_spring_project_1.utils.enums.StatusOfTicket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDTO {
    private UUID id;
    private SectionDTO section;
    private ClientDTO client;
    private LocalDateTime dateOfTicketGenerated;
    private StatusOfTicket statusOfTicket;
    private ListOfCompanies listOfCompanies;
}