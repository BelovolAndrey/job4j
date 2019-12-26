package ru.job4j.oop;

/**
 * В классе User полем объекта являются name и age
 * В методе canDrive can является локальной переменной
 */
public class User {
    private String name;
    private int age;

    public boolean canDrive() {
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}