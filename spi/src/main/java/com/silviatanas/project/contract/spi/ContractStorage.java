package com.silviatanas.project.contract.spi;

import com.silviatanas.project.contract.api.Contract;

import java.util.List;

/**
 * Interface for storing and retrieving contracts
 */

public interface ContractStorage {
    /**
     *
     * @param contract
     */
    public void storeContract(Contract contract);
    public void removeContract(int contractID);
    public List<Contract> listContracts();
    public Contract getByID(int contractID);
}
