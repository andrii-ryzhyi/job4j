package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
    public static int max(int first, int second, int third) {
        return max(
                first,
                max(second, third)
        );
    }
    public static int max(int first, int second, int third, int fourth) {
        return max(
                first,
                max(second, third, fourth)
        );
    }

    public static void main(String[] args) {
        int max = Max.max(1, 2, 3, 4);
        System.out.println(max);
    }
}
