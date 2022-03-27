package ru.job4j.array;

public class PrintEvenElements {

    public static String printEvenInts(int[] numbers) {
        String ln = System.lineSeparator();
        String res = "Элементы массива с чётными индексами, начиная с последнего: " + ln;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                res += numbers[numbers.length - 1 - i] + ln;
                System.out.println(numbers[numbers.length - 1 - i]);
            }
        }
        return res;
    }

}
