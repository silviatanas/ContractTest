package com.silviatanas.project.contract.impl;

import com.silviatanas.project.contract.api.Contract;
import com.silviatanas.project.contract.api.ContractManagement;
import com.silviatanas.project.contract.spi.ContractStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Implementation for Contract management methods
 */
public class ContractManagementImpl implements ContractManagement {
    ServiceLoader<ContractStorage> serviceLoader = ServiceLoader.load(ContractStorage.class);
    ContractStorage storage = serviceLoader.iterator().next();

    @Override
    public void addContract(Contract contract) {
        storage.storeContract(contract);
    }

    @Override
    public void removeContract(int contractID) {
       storage.removeContract(contractID);
    }

    @Override
    public List<Contract> listContracts() {
        return storage.listContracts();
    }

    @Override
    public Contract getContractByID(int contractID) {
        return storage.getByID(contractID);
    }

    @Override
    public void updateContract(int contractID, Contract contract) {
        storage.removeContract(contractID);
        storage.storeContract(storage.getByID(contractID));
    }
}
