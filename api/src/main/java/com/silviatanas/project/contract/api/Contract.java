package com.silviatanas.project.contract.api;

import java.util.Date;
import java.util.List;

public class Contract {
    // test commit main
    private int contractID;
    private Date startDate;
    private Date endDate;
    private String Customer;
    private List<Products> productsList;

    public Contract() {
    }

    public Contract(int contractID, Date startDate, Date endDate, String customer, List<Products> productsList) {
        this.contractID = contractID;
        this.startDate = startDate;
        this.endDate = endDate;
        Customer = customer;
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

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }
}
