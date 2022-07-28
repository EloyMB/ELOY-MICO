package com.ironhack.classes;

import java.util.ArrayList;

public class Author {

    private String name;
    private String surname;
    private ArrayList<Book> publishedBooks;

    public Author(String name, String surname, ArrayList<Book> publishedBooks) {
        this.name = name;
        this.surname = surname;
        this.publishedBooks = publishedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(ArrayList<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }
}
