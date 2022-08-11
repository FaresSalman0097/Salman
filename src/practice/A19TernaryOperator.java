package practice;

import java.util.Scanner;

public class A19TernaryOperator {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = value.nextInt();
		System.out.println("Enter value of b:");
		int b = value.nextInt();
		int result = a > b ? a : b; // instead of if else statement
		System.out.println(result);
	}
}
