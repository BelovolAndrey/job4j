package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                Scanner input = new Scanner(System.in);
                System.out.println("Введите id заявки");
                String id = input.nextLine();
                System.out.println(tracker.findById(id));
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                Scanner input = new Scanner(System.in);
                System.out.println("Введите имя заявки");
                String name = input.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}