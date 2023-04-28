package com.silviatanas.project.contract.spi;

import java.util.List;

public interface ContractStorage {
    public void storeContract(Contract contract);
    public List<Contract> listContract();
    public Contract getByID(int contractID);
}
