package com.silviatanas.project.contract.api;

public class NonExistentContractException extends Exception {
    public NonExistentContractException(String message) {
        super(message);
    }
}
