package ru.job4j;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            year++;
            amount = amount + (int) (amount / 100 * percent);
            amount = amount - salary;
            if (amount <= 0) {
                break;
            }
        }
        return year;
    }
}
