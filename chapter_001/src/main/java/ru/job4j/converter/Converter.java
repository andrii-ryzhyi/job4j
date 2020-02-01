package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int usd = rubleToDollar(180);
        System.out.println("180 rubles are " + usd + " usd.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in2 = 180;
        int expected2 = 3;
        int out2 = rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3. Test result : " + passed);

        int in3 = 3;
        int expected3 = 180;
        int out3 = dollarToRuble(in);
        boolean passed3 = expected3 == out3;
        System.out.println("3 usd are 180. Test result : " + passed);
    }
}
