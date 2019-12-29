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
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Находит все не null элементы и возвращает результат
     *
     * @return массив элементов
     */
    public Item[] findAll() {
        Item[] tempItems = new Item[items.length];
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                tempItems[index] = item;
                index++;
            }
        }
        tempItems = Arrays.copyOf(tempItems, index);
        return tempItems;
    }

    /**
     * Находит элемент по имени
     *
     * @param key имя элемнта который требуется найти
     * @return результат поиска
     */

    public Item[] findByName(String key) {
        Item[] tempItems = new Item[items.length];
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                if (item.getName().equals(key)) {
                    tempItems[index] = item;
                    index++;
                }
            }
        }
        return tempItems;
    }

    /**
     * Метод ищет значение по id элемента отправленного параметром
     *
     * @param id элемента требующегося найти
     * @return найденный элемент
     */
    public Item findById(String id) {
        Item item = null;
        for (int i = 0; i < items.length; i++) {
            item = items[i];
            if (item.getId().equals(id)) {
                break;
            }
        }
        return item;
    }
}