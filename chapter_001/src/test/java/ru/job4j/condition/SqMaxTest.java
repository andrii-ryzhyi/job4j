package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenThirdMax() {
        int out = SqMax.max(6, 4, 7, 5);
        int expected = 7;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirstMax() {
        int out = SqMax.max(7, 4, 6, 5);
        int expected = 7;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSecondMax() {
        int out = SqMax.max(4, 7, 6, 5);
        int expected = 7;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFourthMax() {
        int out = SqMax.max(4, 5, 6, 7);
        int expected = 7;
        Assert.assertEquals(expected, out);
    }

}
