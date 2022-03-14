package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int value = 5;
        int result = Factorial.calc(value);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int value = 0;
        int result = Factorial.calc(value);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

}