package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }

}
