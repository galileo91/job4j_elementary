package ru.job4j;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if (n == 0) {
            return 1;
        } else {
            result = result + 1;
        }
        for (int i = 0; i < n; i++) {
            result = result * (i+1);
        }
        return result;
    }
}
