package com.souradeep.lab3.ex2;

import java.util.Scanner;

public class MirrorImage {

    public String getImage(String str) {
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

        return str + "|" + reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        MirrorImage obj = new MirrorImage();

        System.out.println("Mirror Image: " + obj.getImage(str));

        sc.close();
    }
}