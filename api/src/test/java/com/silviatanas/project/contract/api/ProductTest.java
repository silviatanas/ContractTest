package com.silviatanas.project.contract.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product p1;
    Product p2;


    @BeforeEach
    public void init() {
        p1 = new Product();
        p2 = new Product();
    }

    @Test
    void testEqualsHash() {
        p1.setProductCode(1);
        p1.setName("1");

        p2.setProductCode(1);
        p2.setName("1");

        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());

        p2.setProductCode(2);
        assertNotEquals(p1, p2);
    }
}