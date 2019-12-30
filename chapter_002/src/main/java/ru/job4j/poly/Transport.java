package ru.job4j.poly;

public interface Transport {
    public void go();

    public void passengers(int count);

    public int fillUp(int fuel);
}
