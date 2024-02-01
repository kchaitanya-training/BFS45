package com.test.comparator;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int year;

    public Book(String ISBN, String title, String author, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String getISBN() { return ISBN; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
