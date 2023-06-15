package com.devandre.microservice_spring_project_1.dtos;

import com.devandre.microservice_spring_project_1.utils.enums.State;
import lombok.Data;

@Data
public class AddressDTO {
    private String typeLocal;
    private String number;
    private String city;
    private State state;
}
