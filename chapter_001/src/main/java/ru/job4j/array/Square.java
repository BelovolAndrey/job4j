package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        int count = 1;
        for (int i = 0; i < rst.length; i++) {
            rst[i] = count * count;
            count++;
        }
        return rst;
    }
}
