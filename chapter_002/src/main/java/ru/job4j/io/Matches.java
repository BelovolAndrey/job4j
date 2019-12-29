package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11 спичек");
        int count = 11;
        while (true) {
            System.out.println("Сейчас " + count + " спичек");
            do {
                boolean check = false;
                System.out.println("Тянет игрок №1");
                int select = Integer.valueOf(input.nextLine());
                if (count >= select) {
                    count -= select;
                    check = true;
                    if (count == 0) {
                        System.out.println("Игрок №1 Победил");
                        return;
                    }
                } else {
                    System.out.println("Вы хотите взять больше чем осталось");
                }
            } while (false);
            do {
                boolean check = false;
                System.out.println("Тянет игрок №2");
                int select = Integer.valueOf(input.nextLine());
                if (count >= select) {
                    count -= select;
                    check = true;
                    if (count == 0) {
                        System.out.println("Игрок №2 Победил");
                        return;
                    }
                } else {
                    System.out.println("Вы хотите взять больше чем осталось");
                }
            } while (false);
        }
    }
}
