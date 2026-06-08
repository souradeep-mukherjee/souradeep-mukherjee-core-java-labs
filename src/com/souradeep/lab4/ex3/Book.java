package com.souradeep.lab4.ex3;

public class Book extends WrittenItem {

    public Book(int idNumber, String title,
                int numberOfCopies, String author) {
        super(idNumber, title, numberOfCopies, author);
    }

    @Override
    public String toString() {
        return "Book [Author=" + getAuthor() +
                ", " + super.toString() + "]";
    }
}