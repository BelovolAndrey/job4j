package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByNameActionTest {

//    @Test
//    public void findByNameTest() {
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        PrintStream def = System.out;
//        System.setOut(new PrintStream(out));
//        Tracker tracker = new Tracker();
//        Item item = new Item("some new item");
//        tracker.add(item);
//        FindByNameAction act = new FindByNameAction();
//        act.execute(new StubInput(new String[]{"some new item"}), tracker);
//        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
//                .add(item.getId() + " " + item.getName())
//                .toString();
//        assertThat(new String(out.toByteArray()), is(expect));
//        System.setOut(def);
//    }
}