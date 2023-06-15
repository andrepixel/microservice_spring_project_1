package com.devandre.microservice_spring_project_1.dtos;

import com.devandre.microservice_spring_project_1.utils.enums.State;
import com.devandre.microservice_spring_project_1.utils.enums.TypeSection;
import lombok.Data;

@Data
public class SectionDTO {
    private String codeSection;
    private Integer quantityOfArmChair;
    private MovieDTO movie;
    private String hourOfSection;
    private String localOfSection;
    private State state;
    private Boolean isPreLaunch;
    private TypeSection typeSection;
}
