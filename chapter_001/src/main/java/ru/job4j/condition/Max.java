package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int a, int b, int c) {
        int result = max(a, b);
        result = max(result, c);
        return result;
    }

    public static int max(int a, int b, int c, int d) {
        int result = max(a, b);
        result = max(result, c);
        result = max(result, d);
        return result;
    }
}