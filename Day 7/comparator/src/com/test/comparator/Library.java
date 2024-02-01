package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void sortByTitle() {
        Collections.sort(books, new TitleComparator());
    }

    public void sortByAuthor() {
        Collections.sort(books, new AuthorComparator());
    }

    public void sortByYear() {
        Collections.sort(books, new YearComparator());
    }
}
