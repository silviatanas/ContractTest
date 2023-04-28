package com.silviatanas.project.contract.spi;

import java.util.List;

public interface ContractStorage {
    public void storeContract(Contract contract);
    public void listContract(List<Contract> contractList);
    public void getByID(Contract contract);
}
