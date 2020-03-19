package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key) || person.getSurname().contains(key) || person.getAddress().contains(key) || person.getPhone().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }

    //2. В классе StartUI заменить вывод в консоль на Consumer.[#202761]
    public ArrayList<Person> find2(String key) {
//        Predicate<Person> combine = s -> s.getName().equals(key) || s.getPhone().equals(key) || s.getSurname().equals(key) || s.getAddress().equals(key);
        Predicate<Person> combineName = s -> s.getName().equals(key);
        Predicate<Person> combinePhone = s -> s.getPhone().equals(key);
        Predicate<Person> combineSurname = s -> s.getSurname().equals(key);
        Predicate<Person> combineAddress = s -> s.getAddress().equals(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combineName.or(combinePhone.or(combineSurname.or(combineAddress))).test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}