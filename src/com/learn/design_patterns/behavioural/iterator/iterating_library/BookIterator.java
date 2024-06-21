package com.learn.design_patterns.behavioural.iterator.iterating_library;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator<Book> {
    List<Book> books;
    int index;

    public BookIterator(List<Book> books) {
        this.books = books;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        if(index < books.size()){
            return books.get(index++);
        }
        return null;
    }
}
