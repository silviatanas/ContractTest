package com.silviatanas.project.contract.impl;

import com.silviatanas.project.contract.api.Contract;
import com.silviatanas.project.contract.api.ContractManagement;

import java.util.List;
import java.util.ServiceLoader;

/**
 * Implementation for Contract management methods
 */
public class ContractManagementImpl implements ContractManagement {
    ServiceLoader<ContractManagement> serviceLoader = ServiceLoader.load(ContractManagement.class);

    @Override
    public void addContract(Contract contract) {

    }

    @Override
    public void removeContract(int contractID) {

    }

    @Override
    public List<Contract> listContracts() {
        return null;
    }

    @Override
    public Contract getContractByID(int contractID) {
        return null;
    }

    @Override
    public void updateContract(Contract contract) {

    }
}
