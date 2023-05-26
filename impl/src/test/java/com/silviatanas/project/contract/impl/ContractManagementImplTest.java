package com.silviatanas.project.contract.impl;

import com.silviatanas.project.contract.api.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContractManagementImplTest {
    private Contract c1;
    private Contract c2;
    private ContractManagement mng;
    private Customer cust;
    private Date date;
    private List<Product> prodList;

    @BeforeEach
    public void init() {
        c1 = new Contract();
        c2 = new Contract();
        mng = new ContractManagementImpl();
        cust = new Customer();
        date = new Date();
        prodList = new ArrayList<>();
    }

    @Test
    void setLogger() {
        Logger logger = LogManager.getLogger(ContractManagementImplTest.class);
        logger.info("test");
        logger.info(c1);
        logger.info(c2);
    }


    @Test
    void addGetContract() {
        mng.addContract(c1);
        c2 = mng.getContractByID(c1.getContractID());
        assertEquals(c1, c2);

        c1.setStartDate(date);
        c1.setEndDate(date);
        c1.setCustomer(cust);
        c1.setProductsList(prodList);
        assertNotEquals(c1, c2);

        c2.setStartDate(date);
        c2.setEndDate(date);
        c2.setCustomer(cust);
        c2.setProductsList(prodList);
        assertEquals(c1, c2);

        c1 = new Contract();
        c2 = new Contract();

        c1.setStartDate(date);
        c1.setEndDate(date);
        c1.setCustomer(cust);
        c1.setProductsList(prodList);

        c2.setStartDate(date);
        c2.setEndDate(date);
        c2.setCustomer(cust);
        c2.setProductsList(prodList);
        assertNotEquals(c1, c2);
    }

    @Test
    void removeContract() {
        mng.addContract(c1);
        try {
            mng.removeContract(c1.getContractID());
        } catch (NonExistentContractException e) {
            throw new RuntimeException(e);
        }
        assertNull(mng.getContractByID(c1.getContractID()));
    }

    @Test
    void listContracts() {
        mng.addContract(c1);
        mng.addContract(c2);
        assertNotNull(mng.listContracts());
    }

    @Test
    void updateContract() {
        mng.addContract(c2);
        c2.setCustomer(cust);
        try {
            mng.updateContract(c2);
        } catch (NonExistentContractException e) {
            fail("Unexpected exception was thrown");
        }
        assertEquals(c2, mng.getContractByID(c2.getContractID()));
    }
}