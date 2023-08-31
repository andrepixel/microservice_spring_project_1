package com.devandre.microservice_spring_project_1.shared.dtos;

import java.util.Objects;

abstract class ClientDTO {
    private String name;
    private String age;
    private String email;
    private String[] phones;
    private String cep;
    private AddressDTO address;


    public ClientDTO() {
    }

    public ClientDTO(
            String name,
            String age,
            String email,
            String[] phones,
            String cep,
            AddressDTO address
    ) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phones = phones;
        this.cep = cep;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getPhones() {
        return this.phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public AddressDTO getAddress() {
        return this.address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public ClientDTO name(String name) {
        setName(name);
        return this;
    }

    public ClientDTO age(String age) {
        setAge(age);
        return this;
    }

    public ClientDTO email(String email) {
        setEmail(email);
        return this;
    }

    public ClientDTO phones(String[] phones) {
        setPhones(phones);
        return this;
    }

    public ClientDTO cep(String cep) {
        setCep(cep);
        return this;
    }

    public ClientDTO address(AddressDTO address) {
        setAddress(address);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ClientDTO)) {
            return false;
        }
        ClientDTO clientDTO = (ClientDTO) o;
        return Objects.equals(
                name,
                clientDTO.name
        ) && Objects.equals(
                age,
                clientDTO.age
        ) && Objects.equals(
                email,
                clientDTO.email
        ) && Objects.equals(
                phones,
                clientDTO.phones
        ) && Objects.equals(
                cep,
                clientDTO.cep
        ) && Objects.equals(
                address,
                clientDTO.address
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                age,
                email,
                phones,
                cep,
                address
        );
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", email='" + getEmail() + "'" +
                ", phones='" + getPhones() + "'" +
                ", cep='" + getCep() + "'" +
                ", address='" + getAddress() + "'" +
                "}";
    }

}
