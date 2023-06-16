package com.devandre.microservice_spring_project_1.dtos;

import java.time.LocalDateTime;

import com.devandre.microservice_spring_project_1.utils.enums.State;
import com.devandre.microservice_spring_project_1.utils.enums.TypeSection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SectionDTO {
    private String codeSection;
    private Integer quantityOfArmChair;
    private MovieDTO movie;
    private LocalDateTime dateOfSection;
    private String localOfSection;
    private State state;
    private Boolean isPreLaunch;
    private TypeSection typeSection;
}
