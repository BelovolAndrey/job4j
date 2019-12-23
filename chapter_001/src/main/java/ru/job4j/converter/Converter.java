package ru.job4j.converter;

/**
 * Калькулятор выводит резульат операций на экран
 */
public class Converter {

    /**
     * Конвертирует рубль в евро
     *
     * @param value - значение конвертации
     * @return - возвращаемый результат
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертирует рубль в доллар
     *
     * @param value - значение конвертации
     * @return - возвращаемый результат
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертирует евро в рубль
     *
     * @param value - значение конвертации
     * @return - возвращаемый результат
     */
    public static int euroToRub(int value) {
        return value * 70;
    }

    /**
     * Конвертирует доллар в рубль
     *
     * @param value - значение конвертации
     * @return - возвращаемый результат
     */
    public static int dollarToRub(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int eroChek = 140;
        int expected = 2;
        int out = rubleToEuro(eroChek);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + euro + " euro. " + passed);
        int dollarCheck = 120;
        int outDollarCheck = rubleToDollar(dollarCheck);
        boolean passedDollar = expected == outDollarCheck;
        System.out.println("120 rubles are " + outDollarCheck + " dollar. " + passedDollar);
        int euroRubCheck = 3;
        int outEuroRubCheck = euroToRub(euroRubCheck);
        int expectedEuroRubCheck = 210;
        boolean passedEuroRubCheck = expectedEuroRubCheck == outEuroRubCheck;
        System.out.println("3 euro are " + outEuroRubCheck + " rub. " + passedEuroRubCheck);
        int dollarRubCheck = 4;
        int outDollarRubCheck = dollarToRub(dollarRubCheck);
        int expectedDollarRubCheck = 240;
        boolean passedDollarRubCheck = outDollarRubCheck == expectedDollarRubCheck;
        System.out.println("4 dollar are " + outDollarRubCheck + " rub. " + passedDollarRubCheck);
    }
}