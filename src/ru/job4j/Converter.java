package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int dollarIn = 120;
        int dollarExpected = 2;
        int dollarOut = rubleToDollar(dollarIn);
        boolean dollarPassed = dollarExpected == dollarOut;
        System.out.println("120 rubles are 2 dollar. Test result : " + dollarPassed);

        int euroIn = 140;
        int euroExpected = 2;
        int euroOut = rubleToDollar(dollarIn);
        boolean euroPassed = euroExpected == euroOut;
        System.out.println("140 rubles are 2 euro. Test result : " + euroPassed);
    }

}
