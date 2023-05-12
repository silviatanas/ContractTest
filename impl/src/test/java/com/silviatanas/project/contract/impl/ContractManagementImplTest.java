package com.silviatanas.project.contract.impl;

import com.silviatanas.project.contract.api.Contract;
import com.silviatanas.project.contract.api.ContractManagement;
import com.silviatanas.project.contract.api.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractManagementImplTest {
    Contract c1;
    Contract c2;
    ContractManagement mng;
    Customer cust;

    @BeforeEach
    public void init() {
        c1 = new Contract();
        c2 = new Contract();
        mng = new ContractManagementImpl();
        cust = new Customer();
    }


    @Test
    void addGetContract() {
        c1.setContractID(1);
        mng.addContract(c1);
        c2 = mng.getContractByID(c1.getContractID());
        assertEquals(c1, c2);
    }

    @Test
    void removeContract() {
        mng.addContract(c1);
        mng.removeContract(c1.getContractID());
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
        c2.setContractID(1);
        mng.addContract(c2);
        c2.setCustomer(cust);
        mng.updateContract(c2);
        assertEquals(c2, mng.getContractByID(c2.getContractID()));
    }
}