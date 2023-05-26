package com.silviatanas.project.contract.api;

import java.util.List;

public interface ContractManagement {
    public void addContract(Contract contract);
    public void removeContract(int contractID) throws NonExistentContractException;
    public List<Contract> listContracts();
    public Contract getContractByID(int contractID);
    public void updateContract(Contract contract) throws NonExistentContractException;
}
