package ru.job4j;

public class SwitchWeek {

    public static void main(String[] args) {
        System.out.println(nameOfDay(99));
    }

    public static String nameOfDay(int day) {
        String dayName;
        switch (day) {
            case 7 :
                dayName = "Воскресенье";
                break;
            case 6 :
                dayName = "Суббота";
                break;
            case 5 :
                dayName = "Пятница";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 1:
                dayName = "Понедельник";
                break;
            default:
                dayName = "Ошибка";
                break;
        }
        return dayName;
    }
}
