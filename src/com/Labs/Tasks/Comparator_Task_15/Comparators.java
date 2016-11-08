package com.Labs.Tasks.Comparator_Task_15;

import com.Labs.Tasks.OverridingMethods_Task_12_14.Book;

import java.util.Comparator;
import java.util.StringJoiner;

/**
 * Created by asus on 09.11.2016.
 */
public class Comparators {
    public static Comparator<Book> AuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            String firstAuthor = firstBook.getAuthor().toUpperCase();
            String secondAuthor = secondBook.getAuthor().toUpperCase();

            return firstAuthor.compareTo(secondAuthor);
        }
    };

    public static Comparator<Book> TitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            String firstTitle = firstBook.getTitle();
            String secondTitle = secondBook.getTitle();

            return firstTitle.compareTo(secondTitle);
        }
    };

    public static Comparator<Book> PriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            return firstBook.getPrice() - secondBook.getPrice();
        }
    };

    public static Comparator<Book> TitleAuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            int resultTitleCompare = Comparators.TitleComparator.compare(firstBook, secondBook);

            if(resultTitleCompare == 0)
                return Comparators.AuthorComparator.compare(firstBook, secondBook);
            return resultTitleCompare;
        }
    };

    public static Comparator<Book> AuthorTitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            int resultAuthorCompare = Comparators.AuthorComparator.compare(firstBook, secondBook);

            if (resultAuthorCompare == 0)
                return Comparators.TitleComparator.compare(firstBook, secondBook);
            return resultAuthorCompare;
        }
    };

    public static Comparator<Book> AuthorTitlePriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            int resultAuthorTitleCompare = Comparators.AuthorTitleComparator.compare(firstBook, secondBook);

            if (resultAuthorTitleCompare == 0)
                return Comparators.PriceComparator.compare(firstBook, secondBook);
            return resultAuthorTitleCompare;
        }
    };

}
