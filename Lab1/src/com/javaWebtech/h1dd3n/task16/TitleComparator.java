package com.javaWebtech.h1dd3n.task16;

import com.javaWebtech.h1dd3n.task12thru15.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}