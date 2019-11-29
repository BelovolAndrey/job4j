package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        // if ...
        if (first > second && first > third) {
            result = first;
            return result;
        } else if (second > first && second > third) {
            result = second;
            return result;
        } else {
            return third;
        }
    }
}