package com.htp.collections.books.comparator;

import com.htp.collections.books.Book;

import java.util.Comparator;

public class BookByAuthorNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
