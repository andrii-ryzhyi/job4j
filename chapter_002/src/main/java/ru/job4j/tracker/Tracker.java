package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Возвращает копию массива items без null элементов
     * @return Массив заявок
     */
    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            Item item  = this.items[i];
            if (item != null) {
                itemsWithoutNull[size++] = item;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    /**
     * Метод поиска заявки по имени
     * @param key имя заявки
     * @return Возвращает массив заявок, у которых совпадает name
     * с ключем поиска key
     */
    public Item[] findByName(String key) {
        Item[] found = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            Item item = this.items[i];
            if (item != null
                    && item.getName().equals(key)) {
                found[size++] = item;
            }
        }
        return Arrays.copyOf(found, size);
    }

    /**
     * Метод поиска заявки по уникальному ключу, сравнивая id с полем заявки id
     * @param id уникальное значение ключа заявки
     * @return возвращает найденную заявку. Если заявка не найдена - возвращает null.
     */
    public Item findById(String id) {
        for (int i = 0; i < this.items.length; i++) {
            Item item = this.items[i];
            if (item != null
                    && item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
