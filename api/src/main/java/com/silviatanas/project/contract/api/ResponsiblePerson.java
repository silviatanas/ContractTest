package com.silviatanas.project.contract.api;

import java.util.Objects;

public class ResponsiblePerson {
    private String name;
    private String email;
    private String phone;

    public ResponsiblePerson() {
    }

    public ResponsiblePerson(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsiblePerson that = (ResponsiblePerson) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        String id = name + email + phone;
        return id.hashCode();
    }
}
