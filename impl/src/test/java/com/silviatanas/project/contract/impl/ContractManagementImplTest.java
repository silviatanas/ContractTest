package com.silviatanas.project.contract.impl;

import com.silviatanas.project.contract.api.Contract;
import com.silviatanas.project.contract.api.ContractManagement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractManagementImplTest {
    // declare objects used for all tests (Contract, ContractManagement)
    @BeforeAll
    void init() {
        // initialize previous objects
    }


    @Test
    void addGetContract() {
        // Rough example:
//        Contract c1 = new Contract();
//        c1.setContractID(1);
//        Contract c3 = new Contract();
//        c3.setContractID(0);
//        ContractManagement mgmt = new ContractManagementImpl();
//        mgmt.addContract(c1);
//        mgmt.addContract(c3);
//        Contract c2 = mgmt.getContractByID(c3.getContractID());
//        System.out.println(c3.getContractID());
//        assertEquals(c2, c3);

        // add 2 contracts with management
        // get contracts and compare
    }

    @Test
    void removeContract() {
        // add and remove?
        // assertNull
    }

    @Test
    void listContracts() {
        // assertNotNull to check if the list is not empty?
    }

    @Test
    void updateContract() {
        // assertEquals
        // updating contract with parameters of another
    }
}