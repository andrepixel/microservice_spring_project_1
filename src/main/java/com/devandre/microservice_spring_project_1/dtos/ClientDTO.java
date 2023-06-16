package com.devandre.microservice_spring_project_1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private String name;
    private String age;
    private String email;
    private String[] phones;
    private String cep;
    private AddressDTO address;
}
