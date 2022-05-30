package ru.job4j.array;

public class SummingPrevious {

    public static int[] calculate(int a, int b, int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                numbers[i] = a;
            } else if (i == 1) {
                numbers[i] = b;
            } else {
                for (int j = 0; j < i; j++) {
                    numbers[i] += numbers[j];
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        return numbers;
    }

    public static void main(String[] args) {
        SummingPrevious.calculate(1, 2, 5);
    }

}
