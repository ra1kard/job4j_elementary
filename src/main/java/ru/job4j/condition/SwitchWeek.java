package ru.job4j.condition;

public class SwitchWeek {

    /**
     * иная запись, как пример:
     *         switch (day) {
     *             case 1:
     *                 name = "Понедельник";
     *                 break;
     *             case 2:
     *                 name = "Вторник";
     *                 break;
     *             case 3:
     *                 name = "Среда";
     *                 break;
     *             default:
     *                 name = "Ошибка";
     *                 break;
     *         }
     * */
    public static String nameOfDay(int day) {
        String name = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Ошибка";
        };
        return name;
    }

}
