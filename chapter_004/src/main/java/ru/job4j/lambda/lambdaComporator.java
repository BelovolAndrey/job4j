package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lambdaComporator {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();

        //0.2 Зона видимости в лямбда и исключения[#202764]
        // Чтобы избежать любых проблем в лямбда выражениями все переменные нужно обозначать final
        List<String> names = Arrays.asList("Petr", "Nick", "Ban");
        final StringBuilder last = new StringBuilder();
        names.forEach(
                n ->  {
                    last.ensureCapacity(0);
                    last.append(n);
                }
        );
    }
}
