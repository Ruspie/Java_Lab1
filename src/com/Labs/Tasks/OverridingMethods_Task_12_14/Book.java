package com.Labs.Tasks.OverridingMethods_Task_12_14;

/**
 * Created by asus on 08.11.2016.
 */
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book book) {
        return isbn - book.isbn;
    }

    @Override
    public String toString(){
        return "Author: '" + author + "'; Title: '" + title + "'; Price: " + price + "; Edition: " + edition + "; ISBN: " + isbn + ";";
    }

    @Override
    public int hashCode(){
        int result = 1;
        int prime = 15;
        result = prime * result + author.length();
        result = prime * result + title.length();
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;

        if (object == null)
            return false;

        if (getClass() != object.getClass())
            return false;

        Book book = (Book)object;

        if (price != book.price)
            return false;

        if (title == null)
            return book.title.equals(null);
        else
            if (!title.equals(book.title))
                return false;

        if (author == null)
            return book.author.equals(null);
        else
            if (!author.equals(book.author))
                return false;

        if (price != book.price)
            return false;

        return true;
    }

    @Override
    public Book clone(){
        return new Book(title, author, price, isbn);
    }

}
