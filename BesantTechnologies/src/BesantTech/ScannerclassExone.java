package BesantTech;

import java.util.Scanner;

public class ScannerclassExone {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two values");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = a+b;
		System.out.println("The number is "+ c);
		}
}
