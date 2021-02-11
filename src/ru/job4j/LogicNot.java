package ru.job4j;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return num < 0;
    }

    public boolean notEvenAndPositive(int num) {
        return notEven(num) && notPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        return notEven(num) || notPositive(num);
    }
}
