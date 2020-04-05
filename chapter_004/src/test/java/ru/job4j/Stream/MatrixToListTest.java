package ru.job4j.Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {
    @Test
    public void MToLTest() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        List<Integer> out = new MatrixToList().matrixToList(matrix);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4);

        assertThat(out, is(expect));
    }
}