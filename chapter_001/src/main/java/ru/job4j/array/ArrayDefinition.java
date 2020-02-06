package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Today";
        names[1] = "is";
        names[2] = "Monday";
        names[3] = "!";

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
