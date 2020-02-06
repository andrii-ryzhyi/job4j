package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int cursor = 0;
        int posLeft = 0;
        int posRight = 0;
        while (posLeft < left.length && posRight < right.length) {
            rsl[cursor++] = left[posLeft] < right[posRight] ? left[posLeft++] : right[posRight++];
        }
        int remainingIdx = posLeft < left.length ? posLeft : posRight;
        int[] remainingArray = posLeft < left.length ? left : right;
        while (remainingIdx < remainingArray.length) {
            rsl[cursor++] = remainingArray[remainingIdx++];
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
