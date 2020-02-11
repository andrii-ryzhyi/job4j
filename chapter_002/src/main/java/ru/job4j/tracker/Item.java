package ru.job4j.tracker;

public class Item {
    public Item(String name) {
        System.out.println("load item with param");
    }
    public Item() {
    }

    public static void main(String[] args) {
        Item item = new Item();
    }
}
