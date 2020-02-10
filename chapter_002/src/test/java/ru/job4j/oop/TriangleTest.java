package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(2, 0), new Point(2, 2));
        double result = triangle.area();
        double expected = 2.0D;
        System.out.println(result);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenNotExist() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(10, 0), new Point(12, 0));
        double result = triangle.area();
        double expected = -1D;
        System.out.println(result);
        Assert.assertEquals(expected, result, 0.01);
    }
}
