package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void isEven14ThenTrue() {
        int value = 14;
        boolean result = LogicNot.isEven(value);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isPositive11ThenTrue() {
        int value = 11;
        boolean result = LogicNot.isPositive(value);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notEven9ThenTrue() {
        int value = 9;
        boolean result = LogicNot.notEven(value);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notPositiveMinus5ThenTrue() {
        int value = -5;
        boolean result = LogicNot.notPositive(value);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notEvenAndPositive5ThenTrue() {
        int value = 5;
        boolean result = LogicNot.notEvenAndPositive(value);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notEvenAndPositiveMinus5ThenFalse() {
        int value = -5;
        boolean result = LogicNot.notEvenAndPositive(value);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notEvenAndPositive4ThenFalse() {
        int value = 4;
        boolean result = LogicNot.notEvenAndPositive(value);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notEvenAndPositiveMinus2ThenFalse() {
        int value = -2;
        boolean result = LogicNot.notEvenAndPositive(value);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void evenOrNotPositiveMinus12ThenTrue() {
        int value = -12;
        boolean result = LogicNot.evenOrNotPositive(value);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void evenOrNotPositive12ThenTrue() {
        int value = 12;
        boolean result = LogicNot.evenOrNotPositive(value);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void evenOrNotPositiveMinus13ThenTrue() {
        int value = -13;
        boolean result = LogicNot.evenOrNotPositive(value);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void evenOrNotPositive13ThenFalse() {
        int value = 13;
        boolean result = LogicNot.evenOrNotPositive(value);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

}