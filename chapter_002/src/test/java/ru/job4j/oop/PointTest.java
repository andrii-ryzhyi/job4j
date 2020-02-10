package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void whenExist() {
        Point point1 = new Point(1, 3, 5);
        Point point2 = new Point(7, 5, 3);
        double result = point1.distance3d(point2);
        double expected = 6.63D;
        System.out.println(result);
        Assert.assertEquals(expected, result, 0.01);
    }
}
