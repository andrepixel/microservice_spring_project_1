package com.devandre.microservice_spring_project_1.dtos;

import com.devandre.microservice_spring_project_1.utils.enums.State;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private String typeLocal;
    private String number;
    private String city;
    private State state;
}
