package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 20);
        Book book2 = new Book("ABC", 10);
        Book book3 = new Book("Java", 15);
        Book book4 = new Book("Maths", 30);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Название книги: " + book.getName() + " Колличество страниц: " + book.getCount());
        }
        books[0] = book4;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Название книги: " + book.getName() + " Колличество страниц: " + book.getCount());
        }
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println("Название книги: " + book.getName() + " Колличество страниц: " + book.getCount());
            }
        }
    }
}
