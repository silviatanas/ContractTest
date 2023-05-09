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
    List<Contract> contractList;

    @Override
    public void addContract(Contract contract) {
        contractList.add(contract);
    }

    @Override
    public void removeContract(int contractID) {
        contractList.remove(contractID);
    }

    @Override
    public List<Contract> listContracts() {
        return contractList;
    }

    @Override
    public Contract getContractByID(int contractID) {
        return contractList.get(contractID);
    }

    @Override
    public void updateContract(int contractID, Contract contract) {
        contractList.set(contractID, contract);
    }
}
