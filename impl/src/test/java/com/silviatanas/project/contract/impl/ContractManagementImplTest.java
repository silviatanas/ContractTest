package com.silviatanas.project.contract.impl;

import com.silviatanas.project.contract.api.Contract;
import com.silviatanas.project.contract.api.ContractManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractManagementImplTest {
    Contract c1;
    Contract c2;
    Contract c3;
    ContractManagement mng;

    @BeforeEach
    public void init() {
        c1 = new Contract();
        c2 = new Contract();
        c3 = new Contract();
        mng = new ContractManagementImpl();
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
        try {
        mng.addContract(c1);
        mng.removeContract(c1.getContractID());
        assertNull(c1);
        } catch ()
    }

    @Test
    void listContracts() {
        mng.addContract(c1);
        mng.addContract(c2);
        assertNotNull(mng.listContracts());
    }

    @Test
    void updateContract() {
        c1.setContractID(1);
        c2.setContractID(2);
        mng.updateContract(c2.getContractID(), c1);
        assertEquals(c1, c2);
    }
}