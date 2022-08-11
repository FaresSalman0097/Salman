package practice;

import java.util.Scanner;

public class A17IfElseIfStatement {
	public static void main(String[] args) {
		Scanner car = new Scanner(System.in);
		System.out.println("Please Enter 1 for Audi , 2 for Benz , 3 for Lexus , 4 for BMW");
		int model = car.nextInt();
		if (model == 1) {
			System.out.println("You have selected Audi");
		} else if (model == 2) {
			System.out.println("You have selected Benz");
		} else if (model == 3) {
			System.out.println("You have selected Lexus");
		} else if (model == 4) {
			System.out.println("You have selected BMW");
		} else {
			System.out.println("Invalid Selection");
		}
	}
}
