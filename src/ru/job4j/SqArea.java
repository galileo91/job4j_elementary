package ru.job4j;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(20, 5);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);
    }
}
