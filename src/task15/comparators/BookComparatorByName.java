package task15.comparators;

import task15.entities.Book;

import java.util.Comparator;

public class BookComparatorByName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
