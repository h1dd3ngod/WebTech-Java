package com.javaWebtech.h1dd3n.task16;

import com.javaWebtech.h1dd3n.task12thru15.Book;
import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int AuthorCompare = o1.getAuthor().compareTo(o2.getAuthor());
        int TitleCompare = o1.getTitle().compareTo(o2.getTitle());

        return (TitleCompare == 0) ? AuthorCompare : TitleCompare;
    }
}