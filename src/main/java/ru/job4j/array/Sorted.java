package ru.job4j.array;

public class Sorted {

    public static boolean isSorted(int[] array) {
        for (int index = 1; index < array.length; index++) {
            if (array[index - 1] > array[index]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 3};
        System.out.println(Sorted.isSorted(array));
    }

}
