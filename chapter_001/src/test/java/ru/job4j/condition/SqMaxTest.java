package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {

    @Test
    public void square() {
        int first = 9;
        int second = 2;
        int third = 43;
        int forth = 4;
        int expected = 43;
        int out = SqMax.max(first,second,third,forth);
        Assert.assertEquals(expected,out);
    }
}