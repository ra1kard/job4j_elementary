package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

}
