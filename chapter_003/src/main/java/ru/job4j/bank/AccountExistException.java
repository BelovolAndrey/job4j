package ru.job4j.bank;

public class AccountExistException extends RuntimeException {
    public AccountExistException(String error) {
        super(error);
    }
}
