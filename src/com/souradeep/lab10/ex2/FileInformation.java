package com.souradeep.lab10.ex2;

import java.io.File;
import java.util.Scanner;

public class FileInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        System.out.println("Exists: "
                + file.exists());

        System.out.println("Readable: "
                + file.canRead());

        System.out.println("Writable: "
                + file.canWrite());

        System.out.println("File: "
                + (file.isFile() ? "File" : "Directory"));

        System.out.println("Length: "
                + file.length() + " bytes");

        sc.close();
    }
}