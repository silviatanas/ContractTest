package com.silviatanas.project.contract.api;

import java.util.Objects;

public class Customer {
    private String name;
    private int customerID;
    private String address;
    private ResponsiblePerson responsiblePerson;

    public Customer() {
    }

    public Customer(String name, int customerID, String address, ResponsiblePerson responsiblePerson) {
        this.name = name;
        this.customerID = customerID;
        this.address = address;
        this.responsiblePerson = responsiblePerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ResponsiblePerson getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(ResponsiblePerson responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerID == customer.customerID && Objects.equals(name, customer.name) && Objects.equals(address, customer.address) && Objects.equals(responsiblePerson, customer.responsiblePerson);
    }

    @Override
    public int hashCode() {
        return this.customerID;
    }
}
