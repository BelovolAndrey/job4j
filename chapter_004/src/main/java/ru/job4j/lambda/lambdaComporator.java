package ru.job4j.lambda;

import java.util.Comparator;

public class lambdaComporator {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> left.length() - right.length();
    }
}
