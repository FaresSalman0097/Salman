package practice;

import java.util.Scanner;

public class A16IfStatementLeapYear {
	public static void main(String[] args) {

		Scanner leapYear = new Scanner(System.in);
		System.out.println("Enter The Year:");
		int year = leapYear.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("This is leap year!!!");
		} else {
			System.out.println("This is not a leap year");
		}

	}
}
