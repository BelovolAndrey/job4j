package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int a, int b, int c) {
        return max(a, b) > c ? max(a, b) : c;
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, b, c) > d ? max(a, b, c) : d;
    }
}