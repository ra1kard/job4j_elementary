package ru.job4j.array;

public class SumWithStopEl {

    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                break;
            } else {
                sum += data[i];
            }
        }
        if (sum % 2 == 0) {
            return sum;
        } else {
            return 0;
        }
    }

}
