package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        int min = 3;
        int max = 20;
        int expected = 108;
        int out = new Counter().add(min,max);
        Assert.assertEquals(expected, out);
    }
}