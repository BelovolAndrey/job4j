package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money > price ? money - price : 0;
        for (int index = 0; index < COINS.length; index++) {
            while (balance >= COINS[index]) {
                balance -= COINS[index];
                rsl[size++] = COINS[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}