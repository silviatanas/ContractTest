package com.silviatanas.project.contract.api;

import java.util.List;

public interface ContractManagement {
    public void addContract(Contract contract);
    public void removeContract(int contractID);
    public List<Contract> listContracts();
    public Contract getContractByID(int contractID);
    public void updateContract(int contractId, Contract contract);
}
