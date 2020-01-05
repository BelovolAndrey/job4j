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
        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item != null) {
                tempItems[index] = item;
                index++;
            }
        }
        return Arrays.copyOf(tempItems, index);
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
        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item != null) {
                if (item.getName().equals(key)) {
                    tempItems[index] = item;
                    index++;
                }
            }
        }
        return Arrays.copyOf(tempItems, index);
    }

    /**
     * Метод ищет значение по id элемента отправленного параметром
     *
     * @param id элемента требующегося найти
     * @return найденный элемент
     */
    public Item findById(String id) {
        int index = indexOf(id);
        if (index >= 0) {
            return items[index];
        }
        return null;
    }

    /**
     * Замена существующего Item на новый с сохранением старого id
     *
     * @param id   поиска Item который требуется заменить
     * @param item которым будет произведена замена
     * @return возвращаемое значение успешного или нет изменения объекта
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index >= 0) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    /**
     * Метод возврата индекса Item по id
     *
     * @param id для поиска Item
     * @return возвращаемый индекс
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Удаление элемента по id и смещение масива на 1 в лево
     *
     * @param id элемента требуемого удалить
     * @return
     */
    public boolean delete(String id) {
        int index = indexOf(id);
        if (index >= 0) {
            int size = position - index;
            int start = index + 1;
            int inputFrom = index;
            items[index] = null;
            System.arraycopy(items, start, items, inputFrom, size - 1);
            items[position - 1] = null;
            position--;
            return true;
        }
        return false;
    }
}