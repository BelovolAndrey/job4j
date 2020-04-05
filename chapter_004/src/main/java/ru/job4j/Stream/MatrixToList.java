package ru.job4j.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public List<Integer> matrixToList(List<List<Integer>> matrix) {
        return matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
    }
}