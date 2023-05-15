package com.silviatanas.project.contract.api;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return productCode == products.productCode && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return this.productCode;
    }
}
