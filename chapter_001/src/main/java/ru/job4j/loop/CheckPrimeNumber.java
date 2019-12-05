package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = finish > 1;
        for (int i = 2; i < finish && finish > 1; i++) {
            if (finish % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}