package ru.job4j.bank;

public class UserNotExistException extends RuntimeException {
    public UserNotExistException(String error) {
        super(error);
    }
}
