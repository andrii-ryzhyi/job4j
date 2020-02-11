package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book fantasy = new Book("Fantasy", 300);
        Book detective = new Book("Detective", 400);
        Book code = new Book("Clean code", 480);
        Book java = new Book("Java", 600);

        Book[] books = new Book[4];
        books[0] = fantasy;
        books[1] = detective;
        books[2] = code;
        books[3] = java;

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + books[i].getTitle() + " - " + books[i].getPages() + " pages");
        }

        Book trueStory = new Book("True Story", 380);
        books[0] = books[3];
        books[3] = trueStory;

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + books[i].getTitle() + " - " + books[i].getPages() + " pages");
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals("Clean code")) {
                System.out.println("Found: " + books[i].getTitle());
            }
        }

    }
}
