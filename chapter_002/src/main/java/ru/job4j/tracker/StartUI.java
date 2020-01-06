package ru.job4j.tracker;

public class StartUI {
//    public static void createItem(Input input, Tracker tracker) {
//        System.out.println("=== Create a new Item ====");
//        String name = input.askStr("name");
//        Item item = new Item(name);
//        tracker.add(item);
//    }
//
//    public static void showAllItems(Tracker tracker) {
//        System.out.println("=== Show all items ====");
//        Item[] tempItems = new Item[tracker.findAll().length];
//        for (int i = 0; i < tempItems.length; i++) {
//            Item item = tempItems[i];
//            System.out.println(item);
//        }
//    }
//
//    public static void editItem(Input input, Tracker tracker) {
//        System.out.println("=== Edit item ====");
//        Item item = new Item(String.valueOf(input));
//        String id = item.getId();
//        boolean check = tracker.replace(id, item);
//        if (check) {
//            System.out.println("Элемент id: " + id + ", был изменен");
//        } else {
//            System.out.println("Элемент id: " + id + ", не найден");
//        }
//    }
//
//    public static void deleteItem(Input input, Tracker tracker) {
//        System.out.println("=== Delete item ====");
//        Item item = new Item(String.valueOf(input));
//        String id = item.getId();
//        boolean check = tracker.delete(id);
//        if (check) {
//            System.out.println("Элемент id: " + id + ", был удален");
//        } else {
//            System.out.println("Элемент id: " + id + ", не найден");
//        }
//    }
//
//    public static void findById(Input input, Tracker tracker) {
//        System.out.println("=== Find item by Id ====");
//        String id = input.askStr("Enter id:");
//        System.out.println(tracker.findById(id));
//    }
//
//    public static void findByName(Input input, Tracker tracker) {
//        System.out.println("=== Find items by name ====");
//        String name = input.askStr("Enter name:");
//        for (Item item : tracker.findByName(name)) {
//            System.out.println(item);
//        }
//    }
//
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllItemsAction(),
                new EditItemAction(),
                new DeleteItemAction(),
                new FindByIdAction(),
                new FindByNameAction(),
        };
        new StartUI().init(input, tracker, actions);
    }
}