package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        CheckPrimeNumber cpn = new CheckPrimeNumber();
        for (int i = 2; i <= finish; i++) {
            if (cpn.check(i)) {
                count++;
            }
        }
        return count;
    }
}