package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int last = array.length - 1;
        for (int i = 0; i <= (array.length - 1) / 2; i++) {
            int temp = array[i];
            array[i] = array[last];
            array[last] = temp;
            last--;
        }
        return array;
    }
}
