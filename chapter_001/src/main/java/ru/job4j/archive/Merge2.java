package ru.job4j.archive;

import java.util.Arrays;

public class Merge2 {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int iter = 0;
        int tempNumber = 0;
        while (iter < rsl.length) {
            int count = 0;
            int min = 32767;
            int[] tempArrey = new int[left.length + right.length];
            System.arraycopy(left, 0, tempArrey, 0, left.length);
            System.arraycopy(right, 0, tempArrey, left.length, right.length);
            for (int i = 0; i < rsl.length; i++) {
                if (tempArrey[i] < min && tempArrey[i] >= tempNumber) {
                    min = tempArrey[i];
                }
            }
            for (int i = 0; i < rsl.length; i++) {
                if (tempArrey[i] == min) {
                    count++;
                }
            }
            for (int i = 0; i < count; i++) {
                rsl[iter] = min;
                tempNumber = min;
                iter++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge2 process = new Merge2();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
