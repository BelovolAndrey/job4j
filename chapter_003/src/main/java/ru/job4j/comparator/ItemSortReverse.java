package ru.job4j.comparator;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class ItemSortReverse implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        if (first.getName().compareTo(second.getName()) == -1) {
            return 1;
        } else if (first.getName().compareTo(second.getName()) == 1) {
            return -1;
        }
        return 0;
    }
}