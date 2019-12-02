package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = false;
        if (finish == 0) {
            return false;
        }
        if (finish == 1) {
            return true;
        } else if (finish == 2) {
            return true;
        }
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0) {
                return false;
            }
        }
        return true;
    }
}