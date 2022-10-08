package task15.comparators;

import task15.entities.Book;

import java.util.Comparator;

public class BookComparatorByNameAndAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int r = o1.getTitle().compareTo(o2.getTitle());
        if (r == 0) {
            r = o1.getAuthor().compareTo(o2.getAuthor());
        }
        return r;
    }
}
