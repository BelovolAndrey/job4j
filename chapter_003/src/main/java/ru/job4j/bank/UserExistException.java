package ru.job4j.bank;

public class UserExistException extends RuntimeException {
    public UserExistException(String error) {
        super(error);
    }
}
