package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrintEvenElementsTest {

    @Test
    public void whenArrayHasOddNumberOfElements() {
        String ln = System.lineSeparator();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String expected = "Элементы массива с чётными индексами, начиная с последнего: " + ln
                + 15 + ln + 13 + ln + 11 + ln + 9 + ln + 7 + ln + 5 + ln + 3 + ln + 1 + ln;
        assertEquals(expected, PrintEvenElements.printEvenInts(numbers));
    }

    @Test
    public void whenArrayHasEvenNumberOfElements() {
        String ln = System.lineSeparator();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        String expected = "Элементы массива с чётными индексами, начиная с последнего: " + ln
                + 13 + ln + 11 + ln + 9 + ln + 7 + ln + 5 + ln + 3 + ln + 1 + ln;
        assertEquals(expected, PrintEvenElements.printEvenInts(numbers));
    }

}