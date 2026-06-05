package com.souradeep.lab1.ex1;

import java.util.Scanner;

public class SumofCubes {
	
	public static int cubesum(int n) {
		int s = 0;
		int d = 0;
		while(n!=0) {
			d = n%10;
			s = s+(d*d*d);
			n = n/10;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("The sum of the cubes is = "+SumofCubes.cubesum(n));
	}

}
