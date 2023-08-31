package com.devandre.microservice_spring_project_1.dtos.freestar;

import com.devandre.microservice_spring_project_1.shared.dtos.ClientDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.SectionDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.TicketDTO;
import com.devandre.microservice_spring_project_1.shared.enums.ListOfCompanies;
import com.devandre.microservice_spring_project_1.shared.enums.StatusOfTicket;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class ConstellationTicketDTO extends TicketDTO {
    private UUID tokenGenerated;

    public ConstellationTicketDTO(
            UUID id,
            SectionDTO section,
            ClientDTO client,
            LocalDateTime dateOfTicketGenerated,
            StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies,
            UUID tokenGenerated
    ) {
        super(
                id,
                section,
                client,
                dateOfTicketGenerated,
                statusOfTicket,
                listOfCompanies
        );
        this.tokenGenerated = tokenGenerated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConstellationTicketDTO that = (ConstellationTicketDTO) o;
        return Objects.equals(
                tokenGenerated,
                that.tokenGenerated
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                super.hashCode(),
                tokenGenerated
        );
    }

    public UUID getTokenGenerated() {
        return tokenGenerated;
    }

    public void setTokenGenerated(UUID tokenGenerated) {
        this.tokenGenerated = tokenGenerated;
    }

    @Override
    public String toString() {
        return "ConstellationTicketDTO{" +
                "tokenGenerated=" + tokenGenerated +
                '}';
    }
}