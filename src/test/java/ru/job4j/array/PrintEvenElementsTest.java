package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrintEvenElementsTest {

    @Test
    public void whenArrayHasOddNumberOfElements() {
        String ln = System.lineSeparator();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String expected = "Элементы массива с чётными индексами, начиная с последнего: " + ln
                + 14 + ln + 12 + ln + 10 + ln + 8 + ln + 6 + ln + 4 + ln + 2 + ln;
        assertEquals(expected, PrintEvenElements.printEvenInds(numbers));
    }

    @Test
    public void whenArrayHasEvenNumberOfElements() {
        String ln = System.lineSeparator();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        String expected = "Элементы массива с чётными индексами, начиная с последнего: " + ln
                + 14 + ln + 12 + ln + 10 + ln + 8 + ln + 6 + ln + 4 + ln + 2 + ln;
        assertEquals(expected, PrintEvenElements.printEvenInds(numbers));
    }

}