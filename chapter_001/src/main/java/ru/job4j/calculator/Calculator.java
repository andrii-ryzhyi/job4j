package ru.job4j.calculator;

/**
 * Class Calculate for arithmetic operations +, -, /, *.
 * @author Andrii.Ryzhyi
 * @since 03.02.2020
 * @version 1.0
 */
public class Calculator {
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }
    public static void substract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        add(1, 1);
        add(2, 2);
        div(4, 2);
        multiply(2, 1);
        substract(10, 5);
    }
}
