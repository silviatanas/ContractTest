package com.silviatanas.project.contract.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer c1;
    Customer c2;
    ResponsiblePerson resp;

    @BeforeEach
    public void init() {
        c1 = new Customer();
        c2 = new Customer();
        resp = new ResponsiblePerson();
    }

    @Test
    void testEqualsHash() {
        c1.setCustomerID(1);
        c1.setName("testName");
        c1.setAddress("testAddress");
        c1.setResponsiblePerson(resp);

        c2.setCustomerID(1);
        c2.setName("testName");
        c2.setAddress("testAddress");
        c2.setResponsiblePerson(resp);

        assertEquals(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());

        c2.setCustomerID(2);
        assertNotEquals(c1, c2);
    }
}