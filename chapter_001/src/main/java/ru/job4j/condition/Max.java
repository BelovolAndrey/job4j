package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int a, int b, int c) {
        int result = 0;
        if (a > b && a > c) {
            result = a;
        }
        if (b > a && b > c) {
            result = b;
        }
        if (c > a && c > b) {
            result = c;
        }
        return result;
    }

    public static int max(int a, int b, int c, int d) {
        int result = 0;
        if (a > b && a > c && a > d) {
            result = a;
        }
        if (b > a && b > c && b > d) {
            result = b;
        }
        if (c > a && c > b && c > d) {
            result = c;
        }
        if (d > a && d > b && d > c) {
            result = d;
        }
        return result;
    }
}
