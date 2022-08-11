package BesantTech;

import java.util.Scanner;

public class ScannerClassExTwo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scn.next();
		System.out.println("Enter age:");
		int age = scn.nextInt();
		System.out.println("Enter marks:");
		int marks = scn.nextInt();
		if(marks>40) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}	
	}
}
