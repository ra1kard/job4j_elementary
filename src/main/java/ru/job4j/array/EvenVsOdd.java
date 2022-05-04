package ru.job4j.array;

public class EvenVsOdd {

    public static int whoWin(int[] players) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                countEven += players[i];
            } else {
                countOdd += players[i];
            }
        }

        if (countEven > countOdd) {
            return 1;
        } else if (countEven < countOdd) {
            return 2;
        } else {
            return 0;
        }
    }

}
