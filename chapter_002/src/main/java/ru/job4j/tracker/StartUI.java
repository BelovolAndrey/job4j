package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
//            int select = input.askInt("Select: ", actions.length);
//            UserAction action = actions[select];
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
//        for (int index = 0; index < actions.length; index++) {
//            System.out.println(index + ". " + actions[index].name());
//        }
        int index = 0;
        for (UserAction userAction : actions) {
            System.out.println(index + ". " + userAction.name());
            index++;
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
//        UserAction[] actions = {
//                new CreateAction(),
//                new ShowAllItemsAction(),
//                new EditItemAction(),
//                new DeleteItemAction(),
//                new FindByIdAction(),
//                new FindByNameAction(),
//        };
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new ShowAllItemsAction());
        actions.add(new EditItemAction());
        actions.add(new DeleteItemAction());
        actions.add(new FindByIdAction());
        actions.add(new FindByNameAction());
        new StartUI().init(validate, tracker, actions);
    }
}