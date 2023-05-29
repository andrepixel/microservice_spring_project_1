package com.devandre.microservice_spring_project_1.dtos;

import lombok.Data;

@Data
public class SectionDTO {
    private String codeSection;
    private int quantityOfArmChair;
    private MovieDTO movie;
}
