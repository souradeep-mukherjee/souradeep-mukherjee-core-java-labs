package com.souradeep.lab4.ex3;

public abstract class Item {

    private int idNumber;
    private String title;
    private int numberOfCopies;

    public Item(int idNumber, String title, int numberOfCopies) {
        this.idNumber = idNumber;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void checkIn() {
        numberOfCopies++;
    }

    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
        }
    }

    public void addItem(int copies) {
        numberOfCopies += copies;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ID=" + idNumber +
                ", Title=" + title +
                ", Copies=" + numberOfCopies;
    }
}