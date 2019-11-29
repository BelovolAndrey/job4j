package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double manHight = 180;
        double expected = 92.0;
        double out = Fit.manWeight(manHight);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double womanHight = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(womanHight);
        Assert.assertEquals(expected, out, 0.01);
    }

}