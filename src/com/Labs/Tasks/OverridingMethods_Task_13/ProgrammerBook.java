package com.Labs.Tasks.OverridingMethods_Task_13;

import com.Labs.Tasks.OverridingMethods_Task_12_14.Book;

/**
 * Created by asus on 08.11.2016.
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }


    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString(){
        return super.toString() + " Labguage: '" + language + "'; Level: " + level + ";";
    }

    @Override
    public int hashCode(){
        int result = 1;
        int prime = 15;
        result = prime * result + language.length();
        result = prime * result + level;
        return prime * result + super.hashCode();
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;

        if (!super.equals(object))
            return false;

        ProgrammerBook programmerBook = (ProgrammerBook)object;

        if (language == null)
            return programmerBook.language.equals(null);
        else
            if (!language.equals(programmerBook.language))
                return false;

        if (level != programmerBook.level)
            return false;

        return true;
    }
}
