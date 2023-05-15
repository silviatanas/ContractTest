package com.silviatanas.project.contract.api;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Contract {
    private int contractID;
    private Date startDate;
    private Date endDate;
    private Customer customer;
    private List<Products> productsList;

    public Contract() {
    }

    public Contract(int contractID, Date startDate, Date endDate, Customer customer, List<Products> productsList) {
        this.contractID = contractID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.productsList = productsList;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.silviatanas.project.contract.api.Customer customer) {
        this.customer = customer;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return contractID == contract.contractID && Objects.equals(startDate, contract.startDate) && Objects.equals(endDate, contract.endDate) && Objects.equals(customer, contract.customer) && Objects.equals(productsList, contract.productsList);
    }
}
