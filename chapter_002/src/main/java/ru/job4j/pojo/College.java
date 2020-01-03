package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Иванов");
        student.setName("Иван");
        student.setPatronymic("Иванович");
        student.setGroup("Группа 3");
        student.setReceiptDate(new Date());
        System.out.println("ФИО: " + student.getSurname() + " " + student.getName() + " " + student.getPatronymic() + " Группа: " + student.getGroup() + " Дата поступления: " + student.getReceiptDate());
    }
}