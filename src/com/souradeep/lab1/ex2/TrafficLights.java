package com.souradeep.lab1.ex2;

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Select the Light:\n1.Red\n2.Yellow\n3.Green\nEnter your choice:");//adding the legend for lights
		int c=sc.nextInt();
		sc.close();
		switch (c) {
		case 1: {
			System.out.println("STOP!");
			break;
		}
		case 2:{
			System.out.println("READY...");
			break;
		}	
		case 3:{
			System.out.println("GO!!!");
			break;
		}
		default:
			throw new IllegalArgumentException("Invalid Choice: " + c);
		}
	}

}
