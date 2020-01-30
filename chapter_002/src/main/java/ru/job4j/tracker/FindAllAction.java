package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Find all.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
//        for (Item item : tracker.findAll()) {
//            System.out.println(String.format("%s %s", item.getId(), item.getName()));
//        }
        List<Item> tempItems = tracker.findAll();
        for (Item item : tempItems) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}