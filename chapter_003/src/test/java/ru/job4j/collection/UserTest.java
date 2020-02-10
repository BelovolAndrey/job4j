package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void compareName() {
        Comparator<User> comName = new UserCompareName();
        int rsl = comName.compare(
                new User("Monk", 20),
                new User("Greg", 30)
        );
        assertThat(rsl, lessThan(7));
    }

    @Test
    public void compareNameReverse() {
        Comparator<User> comName = new UserCompareNameReverse();
        int rsl = comName.compare(
                new User("Monk", 20),
                new User("Greg", 30)
        );
        assertThat(rsl, lessThan(-1));
    }

    @Test
    public void compareAge() {
        Comparator<User> comName = new UserCompareAge();
        int rsl = comName.compare(
                new User("Monk", 20),
                new User("Greg", 30)
        );
        assertThat(rsl, is(-1));
    }

    @Test
    public void compareAgeReverse() {
        Comparator<User> comName = new UserCompareAgeReverse();
        int rsl = comName.compare(
                new User("Monk", 20),
                new User("Greg", 30)
        );
        assertThat(rsl, is(1));
    }
}