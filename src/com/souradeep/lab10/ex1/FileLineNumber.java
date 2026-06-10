package com.souradeep.lab10.ex1;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileLineNumber {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("sample.txt"));

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {

                System.out.println(
                        lineNumber + " " + line);

                lineNumber++;
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}