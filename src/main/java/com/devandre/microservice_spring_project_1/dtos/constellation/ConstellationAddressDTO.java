package com.devandre.microservice_spring_project_1.dtos.constellation;

import com.devandre.microservice_spring_project_1.shared.enums.State;

import java.util.Objects;

abstract class AddressDTO {
    private String typeLocal;
    private String number;
    private String city;
    private State state;

    public AddressDTO() {
    }

    public AddressDTO(String typeLocal, String number, String city, State state) {
        this.typeLocal = typeLocal;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    public String getTypeLocal() {
        return this.typeLocal;
    }

    public void setTypeLocal(String typeLocal) {
        this.typeLocal = typeLocal;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public AddressDTO typeLocal(String typeLocal) {
        setTypeLocal(typeLocal);
        return this;
    }

    public AddressDTO number(String number) {
        setNumber(number);
        return this;
    }

    public AddressDTO city(String city) {
        setCity(city);
        return this;
    }

    public AddressDTO state(State state) {
        setState(state);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AddressDTO)) {
            return false;
        }
        AddressDTO addressDTO = (AddressDTO) o;
        return Objects.equals(typeLocal, addressDTO.typeLocal) && Objects.equals(number, addressDTO.number) && Objects.equals(city, addressDTO.city) && Objects.equals(state, addressDTO.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeLocal, number, city, state);
    }

    @Override
    public String toString() {
        return "{" +
            " typeLocal='" + getTypeLocal() + "'" +
            ", number='" + getNumber() + "'" +
            ", city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            "}";
    }
}
