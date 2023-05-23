package com.silviatanas.project.contract.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContractTest {
    Contract c1;
    Contract c2;
    Date date;
    Calendar cal;
    Customer cust;
    List<Product> prod;

    @BeforeEach
    public void init() {
        c1 = new Contract();
        c2 = new Contract();
        cal = Calendar.getInstance();
        cal.set(2023, Calendar.DECEMBER,12);
        date = cal.getTime();
        cust = new Customer();
    }

    @Test
    void testEqualsHash() {
        c1.setContractID(1);
        c1.setStartDate(date);
        c1.setEndDate(date);
        c1.setCustomer(cust);
        c1.setProductsList(prod);

        c2.setContractID(1);
        c2.setStartDate(date);
        c2.setEndDate(date);
        c2.setCustomer(cust);
        c2.setProductsList(prod);

        assertEquals(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());

        c2.setContractID(2);
        assertNotEquals(c1, c2);
    }
}