package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(input.askStr(""));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = input.askStr("");
                Item item = new Item(name);
                tracker.add(item);
//            } else if (...) {
//             Добавить остальные действия системы по меню.
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] tempItems = new Item[tracker.findAll().length];
                for (int i = 0; i < tempItems.length; i++) {
                    Item item = tempItems[i];
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                // в данный момент метод редактирования не реализован
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                // в данный момент метод удаления не реализован
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("Введите id заявки");
                String id = input.askStr("");
                System.out.println(tracker.findById(id));
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.println("Введите имя заявки");
                String name = input.askStr("");
                for (Item item : tracker.findByName(name)) {
                    System.out.println(item);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        // добавить остальные пункты меню.
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}