package ru.skypro;

import java.util.Objects;

public class Book {
    private int year;
    private String name;
    private Author author;

    public Book(int year, String name, Author author) {
        this.year = year;
        this.name = name;
        this.author = author;


    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;

    }

    public void authorPrint() {
        System.out.println("Имя автора" + author.getName() + author.getSurname());
    }

    public void setYear(int year) {
        this.year = year;

    }

    @Override
    public String toString() {
        return "Book :" + year + " " + name + " " + author.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, author);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        Book book = (Book) o;
        return Objects.equals(year, book.year) && Objects.equals(name, book.name) && (author.equals(book.author));
    }
}