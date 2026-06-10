package com.souradeep.lab8.ex1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {

    private FileReader reader;
    private FileWriter writer;

    public CopyDataThread(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    @Override
    public void run() {

        try {
            int ch;
            int count = 0;

            while ((ch = reader.read()) != -1) {

                writer.write(ch);
                count++;

                if (count % 10 == 0) {
                    System.out.println("10 characters are copied");
                    Thread.sleep(5000);
                }
            }

            writer.close();
            reader.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}