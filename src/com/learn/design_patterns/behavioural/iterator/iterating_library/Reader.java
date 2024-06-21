package com.learn.design_patterns.behavioural.iterator.iterating_library;

import java.util.Arrays;
import java.util.Iterator;

public class Reader {
    public static void main(String[] args) {
        Library library = new Library(
                Arrays.asList(
                        new Book(10, "War and Peace"),
                        new Book(20, "1984"),
                        new Book(30, "Animal Farm"),
                        new Book(40, "Crime and Punishment"),
                        new Book(50, "fahrenheit 451")
                )
        );

        Iterator<Book> bookIterator = library.iterato();
        while(bookIterator.hasNext()){
            Book book = bookIterator.next();
            System.out.println(book.getName());
        }
    }
}
