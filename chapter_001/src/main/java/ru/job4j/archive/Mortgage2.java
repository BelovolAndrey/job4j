package ru.job4j.archive;

public class Mortgage2 {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        boolean isComplite = false;
        double realAmount = amount * (1 + percent / 100);
        while (!isComplite) {
            if (realAmount > 0) {
                if (salary - realAmount < 0) {
                    realAmount -= salary;
                    year++;
                } else {
                    year++;
                    isComplite = true;
                }
            } else {
                isComplite = true;
            }
        }
        return year;
    }
}