package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void nameOfDayIs1() {
        int value = 1;
        String result = SwitchWeek.nameOfDay(value);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);

        System.out.println("result:" + result);
        System.out.println("expected:" + expected);
    }

    @Test
    public void nameOfDayIs2() {
        int value = 2;
        String result = SwitchWeek.nameOfDay(value);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);

        System.out.println("result:" + result);
        System.out.println("expected:" + expected);
    }

    @Test
    public void nameOfDayIs3() {
        int value = 3;
        String result = SwitchWeek.nameOfDay(value);
        String expected = "Среда";
        Assert.assertEquals(expected, result);

        System.out.println("result:" + result);
        System.out.println("expected:" + expected);
    }

    @Test
    public void nameOfDayIs4() {
        int value = 4;
        String result = SwitchWeek.nameOfDay(value);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);

        System.out.println("result:" + result);
        System.out.println("expected:" + expected);
    }

    @Test
    public void nameOfDayIs5() {
        int value = 5;
        String result = SwitchWeek.nameOfDay(value);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);

        System.out.println("result:" + result);
        System.out.println("expected:" + expected);
    }

    @Test
    public void nameOfDayIs6() {
        int value = 6;
        String result = SwitchWeek.nameOfDay(value);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);

        System.out.println("result:" + result);
        System.out.println("expected:" + expected);
    }

    @Test
    public void nameOfDayIs7() {
        int value = 7;
        String result = SwitchWeek.nameOfDay(value);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);

        System.out.println("result:" + result);
        System.out.println("expected:" + expected);
    }

    @Test
    public void nameOfDayIs8() {
        int value = 8;
        String result = SwitchWeek.nameOfDay(value);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);

        System.out.println("result:" + result);
        System.out.println("expected:" + expected);
    }

}