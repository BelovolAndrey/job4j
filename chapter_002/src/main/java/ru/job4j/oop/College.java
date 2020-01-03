package ru.job4j.oop;

public class College {
    Freshman freshman = new Freshman();
    Student student = freshman;
    Object obj = freshman;
    Object objFreshman = new Freshman();
    Freshman getFreshman = (Freshman) objFreshman;
}