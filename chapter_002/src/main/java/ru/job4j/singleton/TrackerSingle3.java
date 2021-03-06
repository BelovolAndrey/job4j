package ru.job4j.singleton;
//Последний вариант объект класса находиться в поле внутреннего класса.

import ru.job4j.tracker.Item;

public class TrackerSingle3 {
    private TrackerSingle3() {
    }

    public static TrackerSingle3 getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingle3 INSTANCE = new TrackerSingle3();
    }

    public static void main(String[] args) {
        TrackerSingle3 tracker = TrackerSingle3.getInstance();
    }
}