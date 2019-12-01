package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int chek = 5;
        int expected = 120;
        int out = Factorial.calc(chek);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int chek = 1;
        int expected = 1;
        int out = Factorial.calc(chek);
        Assert.assertEquals(expected, out);
    }
}
