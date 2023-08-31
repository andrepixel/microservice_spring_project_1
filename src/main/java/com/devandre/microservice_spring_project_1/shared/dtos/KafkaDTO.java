package com.devandre.microservice_spring_project_1.dtos;

import java.util.Objects;

public class KafkaDTO {
    public TicketDTO ticketDTO;

    @Override
    public String toString() {
        return "KafkaDTO{" + "ticketDTO=" + ticketDTO + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        KafkaDTO kafkaDTO = (KafkaDTO) o;
        return Objects.equals(ticketDTO, kafkaDTO.ticketDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketDTO);
    }

    public TicketDTO getTicketDTO() {
        return ticketDTO;
    }

    public void setTicketDTO(TicketDTO ticketDTO) {
        this.ticketDTO = ticketDTO;
    }
}
