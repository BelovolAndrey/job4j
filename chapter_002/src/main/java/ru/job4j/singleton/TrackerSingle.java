package ru.job4j.singleton;

//2. static field. Lazy loading.
//Для того, чтобы закрыть возможность создавать экземпляр класса, нам нужно явно создать конструтор по умолчанию и присвоить ему модификатор private.
//Здесь главный момент это поле instance, которое содержит экземпляр объекта и метод getInstance().
//Метод getInstance() - при вызове метода, проверяет статическое поле instance, если поле не загружено, оно инициализирует его новосозданном объектом.
import ru.job4j.tracker.Item;

public class TrackerSingle {
    private static TrackerSingle3 instance;

    private TrackerSingle() {
    }

    public static TrackerSingle3 getInstance() {
        if (instance == null) {
//            instance = new TrackerSingle3();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}