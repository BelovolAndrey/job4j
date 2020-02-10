package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int min = Math.min(left.length(), right.length());
        int result = 0;
        int index = 0;
        while (result == 0 && index < min) {
            result = Character.compare(left.charAt(index), right.charAt(index));
            index++;
        }
        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}