package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTest {

    @Test
    public void test() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

    @Test
    public void lettersLowerCaseWithDigits() {
        char[] input = "alpha012".toCharArray();
        char[] expect = "ALPHA".toCharArray();
        assertArrayEquals(expect, UpperCase.onlyLowCase(input));
    }

    @Test
    public void lettersLowerCaseWithDigitsWithSymbols() {
        char[] input = "alpha-12@?-".toCharArray();
        char[] expect = "ALPHA".toCharArray();
        assertArrayEquals(expect, UpperCase.onlyLowCase(input));
    }

    @Test
    public void lettersLowerCaseAndOneUpperCaseDigitsSymbolsSpace() {
        char[] input = "aLpha - 1-0!@#$5".toCharArray();
        char[] expect = "APHA".toCharArray();
        assertArrayEquals(expect, UpperCase.onlyLowCase(input));
    }

    @Test
    public void lettersLowerCaseAndTwoUpperCaseDigitsSpace() {
        char[] input = "aLpHa - 1".toCharArray();
        char[] expect = "APA".toCharArray();
        assertArrayEquals(expect, UpperCase.onlyLowCase(input));
    }

}
