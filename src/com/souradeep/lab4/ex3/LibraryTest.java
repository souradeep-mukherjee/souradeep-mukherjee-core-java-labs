package com.souradeep.lab4.ex3;

public class LibraryTest {

    public static void main(String[] args) {

        Book book = new Book(
                101,
                "Core Java",
                5,
                "Herbert Schildt");

        JournalPaper journal = new JournalPaper(
                102,
                "AI Research",
                3,
                "Andrew Ng",
                2024);

        Video video = new Video(
                103,
                "Java Tutorial",
                2,
                120,
                "John Smith",
                "Education",
                2023);

        CD cd = new CD(
                104,
                "Greatest Hits",
                4,
                60,
                "A.R. Rahman",
                "Music");

        book.print();
        journal.print();
        video.print();
        cd.print();
    }
}