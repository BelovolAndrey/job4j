package ru.job4j.School;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    //4. Преобразование List в Map.[#202771]
    public Map<String, Student> collect2(List<Student> students) {
        return students.stream().collect(
                Collectors.toMap(e -> e.getSurname(), e -> e)
        );
    }
}