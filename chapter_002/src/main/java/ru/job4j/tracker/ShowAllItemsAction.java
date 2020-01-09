package ru.job4j.tracker;

public class ShowAllItemsAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] tempItems = tracker.findAll();
        for (int i = 0; i < tempItems.length; i++) {
            Item item = tempItems[i];
            System.out.println(item);
        }
        return true;
    }
}
