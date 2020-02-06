package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = true;
        if (finish == 1) {
            prime = false;
        }
        for (int i = 2; i <= finish / 2; i++) {
            if (finish % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
