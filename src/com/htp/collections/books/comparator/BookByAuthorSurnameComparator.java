package com.htp.collections.books.comparator;

import com.htp.collections.books.Book;

import java.util.Comparator;

public class BookByAuthorSurnameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
