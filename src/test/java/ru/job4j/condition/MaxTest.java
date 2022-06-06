package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax50To49Then50() {
        int left = 50;
        int right = 49;
        int result = Max.max(left, right);
        int expected = 50;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax59To60Then60() {
        int left = 59;
        int right = 60;
        int result = Max.max(left, right);
        int expected = 60;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax80To80Then80() {
        int left = 80;
        int right = 80;
        int result = Max.max(left, right);
        int expected = 80;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax70To80To60Then80() {
        int first = 70;
        int second = 80;
        int third = 60;
        int result = Max.max(first, second, third);
        int expected = 80;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax70To80To60To90Then90() {
        int first = 70;
        int second = 80;
        int third = 60;
        int fourth = 90;
        int result = Max.max(first, second, third, fourth);
        int expected = 90;
        Assert.assertEquals(expected, result);
    }

}
