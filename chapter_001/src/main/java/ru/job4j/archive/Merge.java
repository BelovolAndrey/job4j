package ru.job4j.archive;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        int iter = 0;
        while (count < rsl.length) {
            if (left.length > right.length) {
                iter = right.length;
            } else {
                iter = left.length;
            }
            for (int i = 0; i < iter; i++) {
                if (left[i] < right[i]) {
                    rsl[count] = left[i];
                    count++;
                    rsl[count] = right[i];
                    count++;
                } else {
                    rsl[count] = right[i];
                    count++;
                    rsl[count] = left[i];
                    count++;
                }
            }
            if (left.length > right.length) {
                for (int i = 0; i < left.length - right.length; i++) {
                    rsl[count] = left[i + (left.length - (left.length - right.length))];
                    count++;
                }
            } else {
                for (int i = 0; i < right.length - left.length; i++) {
                    rsl[count] = right[i + (right.length - (right.length - left.length))];
                    count++;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
