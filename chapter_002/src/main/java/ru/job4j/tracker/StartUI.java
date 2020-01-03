package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("name");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] tempItems = new Item[tracker.findAll().length];
        for (int i = 0; i < tempItems.length; i++) {
            Item item = tempItems[i];
            System.out.println(item);
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        Item item = new Item(String.valueOf(input));
        String id = item.getId();
        tracker.replace(id, item);
        System.out.println("Элемент id: " + id + ", был изменен");
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        Item item = new Item(String.valueOf(input));
        String id = item.getId();
        tracker.delete(id);
        System.out.println("Элемент id: " + id + ", был удален");
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        System.out.println("Введите id заявки");
        String id = input.askStr("Enter id:");
        System.out.println(tracker.findById(id));
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        System.out.println("Введите имя заявки");
        String name = input.askStr("Enter name:");
        for (Item item : tracker.findByName(name)) {
            System.out.println(item);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(input.askStr(""));
            if (select == 0) {
                StartUI.createItem(input, tracker);
//            } else if (...) {
//             Добавить остальные действия системы по меню.
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
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