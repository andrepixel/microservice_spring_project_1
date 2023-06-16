package com.devandre.microservice_spring_project_1.dtos;

import com.devandre.microservice_spring_project_1.utils.enums.ClassificationMovie;
import com.devandre.microservice_spring_project_1.utils.enums.TypeOfMovie;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
    private String name;
    private String author;
    private String year;
    private String company;
    private String resume;
    private String[] movieCast;
    private TypeOfMovie[] typeOfMovie;
    private ClassificationMovie classificationMovie;
}
