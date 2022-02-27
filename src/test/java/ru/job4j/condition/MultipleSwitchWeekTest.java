package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDayIs1() {
        String value = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(value);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDayIs1Eng() {
        String value = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(value);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDayIs3() {
        String value = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(value);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDayIsError() {
        String value = "WrongWordWeek";
        int result = MultipleSwitchWeek.numberOfDay(value);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

}