package ru.job4j.stragery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PaintTest {
    // поле содержит дефолтный вывод в консоль.
    // получаем ссылку на стандартный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    // Создаем буфур для хранения вывода.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder()
                                .append("+++++++" + "\n")
                                .append("+     +" + "\n")
                                .append("+     +" + "\n")
                                .append("+++++++" + "\n")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("   +   " + "\n")
                                .append(" +   + " + "\n")
                                .append("+     +" + "\n")
                                .append("+++++++" + "\n")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}