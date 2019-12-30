package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Начал ехать");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Село " + count + " пассажиров");
    }

    @Override
    public int fillUp(int fuel) {
        return fuel * 60;
    }
}