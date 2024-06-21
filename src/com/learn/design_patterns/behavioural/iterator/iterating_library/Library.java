package com.learn.design_patterns.behavioural.iterator.iterating_library;

import java.util.Iterator;
import java.util.List;

public class Library {
    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Iterator<Book> iterato(){
        return new BookIterator(books);
    }
}
