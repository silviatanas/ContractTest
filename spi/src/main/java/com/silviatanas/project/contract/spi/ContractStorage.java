package com.silviatanas.project.contract.spi;

public interface ContractStorage {
    public void storeContract(Contract contract);
    public void listContract(Contract contract);
    public void getByID(); // ?
}
