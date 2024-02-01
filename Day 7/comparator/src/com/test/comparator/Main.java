package com.test.comparator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("ISBN1", "Book Title 1", "Author A", 2001));
        library.addBook(new Book("ISBN2", "Book Title 2", "Author B", 1999));


        System.out.println("Books sorted by Title:");
        library.sortByTitle();
        library.printBooks();

        System.out.println("Books sorted by Author:");
        library.sortByAuthor();
        library.printBooks();

        System.out.println("Books sorted by Year:");
        library.sortByYear();
        library.printBooks();
    }
}
