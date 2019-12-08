package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        // проверить. что массив word имеет последние элементы одинаковые с post
        String someWord = new String(word);
        String checkWord = new String(post);
        String tempWord = someWord.substring(someWord.length() - checkWord.length());
        if (tempWord.equals(checkWord)) {
            result = true;
        }
        return result;
    }
}
