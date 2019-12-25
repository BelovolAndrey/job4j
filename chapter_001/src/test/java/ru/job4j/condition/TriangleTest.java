package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(1, 1);
        Point second = new Point(1, 5);
        Point third = new Point(5, 1);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();

        assertThat(result, is(7.9999999999999964));
    }
}