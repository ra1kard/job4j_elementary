package ru.job4j.array;

public class SymmetricDiff {

    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;
        int index = 0;

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {              // если есть и там и там, увеличиваем
                    count++;
                }
            }
            if (count == 0) {                           // если не повторялись, записываем
                result[index] = left[i];
                index++;
            } else {
                count = 0;
            }
        }
        int[] resultFirst = new int[index];             // в результирующий пишем без нулей
        count = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                resultFirst[count] = result[i];
                count++;
            }
        }

        int[] result2 = new int[left.length + right.length];
        count = 0;
        index = 0;

        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {              // если есть и там и там, увеличиваем
                    count++;
                }
            }
            if (count == 0) {                           // если не повторялись, записываем
                result2[index] = right[i];
                index++;
            } else {
                count = 0;
            }
        }
        int[] resultSecond = new int[index];             // в результирующий пишем без нулей
        count = 0;
        for (int i = 0; i < result2.length; i++) {
            if (result2[i] != 0) {
                resultSecond[count] = result2[i];
                count++;
            }
        }

        int[] resultGeneral = new int[resultFirst.length + resultSecond.length];        // все в итоговый массив
        count = 0;
        for (int i = 0; i < resultFirst.length; i++) {
            resultGeneral[count] = resultFirst[i];
            count++;
        }
        for (int i = 0; i < resultSecond.length; i++) {
            resultGeneral[count] = resultSecond[i];
            count++;
        }

        // печать
        for (int i = 0; i < resultGeneral.length; i++) {
            System.out.print(resultGeneral[i] + " ");
        }

        return resultGeneral;
    }

    public static void main(String[] args) {
        SymmetricDiff.diff(new int[] {}, new int[] {1});
    }

}
