package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {
    @Test
    public void manWeight() {
        double in = 180D;
        double expected = 92D;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void womanWeight() {
        double in = 160D;
        double expected = 57.49D;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
