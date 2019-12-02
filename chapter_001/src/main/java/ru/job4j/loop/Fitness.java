package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            if (ivan > nik) {
                month++;
                break;
            }
            month++;
        }
        return month;
    }
}
