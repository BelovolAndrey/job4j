package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item item = new Item(String.valueOf(input));
        String id = item.getId();
        boolean check = tracker.delete(id);
        if (check) {
            System.out.println("Элемент id: " + id + ", был удален");
        } else {
            System.out.println("Элемент id: " + id + ", не найден");
        }
        return true;
    }
}
