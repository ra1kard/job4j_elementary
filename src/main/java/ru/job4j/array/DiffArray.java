package ru.job4j.array;

public class DiffArray {

    public static int[] diff(int[] left, int[] right) {
        int value = 0;
        int[] result = new int[left.length + right.length];

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    value++;                    //увеличиваем, если попадаем на тоже число во втором множестве
                }
            }
            if (value == 0) {                   //запишем если числа нет во втором множестве
                result[i] = left[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        return result;
    }

    public static void main(String[] args) {

        //DiffArray.diff(new int[] {1, 2}, new int[] {2});      //нули лишние

        //DiffArray.diff(new int[] {}, new int[] {});           //пусто     ОК!!!
        //DiffArray.diff(new int[] {1}, new int[] {});          //1         ОК!!!
        //DiffArray.diff(new int[] {}, new int[] {1});          //0, а должно быть пусто
        //DiffArray.diff(new int[] {1, 2, 3}, new int[] {2});   //3 не попала: 1 0 0 0, а должно быть 1 3
        DiffArray.diff(new int[] {1, 3}, new int[] {2});      //1 3 0, а должно быть 1 3
    }

}
