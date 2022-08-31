package ru.job4j;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int lineCount = count;
        int columnCount = count;
        String star = "*";
        String space = " ";
        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (i == 0 || i == (lineCount - 1)) {
                    System.out.print(star);
                } else if (i == j) {
                    System.out.print(star);
                } else if (i + j == count - 1) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }
            }
            if (count % 2 != 0) {
                columnCount = (i < (count / 2)) ? columnCount - 1 : columnCount + 1;
            } else if (count % 2 == 0 && i == count / 2 - 1) {
                columnCount = columnCount;
            } else {
                columnCount = (i < (count / 2)) ? columnCount - 1 : columnCount + 1;
            }
            if (i != lineCount - 1) {
                System.out.println();
            }
        }
    }

}
