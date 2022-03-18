package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = false;

        for (int index = number; index >= 1; index--) {
            if (number <= 1) {
                break;
            } else if (index == number && number % number == 0) {
                prime = true;
            } else if (index == 1 && number % 1 == 0) {
                prime = true;
            } else if (number % index != 0) {
                prime = true;
            } else {
                prime = false;
                break;
            }
        }
        return prime;
    }

}
