package com.devandre.microservice_spring_project_1.dtos.constellation;

import com.devandre.microservice_spring_project_1.shared.enums.State;
import com.devandre.microservice_spring_project_1.shared.enums.TypeSection;

import java.time.LocalDateTime;
import java.util.Objects;

abstract class SectionDTO {
    private String codeSection;
    private Integer quantityOfArmChair;
    private MovieDTO movie;
    private LocalDateTime dateOfSection;
    private String localOfSection;
    private State state;
    private Boolean isPreLaunch;
    private TypeSection typeSection;


    public SectionDTO() {
    }

    public SectionDTO(
            String codeSection,
            Integer quantityOfArmChair,
            MovieDTO movie,
            LocalDateTime dateOfSection,
            String localOfSection,
            State state,
            Boolean isPreLaunch,
            TypeSection typeSection
    ) {
        this.codeSection = codeSection;
        this.quantityOfArmChair = quantityOfArmChair;
        this.movie = movie;
        this.dateOfSection = dateOfSection;
        this.localOfSection = localOfSection;
        this.state = state;
        this.isPreLaunch = isPreLaunch;
        this.typeSection = typeSection;
    }

    public String getCodeSection() {
        return this.codeSection;
    }

    public void setCodeSection(String codeSection) {
        this.codeSection = codeSection;
    }

    public Integer getQuantityOfArmChair() {
        return this.quantityOfArmChair;
    }

    public void setQuantityOfArmChair(Integer quantityOfArmChair) {
        this.quantityOfArmChair = quantityOfArmChair;
    }

    public MovieDTO getMovie() {
        return this.movie;
    }

    public void setMovie(MovieDTO movie) {
        this.movie = movie;
    }

    public LocalDateTime getDateOfSection() {
        return this.dateOfSection;
    }

    public void setDateOfSection(LocalDateTime dateOfSection) {
        this.dateOfSection = dateOfSection;
    }

    public String getLocalOfSection() {
        return this.localOfSection;
    }

    public void setLocalOfSection(String localOfSection) {
        this.localOfSection = localOfSection;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Boolean isIsPreLaunch() {
        return this.isPreLaunch;
    }

    public Boolean getIsPreLaunch() {
        return this.isPreLaunch;
    }

    public void setIsPreLaunch(Boolean isPreLaunch) {
        this.isPreLaunch = isPreLaunch;
    }

    public TypeSection getTypeSection() {
        return this.typeSection;
    }

    public void setTypeSection(TypeSection typeSection) {
        this.typeSection = typeSection;
    }

    public SectionDTO codeSection(String codeSection) {
        setCodeSection(codeSection);
        return this;
    }

    public SectionDTO quantityOfArmChair(Integer quantityOfArmChair) {
        setQuantityOfArmChair(quantityOfArmChair);
        return this;
    }

    public SectionDTO movie(MovieDTO movie) {
        setMovie(movie);
        return this;
    }

    public SectionDTO dateOfSection(LocalDateTime dateOfSection) {
        setDateOfSection(dateOfSection);
        return this;
    }

    public SectionDTO localOfSection(String localOfSection) {
        setLocalOfSection(localOfSection);
        return this;
    }

    public SectionDTO state(State state) {
        setState(state);
        return this;
    }

    public SectionDTO isPreLaunch(Boolean isPreLaunch) {
        setIsPreLaunch(isPreLaunch);
        return this;
    }

    public SectionDTO typeSection(TypeSection typeSection) {
        setTypeSection(typeSection);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SectionDTO)) {
            return false;
        }
        SectionDTO sectionDTO = (SectionDTO) o;
        return Objects.equals(
                codeSection,
                sectionDTO.codeSection
        ) && Objects.equals(
                quantityOfArmChair,
                sectionDTO.quantityOfArmChair
        ) && Objects.equals(
                movie,
                sectionDTO.movie
        ) && Objects.equals(
                dateOfSection,
                sectionDTO.dateOfSection
        ) && Objects.equals(
                localOfSection,
                sectionDTO.localOfSection
        ) && Objects.equals(
                state,
                sectionDTO.state
        ) && Objects.equals(
                isPreLaunch,
                sectionDTO.isPreLaunch
        ) && Objects.equals(
                typeSection,
                sectionDTO.typeSection
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                codeSection,
                quantityOfArmChair,
                movie,
                dateOfSection,
                localOfSection,
                state,
                isPreLaunch,
                typeSection
        );
    }

    @Override
    public String toString() {
        return "{" +
                " codeSection='" + getCodeSection() + "'" +
                ", quantityOfArmChair='" + getQuantityOfArmChair() + "'" +
                ", movie='" + getMovie() + "'" +
                ", dateOfSection='" + getDateOfSection() + "'" +
                ", localOfSection='" + getLocalOfSection() + "'" +
                ", state='" + getState() + "'" +
                ", isPreLaunch='" + isIsPreLaunch() + "'" +
                ", typeSection='" + getTypeSection() + "'" +
                "}";
    }
}
