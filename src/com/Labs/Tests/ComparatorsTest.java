package com.Labs.Tests;

import com.Labs.Tasks.Comparator_Task_15.Comparators;
import com.Labs.Tasks.OverridingMethods_Task_12_14.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by asus on 09.11.2016.
 */
public class ComparatorsTest {
    @Test
    public void defaultSort(){
        List<Book> actualBooks = Arrays.asList(new Book("aaa", "aaa", 10, 3), new Book("aba", "aca", 7, 2), new Book("aca", "aba", 15, 1), new Book("zzz", "bbb", 3, 0));

        List<Book> testBooks = Arrays.asList(new Book("zzz", "bbb", 3, 0), new Book("aca", "aba", 15, 1), new Book("aba", "aca", 7, 2), new Book("aaa", "aaa", 10, 3));

        Collections.sort(actualBooks);

        Assert.assertEquals(testBooks, actualBooks);
    }

    @Test
    public void authorSort(){
        List<Book> actualBooks = Arrays.asList(new Book("aaa", "aaa", 10, 3), new Book("aba", "aca", 7, 2), new Book("aca", "aba", 15, 1), new Book("zzz", "bbb", 3, 0));

        List<Book> testBooks = Arrays.asList(new Book("aaa", "aaa", 10, 3), new Book("aca", "aba", 15, 1), new Book("aba", "aca", 7, 2), new Book("zzz", "bbb", 3, 0));

        Collections.sort(actualBooks, Comparators.AuthorComparator);

        Assert.assertEquals(testBooks, actualBooks);
    }

    @Test
    public void titleSort(){
        List<Book> actualBooks = Arrays.asList(new Book("aaa", "aaa", 10, 3), new Book("aba", "aca", 7, 2), new Book("aca", "aba", 15, 1), new Book("zzz", "bbb", 3, 0));

        List<Book> testBooks = Arrays.asList(new Book("aaa", "aaa", 10, 3), new Book("aba", "aca", 7, 2), new Book("aca", "aba", 15, 1), new Book("zzz", "bbb", 3, 0));

        Collections.sort(actualBooks, Comparators.TitleComparator);

        Assert.assertEquals(testBooks, actualBooks);
    }

    @Test
    public void PriceSort(){
        List<Book> actualBooks = Arrays.asList(new Book("aaa", "aaa", 10, 3), new Book("aba", "aca", 7, 2), new Book("aca", "aba", 15, 1), new Book("zzz", "bbb", 3, 0));

        List<Book> testBooks = Arrays.asList(new Book("zzz", "bbb", 3, 0), new Book("aba", "aca", 7, 2), new Book("aaa", "aaa", 10, 3), new Book("aca", "aba", 15, 1));

        Collections.sort(actualBooks, Comparators.PriceComparator);

        Assert.assertEquals(testBooks, actualBooks);
    }

    @Test
    public void AuthorTitleSort(){
        List<Book> actualBooks = Arrays.asList(new Book("aaa", "aaa", 10, 3), new Book("aba", "aca", 7, 2), new Book("aca", "aba", 15, 1), new Book("zzz", "bbb", 3, 0), new Book("ggg", "aca", 13, 4));

        List<Book> testBooks = Arrays.asList(new Book("aaa", "aaa", 10, 3), new Book("aca", "aba", 15, 1), new Book("aba", "aca", 7, 2), new Book("ggg", "aca", 13, 4), new Book("zzz", "bbb", 3, 0));

        Collections.sort(actualBooks, Comparators.AuthorTitleComparator);

        Assert.assertEquals(testBooks, actualBooks);
    }

    @Test
    public void TitleAuthorSort(){
        List<Book> actualBooks = Arrays.asList(new Book("aaa", "zzz", 10, 3), new Book("aba", "aca", 7, 2), new Book("aca", "aba", 15, 1), new Book("zzz", "bbb", 3, 0), new Book("aaa", "aaa", 13, 4));

        List<Book> testBooks = Arrays.asList(new Book("aaa", "aaa", 13, 4), new Book("aaa", "zzz", 10, 3), new Book("aba", "aca", 7, 2), new Book("aca", "aba", 15, 1),  new Book("zzz", "bbb", 3, 0));

        Collections.sort(actualBooks, Comparators.TitleAuthorComparator);

        Assert.assertEquals(testBooks, actualBooks);
    }

    @Test
    public void AuthorTitlePrice(){
        List<Book> actualBooks = Arrays.asList(new Book("aaa", "zzz", 10, 3), new Book("aaa", "aaa", 33, 4), new Book("aca", "aba", 15, 1), new Book("zzz", "bbb", 3, 0), new Book("aaa", "aaa", 13, 4), new Book("aaa", "aaa", 11, 4));

        List<Book> testBooks = Arrays.asList(new Book("aaa", "aaa", 11, 4), new Book("aaa", "aaa", 13, 4), new Book("aaa", "aaa", 33, 4), new Book("aca", "aba", 15, 1),  new Book("zzz", "bbb", 3, 0), new Book("aaa", "zzz", 10, 3));

        Collections.sort(actualBooks, Comparators.AuthorTitlePriceComparator);

        Assert.assertEquals(testBooks, actualBooks);
    }
}