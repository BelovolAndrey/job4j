package ru.job4j.singleton;
//Этот вариант вариант похож на предыдущей. Основное отличие, мы сразу создаем и инициализируем объект.
import ru.job4j.tracker.Item;

public class TrackerSingle2 {
    private static final TrackerSingle2 INSTANCE = new TrackerSingle2();

    private TrackerSingle2() {
    }

    public static TrackerSingle2 getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingle3 tracker = TrackerSingle3.getInstance();
    }
}