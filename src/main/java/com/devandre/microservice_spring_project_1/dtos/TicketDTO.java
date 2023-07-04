package com.devandre.microservice_spring_project_1.dtos;

import com.devandre.microservice_spring_project_1.utils.enums.ListOfCompanies;
import com.devandre.microservice_spring_project_1.utils.enums.StatusOfTicket;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.Objects;

public class TicketDTO {
    private UUID id;
    private SectionDTO section;
    private ClientDTO client;
    private LocalDateTime dateOfTicketGenerated;
    private StatusOfTicket statusOfTicket;
    private ListOfCompanies listOfCompanies;


    public TicketDTO() {
    }

    public TicketDTO(UUID id, SectionDTO section, ClientDTO client, LocalDateTime dateOfTicketGenerated, StatusOfTicket statusOfTicket, ListOfCompanies listOfCompanies) {
        this.id = id;
        this.section = section;
        this.client = client;
        this.dateOfTicketGenerated = dateOfTicketGenerated;
        this.statusOfTicket = statusOfTicket;
        this.listOfCompanies = listOfCompanies;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public SectionDTO getSection() {
        return this.section;
    }

    public void setSection(SectionDTO section) {
        this.section = section;
    }

    public ClientDTO getClient() {
        return this.client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public LocalDateTime getDateOfTicketGenerated() {
        return this.dateOfTicketGenerated;
    }

    public void setDateOfTicketGenerated(LocalDateTime dateOfTicketGenerated) {
        this.dateOfTicketGenerated = dateOfTicketGenerated;
    }

    public StatusOfTicket getStatusOfTicket() {
        return this.statusOfTicket;
    }

    public void setStatusOfTicket(StatusOfTicket statusOfTicket) {
        this.statusOfTicket = statusOfTicket;
    }

    public ListOfCompanies getListOfCompanies() {
        return this.listOfCompanies;
    }

    public void setListOfCompanies(ListOfCompanies listOfCompanies) {
        this.listOfCompanies = listOfCompanies;
    }

    public TicketDTO id(UUID id) {
        setId(id);
        return this;
    }

    public TicketDTO section(SectionDTO section) {
        setSection(section);
        return this;
    }

    public TicketDTO client(ClientDTO client) {
        setClient(client);
        return this;
    }

    public TicketDTO dateOfTicketGenerated(LocalDateTime dateOfTicketGenerated) {
        setDateOfTicketGenerated(dateOfTicketGenerated);
        return this;
    }

    public TicketDTO statusOfTicket(StatusOfTicket statusOfTicket) {
        setStatusOfTicket(statusOfTicket);
        return this;
    }

    public TicketDTO listOfCompanies(ListOfCompanies listOfCompanies) {
        setListOfCompanies(listOfCompanies);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TicketDTO)) {
            return false;
        }
        TicketDTO ticketDTO = (TicketDTO) o;
        return Objects.equals(id, ticketDTO.id) && Objects.equals(section, ticketDTO.section) && Objects.equals(client, ticketDTO.client) && Objects.equals(dateOfTicketGenerated, ticketDTO.dateOfTicketGenerated) && Objects.equals(statusOfTicket, ticketDTO.statusOfTicket) && Objects.equals(listOfCompanies, ticketDTO.listOfCompanies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, section, client, dateOfTicketGenerated, statusOfTicket, listOfCompanies);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", section='" + getSection() + "'" +
            ", client='" + getClient() + "'" +
            ", dateOfTicketGenerated='" + getDateOfTicketGenerated() + "'" +
            ", statusOfTicket='" + getStatusOfTicket() + "'" +
            ", listOfCompanies='" + getListOfCompanies() + "'" +
            "}";
    }
}