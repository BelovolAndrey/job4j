package ru.job4j.singleton;

//Singleton
//Шаблон singleton - используется для создания класса, который может содержать только один экземпляр объекта в виртуальной машине.
//Порядок загрузки элементов.
//        1. Статические поля.
//        2. Статические блоки.
//        3. Не статические блоки.
//        4. Не статические поля.
//        5. Конструктор.
public class LoadOrder {

    private static String static_field = echo("static field");

    private static final String STATIC_FINAL_FIELD = echo("static final field");

    private static final class Holder {
        private static final LoadOrder INSTANCE = new LoadOrder("static inner field");
    }

    {
        echo("not-static block");
    }

    static {
        echo("static block");
    }

    private String surname = echo("field");

    private final String name = echo("final field");

    public LoadOrder(String msg) {
        echo("constructor " + msg);
    }

    public static String echo(String text) {
        System.out.println(text);
        return text;
    }

    public static void main(String[] args) {
        LoadOrder order = new LoadOrder("main");
    }
}