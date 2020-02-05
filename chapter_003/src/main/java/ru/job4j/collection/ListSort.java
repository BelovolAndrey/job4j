package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
//сортировка по возростанию
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
//сортировка по убыванию
        List<Integer> list2 = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list2);
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
    }
}