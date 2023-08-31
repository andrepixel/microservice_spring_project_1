package com.devandre.microservice_spring_project_1.dtos.ryujin;

import com.devandre.microservice_spring_project_1.shared.dtos.ClientDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.SectionDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.TicketDTO;
import com.devandre.microservice_spring_project_1.shared.enums.ListOfCompanies;
import com.devandre.microservice_spring_project_1.shared.enums.StatusOfTicket;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class FreestarTicketDTO extends TicketDTO {
    private String companyGenerateTicket;

    public FreestarTicketDTO(
            UUID id,
            SectionDTO section,
            ClientDTO client,
            LocalDateTime dateOfTicketGenerated,
            StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies,
            String companyGenerateTicket
    ) {
        super(
                id,
                section,
                client,
                dateOfTicketGenerated,
                statusOfTicket,
                listOfCompanies
        );
        this.companyGenerateTicket = companyGenerateTicket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FreestarTicketDTO that = (FreestarTicketDTO) o;
        return Objects.equals(
                companyGenerateTicket,
                that.companyGenerateTicket
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                super.hashCode(),
                companyGenerateTicket
        );
    }

    public String getCompanyGenerateTicket() {
        return companyGenerateTicket;
    }

    public void setCompanyGenerateTicket(String companyGenerateTicket) {
        this.companyGenerateTicket = companyGenerateTicket;
    }

    @Override
    public String toString() {
        return "FreestarTicketDTO{" +
                "companyGenerateTicket='" + companyGenerateTicket + '\'' +
                '}';
    }
}