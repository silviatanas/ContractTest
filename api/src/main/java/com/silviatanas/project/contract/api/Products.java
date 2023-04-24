package com.silviatanas.project.contract.api;

public class Products {
    private String name;
    private int productCode;

    public Products() {
    }

    public Products(String name, int productCode) {
        this.name = name;
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
}
