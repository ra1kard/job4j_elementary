package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    //Напишите минимум два тест-метода, один с 3 числами, другой с 5.
    @Test
    public void whenSortArrayOf5elementsToo() {
        int[] data = new int[] {15, 14, 21, 32, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 14, 15, 21, 32};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {6, 9, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 6, 9};
        Assert.assertArrayEquals(expected, result);
    }

}
