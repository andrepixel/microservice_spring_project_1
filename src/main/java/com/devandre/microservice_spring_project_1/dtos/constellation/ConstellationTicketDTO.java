package com.devandre.microservice_spring_project_1.dtos.constellation;

import com.devandre.microservice_spring_project_1.shared.enums.ListOfCompanies;
import com.devandre.microservice_spring_project_1.shared.enums.StatusOfTicket;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

abstract class TicketDTO {
    private UUID id;
    private SectionDTO section;
    private ClientDTO client;
    private LocalDateTime dateOfTicketGenerated;
    private StatusOfTicket statusOfTicket;
    private ListOfCompanies listOfCompanies;

    public TicketDTO(
            UUID id,
            SectionDTO section,
            ClientDTO client,
            LocalDateTime dateOfTicketGenerated,
            StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies
    ) {
        this.id = id;
        this.section = section;
        this.client = client;
        this.dateOfTicketGenerated = dateOfTicketGenerated;
        this.statusOfTicket = statusOfTicket;
        this.listOfCompanies = listOfCompanies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketDTO ticketDTO = (TicketDTO) o;
        return Objects.equals(
                id,
                ticketDTO.id
        ) && Objects.equals(
                section,
                ticketDTO.section
        ) && Objects.equals(
                client,
                ticketDTO.client
        ) && Objects.equals(
                dateOfTicketGenerated,
                ticketDTO.dateOfTicketGenerated
        ) && statusOfTicket == ticketDTO.statusOfTicket && listOfCompanies == ticketDTO.listOfCompanies;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                section,
                client,
                dateOfTicketGenerated,
                statusOfTicket,
                listOfCompanies
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public SectionDTO getSection() {
        return section;
    }

    public void setSection(SectionDTO section) {
        this.section = section;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public LocalDateTime getDateOfTicketGenerated() {
        return dateOfTicketGenerated;
    }

    public void setDateOfTicketGenerated(LocalDateTime dateOfTicketGenerated) {
        this.dateOfTicketGenerated = dateOfTicketGenerated;
    }

    public StatusOfTicket getStatusOfTicket() {
        return statusOfTicket;
    }

    public void setStatusOfTicket(StatusOfTicket statusOfTicket) {
        this.statusOfTicket = statusOfTicket;
    }

    public ListOfCompanies getListOfCompanies() {
        return listOfCompanies;
    }

    public void setListOfCompanies(ListOfCompanies listOfCompanies) {
        this.listOfCompanies = listOfCompanies;
    }

    @Override
    public String toString() {
        return "TicketDTO{" +
                "id=" + id +
                ", section=" + section +
                ", client=" + client +
                ", dateOfTicketGenerated=" + dateOfTicketGenerated +
                ", statusOfTicket=" + statusOfTicket +
                ", listOfCompanies=" + listOfCompanies +
                '}';
    }
}