package com.devandre.microservice_spring_project_1.dtos;

import com.devandre.microservice_spring_project_1.utils.enums.ClassificationMovie;
import com.devandre.microservice_spring_project_1.utils.enums.TypeOfMovie;
import lombok.Data;

@Data
public class MovieDTO {
    private String name;
    private String author;
    private String year;
    private String company;
    private TypeOfMovie typeOfMovie;
    private ClassificationMovie classificationMovie;
}
