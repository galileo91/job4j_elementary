package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i > 0; i--) {

            if (number % i == 0 && number != i && i != 1 || number == 1) {
                prime = false;
            }
        }
        return prime;
    }
}
