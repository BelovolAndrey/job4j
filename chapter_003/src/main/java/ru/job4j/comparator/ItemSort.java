package ru.job4j.comparator;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class ItemSort implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
