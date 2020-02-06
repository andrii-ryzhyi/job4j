package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; // указатель, на не null ячейку.
                while ((point < array.length - 1) && (array[point] == null)) {
                    point++;
                }
                if (point != index) {
                    array[index] = array[point];
                    array[point] = null;
                }
                // переместить первую не null ячейку
                // Здесь нужен цикл while
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
