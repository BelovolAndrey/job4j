package ru.job4j.tracker;

public class EditItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item item = new Item(String.valueOf(input));
        String id = item.getId();
        boolean check = tracker.replace(id, item);
        if (check) {
            System.out.println("Элемент id: " + id + ", был изменен");
        } else {
            System.out.println("Элемент id: " + id + ", не найден");
        }
        return true;
    }
}
