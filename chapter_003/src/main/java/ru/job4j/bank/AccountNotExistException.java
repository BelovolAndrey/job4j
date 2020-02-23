package ru.job4j.bank;

public class AccountNotExistException extends RuntimeException {
    public AccountNotExistException(String error) {
        super(error);
    }
}