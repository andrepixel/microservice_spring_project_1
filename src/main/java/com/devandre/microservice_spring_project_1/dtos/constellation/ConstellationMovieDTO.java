package com.devandre.microservice_spring_project_1.dtos.constellation;

import com.devandre.microservice_spring_project_1.shared.enums.ClassificationMovie;
import com.devandre.microservice_spring_project_1.shared.enums.TypeOfMovie;

import java.util.Objects;

abstract class MovieDTO {
    private String name;
    private String author;
    private String year;
    private String company;
    private String resume;
    private String[] movieCast;
    private TypeOfMovie[] typeOfMovie;
    private ClassificationMovie classificationMovie;


    public MovieDTO() {
    }

    public MovieDTO(
            String name,
            String author,
            String year,
            String company,
            String resume,
            String[] movieCast,
            TypeOfMovie[] typeOfMovie,
            ClassificationMovie classificationMovie
    ) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.company = company;
        this.resume = resume;
        this.movieCast = movieCast;
        this.typeOfMovie = typeOfMovie;
        this.classificationMovie = classificationMovie;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getResume() {
        return this.resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String[] getMovieCast() {
        return this.movieCast;
    }

    public void setMovieCast(String[] movieCast) {
        this.movieCast = movieCast;
    }

    public TypeOfMovie[] getTypeOfMovie() {
        return this.typeOfMovie;
    }

    public void setTypeOfMovie(TypeOfMovie[] typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }

    public ClassificationMovie getClassificationMovie() {
        return this.classificationMovie;
    }

    public void setClassificationMovie(ClassificationMovie classificationMovie) {
        this.classificationMovie = classificationMovie;
    }

    public MovieDTO name(String name) {
        setName(name);
        return this;
    }

    public MovieDTO author(String author) {
        setAuthor(author);
        return this;
    }

    public MovieDTO year(String year) {
        setYear(year);
        return this;
    }

    public MovieDTO company(String company) {
        setCompany(company);
        return this;
    }

    public MovieDTO resume(String resume) {
        setResume(resume);
        return this;
    }

    public MovieDTO movieCast(String[] movieCast) {
        setMovieCast(movieCast);
        return this;
    }

    public MovieDTO typeOfMovie(TypeOfMovie[] typeOfMovie) {
        setTypeOfMovie(typeOfMovie);
        return this;
    }

    public MovieDTO classificationMovie(ClassificationMovie classificationMovie) {
        setClassificationMovie(classificationMovie);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MovieDTO)) {
            return false;
        }
        MovieDTO movieDTO = (MovieDTO) o;
        return Objects.equals(
                name,
                movieDTO.name
        ) && Objects.equals(
                author,
                movieDTO.author
        ) && Objects.equals(
                year,
                movieDTO.year
        ) && Objects.equals(
                company,
                movieDTO.company
        ) && Objects.equals(
                resume,
                movieDTO.resume
        ) && Objects.equals(
                movieCast,
                movieDTO.movieCast
        ) && Objects.equals(
                typeOfMovie,
                movieDTO.typeOfMovie
        ) && Objects.equals(
                classificationMovie,
                movieDTO.classificationMovie
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                author,
                year,
                company,
                resume,
                movieCast,
                typeOfMovie,
                classificationMovie
        );
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", author='" + getAuthor() + "'" +
                ", year='" + getYear() + "'" +
                ", company='" + getCompany() + "'" +
                ", resume='" + getResume() + "'" +
                ", movieCast='" + getMovieCast() + "'" +
                ", typeOfMovie='" + getTypeOfMovie() + "'" +
                ", classificationMovie='" + getClassificationMovie() + "'" +
                "}";
    }
}
