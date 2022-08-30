package ru.job4j;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();         //число столбцов
        int lineCount;
        String star = "*";
        String space = " ";
        for (int i = 0; i < columnCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

}
