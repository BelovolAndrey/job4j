package ru.job4j.convert;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        /// for-each
        for (int[] row : list) {
            for (int num : row) {
                rsl.add(num);
            }
        }
        return rsl;
    }
}