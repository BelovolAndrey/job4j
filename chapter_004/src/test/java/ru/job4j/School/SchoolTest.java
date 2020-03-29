package ru.job4j.School;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SchoolTest {
    List<Student> students;

    @Before
    public void prepareList() {
        students = Arrays.asList(
                new Student(30),
                new Student(40),
                new Student(50),
                new Student(60),
                new Student(70),
                new Student(80),
                new Student(90)
        );
    }

    @Test
    public void whenGroupA() {
        Predicate<Student> combine = s -> s.getScore() >= 70 & s.getScore() <= 100;
        List<Student> out = new School().collect(students, combine);
        List<Student> expect = Arrays.asList(
                new Student(70),
                new Student(80),
                new Student(90)
        );
        assertThat(out, is(expect));
    }

    @Test
    public void whenGroupB() {
        Predicate<Student> combine = s -> s.getScore() >= 50 & s.getScore() < 70;
        List<Student> out = new School().collect(students, combine);
        List<Student> expect = Arrays.asList(
                new Student(50),
                new Student(60)
        );
        assertThat(out, is(expect));
    }

    @Test
    public void whenGroupC() {
        Predicate<Student> combine = s -> s.getScore() >= 0 & s.getScore() < 50;
        List<Student> out = new School().collect(students, combine);
        List<Student> expect = Arrays.asList(
                new Student(30),
                new Student(40)
        );
        assertThat(out, is(expect));
    }
}
