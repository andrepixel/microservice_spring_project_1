package com.devandre.microservice_spring_project_1.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class TicketDTO {
    private UUID id;
    private SectionDTO section;
    private ClientDTO client;
    private String hourOfLocal;
    private String local;
    private Boolean isVIP;
}