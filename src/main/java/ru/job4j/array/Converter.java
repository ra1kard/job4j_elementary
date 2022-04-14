package ru.job4j.array;

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {
        int last11 = array[array.length - 1].length;        // длина последней строки
        int last12 = array[array.length - 1][last11 - 1];   // значение последнего элемента последней строки
        //System.out.println(last12);     // 11

        int result = 0;
        int n = 0;
        while (result < last12) {
            n++;
            result = n * n;
        }
        //System.out.println(n);          // 4

        int[][] arraySecond = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                for (int k = 0; k < j + 1; k++) {
                    for (int l = 0; l < k + 1; l++) {
                        arraySecond[k][l] = array[i][j];
                    }
                }

            }
        }

        for (int i = 0; i < arraySecond.length; i++) {
            for (int j = 0; j < arraySecond[i].length; j++) {
                System.out.print(arraySecond[i][j] + " ");
            }
            System.out.println();
        }

        return arraySecond;
    }

    public static void main(String[] args) {
        /*int[][] array =     {{1},
                            {2, 3},
                            {4, 5, 6},
                            {7, 8},
                            {9}};*/

        int[][] array =     {{1},
                            {2, 3, 4},
                            {5, 6},
                            {7, 8, 9, 10, 11}};
        int[][] rsl = Converter.convertInSquareArray(array);
    }

}
