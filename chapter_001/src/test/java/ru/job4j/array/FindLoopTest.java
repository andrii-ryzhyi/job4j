package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {0, 8, 3, 7, 19};
        int value = 7;
        int result = find.indexOf(input, value);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHasNot7ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {0, 8, 3, 10, 19};
        int value = 7;
        int result = find.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind5() {
        int[] input = new int[] {1, 3, 7, 0, 0, 9, 10, 7};
        int value = 9;
        int start = 3;
        int finish = 6;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = 5;
        assertThat(result, is(expected));
    }
}
