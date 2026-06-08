package com.souradeep.lab4.ex3;

public class Video extends MediaItem {

    private String director;
    private String genre;
    private int yearReleased;

    public Video(int idNumber, String title,
                 int numberOfCopies, int runtime,
                 String director, String genre,
                 int yearReleased) {

        super(idNumber, title, numberOfCopies, runtime);

        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "Video [Director=" + director +
                ", Genre=" + genre +
                ", Year=" + yearReleased +
                ", Runtime=" + getRuntime() +
                ", " + super.toString() + "]";
    }
}