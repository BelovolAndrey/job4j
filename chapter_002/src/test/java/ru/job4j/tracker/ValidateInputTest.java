package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream stdout = System.out;

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenInvalidInput() {
//        ByteArrayOutputStream mem = new ByteArrayOutputStream();
//        PrintStream out = System.out;
//        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"one", "1"})
        );
        input.askInt("Enter");
        assertThat(
                out.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
        System.setOut(stdout);
    }

    @Test
    public void whenIllegalStateInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"3", "1"})
        );
        input.askInt("3",2);
        assertThat(
                out.toString(),
                is(String.format("Please select key from menu.%n"))
        );
    }
}