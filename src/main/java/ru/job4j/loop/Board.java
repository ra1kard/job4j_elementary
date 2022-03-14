package ru.job4j.loop;

public class Board {

    public static void paint(int width, int height) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                /* условие проверки, что писать пробел или X */
                /* Выше в задании мы определили закономерность, когда нужно просто ,взять X */
                if (width + height % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }

}
