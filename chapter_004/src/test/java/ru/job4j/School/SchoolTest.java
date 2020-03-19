package ru.job4j.School;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        List<Student> stud = students.stream().collect(Collectors.toList());
        Predicate<Student> combine = s -> s.getScore() >= 70 & s.getScore() <= 100;
        List<Student> temp = new School().collect(students, combine);
        assertThat(temp.size(), is(3));
    }

    @Test
    public void whenGroupB() {
        List<Student> stud = students.stream().collect(Collectors.toList());
        Predicate<Student> combine = s -> s.getScore() >= 50 & s.getScore() < 70;
        List<Student> temp = new School().collect(students, combine);
        assertThat(temp.size(), is(2));
    }

    @Test
    public void whenGroupC() {
        List<Student> stud = students.stream().collect(Collectors.toList());
        Predicate<Student> combine = s -> s.getScore() >= 0 & s.getScore() < 50;
        List<Student> temp = new School().collect(students, combine);
        assertThat(temp.size(), is(2));
    }
}
