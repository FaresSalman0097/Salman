package practice;

import java.util.Scanner;

public class A15IfStatement {

	public static void main(String[] args) {
		Scanner mark = new Scanner(System.in);
		System.out.println("Enter  the value: ");
		int mark1 = mark.nextInt();
		if (mark1 % 2 == 0) {
			System.out.println("I AM LEGEND");
		} else {
			System.out.println("I AM NOT A LEGEND");
		}
	}
}
