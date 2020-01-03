package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point pt1 = new Point(5, 3);
        Point pt2 = new Point(2, 7);
        double expected = 5;
        double out = pt1.distance(pt2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        Point pt1 = new Point(5, 3, 2);
        Point pt2 = new Point(2, 7, 2);
        double out = pt1.distance3d(pt2);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }
}
