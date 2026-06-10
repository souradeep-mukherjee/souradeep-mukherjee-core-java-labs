package com.souradeep.lab8.ex1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileProgram {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("source.txt");
            FileWriter writer = new FileWriter("target.txt");

            CopyDataThread thread =
                    new CopyDataThread(reader, writer);

            thread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}