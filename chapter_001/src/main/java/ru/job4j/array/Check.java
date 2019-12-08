package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean chek = data[0];
        for (int i = 0; i < data.length; i++) {
            if (chek != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
