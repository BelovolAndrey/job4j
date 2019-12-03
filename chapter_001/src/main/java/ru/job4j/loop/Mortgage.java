package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double realAmount = amount * (1 + percent / 100);
        do {
            amount = (int) (realAmount - salary);
            realAmount = amount * (1 + percent / 100);
            year++;

        } while (realAmount > 0);
        return year;
    }
}