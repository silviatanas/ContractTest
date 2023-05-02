package com.silviatanas.project.contract.api;

import java.util.List;

public interface ContractManagement {
    public void addContract(int contractID);
    public void removeContract(int contractID);
    public List<Contract> listContracts();
    public Contract getContractByID(int contractID);
    public void updateContract(Contract contract);
}
