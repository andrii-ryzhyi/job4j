package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for(int i = 0; i < size; i++) {
            int row = i + 1;
            for (int j = 0; j < size; j++) {
                int col = j + 1;
                table[i][j] = row * col;
            }
        }
        return table;
    }
}
