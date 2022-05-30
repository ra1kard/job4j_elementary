package ru.job4j.array;

public class TriangleMatrix {

    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int cell = 1;
        int value = 1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[cell];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = value;
                value++;
            }
            cell++;
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
        return triangle;
    }

    public static void main(String[] args) {
        TriangleMatrix.rows(3);
    }

}
