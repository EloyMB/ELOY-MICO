package com.ironhack.main;

import com.google.gson.Gson;
import com.ironhack.classes.Author;
import com.ironhack.classes.Book;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> gabrielBooks = new ArrayList<>();
        gabrielBooks.add(new Book("100 años de soledad", 500));
        gabrielBooks.add(new Book("El general no tiene quien le escriba", 173));

        for (int i = 0; i < gabrielBooks.size(); i++) {
          //  System.out.println(gabrielBooks.get(i).);
            System.out.println(gabrielBooks.get(i).toString());
        }

        Author gabriel = new Author("Gabriel", "García Márquez", gabrielBooks);

        Author brandon = new Author("Brandon", "Sanderson", new ArrayList<>());

        ArrayList<Book> brandonBooks = new ArrayList<>();
        brandonBooks.add(new Book("El camino de los Reyes", 3000));
        brandonBooks.add(new Book("El imperio final", 2600));

        brandon.setPublishedBooks(brandonBooks);

        Gson gson = new Gson();
        String brandonJson = gson.toJson(brandon);
        System.out.println(brandonJson);

        Author brandonFromJson = gson.fromJson(brandonJson, Author.class);
        System.out.println(brandonFromJson.getPublishedBooks().get(1).toString());

    }
}
