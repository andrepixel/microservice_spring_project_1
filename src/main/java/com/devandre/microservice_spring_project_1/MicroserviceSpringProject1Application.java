package com.devandre.microservice_spring_project_1;

import com.devandre.microservice_spring_project_1.services.GeneratedTicketService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@AutoConfiguration
@EnableScheduling
public class MicroserviceSpringProject1Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSpringProject1Application.class, args);
    }
}
