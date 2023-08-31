package com.devandre.microservice_spring_project_1.dtos.ucsec;

import com.devandre.microservice_spring_project_1.shared.dtos.ClientDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.SectionDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.TicketDTO;
import com.devandre.microservice_spring_project_1.shared.enums.ListOfCompanies;
import com.devandre.microservice_spring_project_1.shared.enums.StatusOfTicket;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class RyujinTicketDTO extends TicketDTO {
    private String companyGenerateTicket;
    private String localeGenerateTicket;

    public RyujinTicketDTO(
            UUID id,
            SectionDTO section,
            ClientDTO client,
            LocalDateTime dateOfTicketGenerated,
            StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies,
            String companyGenerateTicket,
            String localeGenerateTicket
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
        this.localeGenerateTicket = localeGenerateTicket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RyujinTicketDTO that = (RyujinTicketDTO) o;
        return Objects.equals(
                companyGenerateTicket,
                that.companyGenerateTicket
        ) && Objects.equals(
                localeGenerateTicket,
                that.localeGenerateTicket
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                super.hashCode(),
                companyGenerateTicket,
                localeGenerateTicket
        );
    }

    public String getCompanyGenerateTicket() {
        return companyGenerateTicket;
    }

    public void setCompanyGenerateTicket(String companyGenerateTicket) {
        this.companyGenerateTicket = companyGenerateTicket;
    }

    public String getLocaleGenerateTicket() {
        return localeGenerateTicket;
    }

    public void setLocaleGenerateTicket(String localeGenerateTicket) {
        this.localeGenerateTicket = localeGenerateTicket;
    }

    @Override
    public String toString() {
        return "RyujinTicketDTO{" +
                "companyGenerateTicket='" + companyGenerateTicket + '\'' +
                ", localeGenerateTicket='" + localeGenerateTicket + '\'' +
                '}';
    }
}