package com.silviatanas.project.contract.impl;

import com.silviatanas.project.contract.api.Contract;
import com.silviatanas.project.contract.api.ContractManagement;
import com.silviatanas.project.contract.api.NonExistentContractException;
import com.silviatanas.project.contract.spi.ContractStorage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.ServiceLoader;

/**
 * Implementation for Contract management methods
 */
public class ContractManagementImpl implements ContractManagement {
    private static final Logger LOGGER = LogManager.getLogger(ContractManagementImpl.class);
    private ServiceLoader<ContractStorage> serviceLoader;
    private ContractStorage storage;

    public ContractManagementImpl() {
        serviceLoader = ServiceLoader.load(ContractStorage.class);
        storage = serviceLoader.iterator().next();
        LOGGER.info(storage);
    }

    @Override
    public void addContract(Contract contract) {
        storage.storeContract(contract);
    }

    @Override
    public void removeContract(int contractID) throws NonExistentContractException {
        if (storage.getByID(contractID) == null) {
            throw new NonExistentContractException("No contract with this ID");
        } else {
            storage.removeContract(contractID);
        }
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
    public void updateContract(Contract contract) throws NonExistentContractException {
        if (storage.getByID(contract.getContractID()) == null) {
            throw new NonExistentContractException("No contract with this ID");
        } else {
            storage.removeContract(contract.getContractID());
            storage.storeContract(contract);
        }
    }
}
