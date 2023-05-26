package com.silviatanas.project.contract.api;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Contract {
    private int contractID;
    private static int nextContractID = 1;
    private Date startDate;
    private Date endDate;
    private Customer customer;
    private List<Product> productList;

    public Contract() {
        this.contractID = nextContractID;
        nextContractID++;
    }

    @Deprecated
    public Contract(int contractID, Date startDate, Date endDate, Customer customer, List<Product> productList) {
        this.contractID = contractID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.productList = productList;
    }

    public Contract(Date startDate, Date endDate, Customer customer, List<Product> productList) {
        this.contractID = nextContractID;
        nextContractID++;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.productList = productList;
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

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductsList() {
        return productList;
    }

    public void setProductsList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return contractID == contract.contractID && Objects.equals(startDate, contract.startDate) && Objects.equals(endDate, contract.endDate) && Objects.equals(customer, contract.customer) && Objects.equals(productList, contract.productList);
    }

    @Override
    public int hashCode() {
        return this.contractID;
    }
}
